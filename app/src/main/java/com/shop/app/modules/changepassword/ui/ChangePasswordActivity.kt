package com.shop.app.modules.changepassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityChangePasswordBinding
import com.shop.app.modules.account.ui.AccountActivity
import com.shop.app.modules.changepassword.`data`.viewmodel.ChangePasswordVM
import kotlin.String
import kotlin.Unit

public class ChangePasswordActivity :
    BaseActivity<ActivityChangePasswordBinding>(R.layout.activity_change_password) {
  private val viewModel: ChangePasswordVM by viewModels<ChangePasswordVM>()

  public override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {

          val destIntent = AccountActivity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public override fun onInitialized(): Unit {
    binding.changePasswordVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CHANGE_PASSWORD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChangePasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
