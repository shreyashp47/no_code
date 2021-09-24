package com.shop.app.modules.lailyfafebrinacard.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shop.app.modules.lailyfafebrinacard.`data`.model.LailyfaFebrinaCardModel

public class LailyfaFebrinaCardVM : ViewModel() {
  public val lailyfaFebrinaCardModel: MutableLiveData<LailyfaFebrinaCardModel> =
      MutableLiveData(LailyfaFebrinaCardModel())
}
