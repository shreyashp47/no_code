package com.shop.app.modules.shortby.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shop.app.modules.shortby.`data`.model.ShortByModel

public class ShortByVM : ViewModel() {
  public val shortByModel: MutableLiveData<ShortByModel> = MutableLiveData(ShortByModel())
}
