package com.shop.app.modules.reviewproduct.`data`.model

import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewProductModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt5Review: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_review)

)
