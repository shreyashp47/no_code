package com.shop.app.modules.registerform.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shop.app.modules.registerform.`data`.model.RegisterFormModel

public class RegisterFormVM : ViewModel() {
  public val registerFormModel: MutableLiveData<RegisterFormModel> =
      MutableLiveData(RegisterFormModel())
}
