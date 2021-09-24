package com.shop.app.modules.shipto.`data`.model

import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import kotlin.String

public data class ShipToModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtShipTo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ship_to)

)
