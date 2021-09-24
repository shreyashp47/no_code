package com.shop.app.modules.address.`data`.model

import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import kotlin.String

public data class Address1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPriscekila: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_priscekila)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3711SpringHil: String? =
      MyApp.getInstance().resources.getString(R.string.msg_3711_spring_hil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt991234567890: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_99_1234567890)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDelete: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)

)
