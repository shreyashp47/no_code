package com.shop.app.modules.splash.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivitySplashBinding
import com.shop.app.modules.login.ui.LoginActivity
import com.shop.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.String
import kotlin.Unit

public class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
  private val viewModel: SplashVM by viewModels<SplashVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.splashVM = viewModel
    val destIntent = LoginActivity.getIntent(this, null)
    startActivity(destIntent)
  }

  public companion object {
    public const val TAG: String = "SPLASH_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
