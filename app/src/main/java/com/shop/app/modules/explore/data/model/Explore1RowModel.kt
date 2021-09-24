package com.shop.app.modules.explore.`data`.model

import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtManShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shirt)

)
