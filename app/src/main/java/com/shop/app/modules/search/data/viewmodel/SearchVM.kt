package com.shop.app.modules.search.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shop.app.modules.search.`data`.model.SearchModel

public class SearchVM : ViewModel() {
  public val searchModel: MutableLiveData<SearchModel> = MutableLiveData(SearchModel())
}
