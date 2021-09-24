package com.shop.app.modules.notificationoffer.`data`.model

import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationOfferModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNotification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notification)

)
