package com.shop.app.network

import com.shop.app.network.models.createuserlogin.CreateUserLoginRequest
import com.shop.app.network.models.createuserlogin.CreateUserLoginResponse
import kotlin.String
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

public interface RetrofitServices {
  @POST("/api/user_login")
  public suspend fun createUserLogin(
    @Query("user_name") userName: String?,
    @Query("password") password: String?,
    @Query("referral_code") referralCode: String?,
    @Body createUserLoginRequest: CreateUserLoginRequest?
  ): CreateUserLoginResponse
}

public const val BASE_URL: String = "https://thetrinket.in"
