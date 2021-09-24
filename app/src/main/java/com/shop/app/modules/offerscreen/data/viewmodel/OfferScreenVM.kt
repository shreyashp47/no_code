package com.shop.app.modules.offerscreen.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shop.app.modules.offerscreen.`data`.model.OfferScreen1RowModel
import com.shop.app.modules.offerscreen.`data`.model.OfferScreenModel
import kotlin.collections.MutableList

public class OfferScreenVM : ViewModel() {
  public val offerScreenModel: MutableLiveData<OfferScreenModel> =
      MutableLiveData(OfferScreenModel())

  public val recyclerViewList: MutableLiveData<MutableList<OfferScreen1RowModel>> =
      MutableLiveData(mutableListOf())
}
