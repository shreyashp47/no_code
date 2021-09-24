package com.shop.app.modules.searchresult.`data`.model

import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchResultModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt145Result: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_145_result)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManShoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shoes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etNikeAirMaxValue: String? = null
)
