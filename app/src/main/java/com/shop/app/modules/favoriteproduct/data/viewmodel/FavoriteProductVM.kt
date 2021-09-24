package com.shop.app.modules.favoriteproduct.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shop.app.modules.favoriteproduct.`data`.model.FavoriteProduct1RowModel
import com.shop.app.modules.favoriteproduct.`data`.model.FavoriteProductModel
import kotlin.collections.MutableList

public class FavoriteProductVM : ViewModel() {
  public val favoriteProductModel: MutableLiveData<FavoriteProductModel> =
      MutableLiveData(FavoriteProductModel())

  public val recyclerViewList: MutableLiveData<MutableList<FavoriteProduct1RowModel>> =
      MutableLiveData(mutableListOf())
}
