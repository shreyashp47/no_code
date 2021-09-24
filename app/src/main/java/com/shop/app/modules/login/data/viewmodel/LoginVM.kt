package com.shop.app.modules.login.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shop.app.appcomponents.utility.PreferenceHelper
import com.shop.app.modules.login.`data`.model.LoginModel
import com.shop.app.network.models.createuserlogin.CreateUserLoginRequest
import com.shop.app.network.models.createuserlogin.CreateUserLoginResponse
import com.shop.app.network.repository.NetworkRepository
import com.shop.app.network.resources.Response
import kotlin.Boolean
import kotlin.Unit
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

public class LoginVM : ViewModel(), KoinComponent {
  public val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())

  public val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  public val createUserLoginLiveData: MutableLiveData<Response<CreateUserLoginResponse>> =
      MutableLiveData<Response<CreateUserLoginResponse>>()

  private val prefs: PreferenceHelper by inject()

  public fun onClickBtnSignIn(): Unit {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createUserLoginLiveData.postValue(networkRepository.createUserLogin(userName =
          loginModel.value?.etYourEmailValue,
          password = loginModel.value?.etPasswordValue,
          referralCode = loginModel.value?.etSignInToContValue,
          createUserLoginRequest = CreateUserLoginRequest()))
      progressLiveData.postValue(false)
    }
  }

  public fun bindCreateUserLoginResponse(responseData: CreateUserLoginResponse): Unit {
    val loginModelValue = loginModel.value ?:LoginModel()
    prefs.setUser_id(responseData.user?.id)
    prefs.setReward_code(responseData.rewardDetail?.rewardCode)
    loginModel.value = loginModelValue
  }
}
