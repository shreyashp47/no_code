package com.shop.app.network.repository

import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import com.shop.app.extensions.NoInternetConnection
import com.shop.app.extensions.isOnline
import com.shop.app.network.RetrofitServices
import com.shop.app.network.models.createuserlogin.CreateUserLoginRequest
import com.shop.app.network.models.createuserlogin.CreateUserLoginResponse
import com.shop.app.network.resources.ErrorResponse
import com.shop.app.network.resources.Response
import com.shop.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import org.koin.core.KoinComponent
import org.koin.core.inject

public class NetworkRepository : KoinComponent {
  private val retrofitServices: RetrofitServices by inject()

  private val errorMessage: String = "Something went wrong."

  public suspend fun createUserLogin(
    userName: String?,
    password: String?,
    referralCode: String?,
    createUserLoginRequest: CreateUserLoginRequest?
  ): Response<CreateUserLoginResponse> = try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.createUserLogin(userName, password, referralCode,
          createUserLoginRequest))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  }
  catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }
}
