package com.shop.app.modules.productdetail.`data`.model

import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import kotlin.String

public data class ProductDetail1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFsNikeAirM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fs_nike_air_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt29943: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt53433: String? = MyApp.getInstance().resources.getString(R.string.lbl_534_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt24Off: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_off)

)