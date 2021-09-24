package com.shop.app.modules.profile.`data`.model

import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDominicOvo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dominic_ovo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDominicOvo1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dominic_ovo1)

)
