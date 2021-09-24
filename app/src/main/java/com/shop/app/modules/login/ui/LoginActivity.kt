package com.shop.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.appcomponents.di.MyApp
import com.shop.app.databinding.ActivityLoginBinding
import com.shop.app.extensions.NoInternetConnection
import com.shop.app.extensions.alert
import com.shop.app.extensions.hideKeyboard
import com.shop.app.extensions.isJSONObject
import com.shop.app.extensions.neutralButton
import com.shop.app.extensions.showProgressDialog
import com.shop.app.modules.dashboard.ui.DashboardActivity
import com.shop.app.modules.login.`data`.viewmodel.LoginVM
import com.shop.app.modules.registerform.ui.RegisterFormActivity
import com.shop.app.network.models.createuserlogin.CreateUserLoginResponse
import com.shop.app.network.resources.ErrorResponse
import com.shop.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

public class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  public override fun setUpClicks(): Unit {
    binding.linear3.setOnClickListener {

            this@LoginActivity.alert(MyApp.getInstance().getString(R.string.lbl_login),
            MyApp.getInstance().getString(R.string.msg_login_with_face)){
        neutralButton{
        }
        }
        }
    binding.txtDonTHaveAnA.setOnClickListener {

          val destIntent = RegisterFormActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.txtDonTHaveAnA.setOnClickListener {

          val destIntent = RegisterFormActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.btnSignIn.setOnClickListener {

          this@LoginActivity.hideKeyboard()
          viewModel.onClickBtnSignIn()

        }
    binding.linear2.setOnClickListener {

            this@LoginActivity.alert(MyApp.getInstance().getString(R.string.lbl_login),
            MyApp.getInstance().getString(R.string.msg_login_with_goog)){
        neutralButton{
        }
        }
        }
  }

  public override fun onInitialized(): Unit {
    binding.loginVM = viewModel
  }

  public override fun addObservers(): Unit {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@LoginActivity) {

          if(it) {

            progressDialog?.dismiss()
            progressDialog = null
            progressDialog = this@LoginActivity.showProgressDialog()

          } else {

            progressDialog?.dismiss()

          }

        }
    viewModel.createUserLoginLiveData.observe(this@LoginActivity) {

          if(it is 
          SuccessResponse
          ) {

            val response = it.getContentIfNotHandled()
            onSuccessCreateUserLogin(it)

          } else if(it is 
          ErrorResponse
          ) {

            onErrorCreateUserLogin(it.data ?:Exception())

          }

        }
  }

  private fun onSuccessCreateUserLogin(response: SuccessResponse<CreateUserLoginResponse>): Unit {
    viewModel.bindCreateUserLoginResponse(response.data)
    val destIntent = DashboardActivity.getIntent(this, null)
    destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    startActivity(destIntent)
  }

  private fun onErrorCreateUserLogin(exception: Exception): Unit {
    when(
        exception
        ) {

          is 
          NoInternetConnection
           -> {

            Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()

          }

        is HttpException -> {
          val errorBody = exception.response()?.errorBody()?.string()
          val errorObject = if (errorBody != null  && errorBody.isJSONObject())
        JSONObject(errorBody)
              else JSONObject()
          val errMessage = if(!errorObject.optString("message").isNullOrEmpty()){
          errorObject.optString("message").toString()
          }else{
           exception.response()?.message()?:""
          }
         
        this@LoginActivity.alert(MyApp.getInstance().getString(R.string.msg_something_went),errMessage){
          neutralButton{
          }
          }
        }
        }
  }

  public companion object {
    public const val TAG: String = "LOGIN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
