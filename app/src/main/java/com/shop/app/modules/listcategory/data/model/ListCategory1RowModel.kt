package com.shop.app.modules.listcategory.`data`.model

import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import kotlin.String

public data class ListCategory1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)

)
