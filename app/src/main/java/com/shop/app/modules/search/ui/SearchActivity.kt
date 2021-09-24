package com.shop.app.modules.search.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivitySearchBinding
import com.shop.app.modules.search.`data`.viewmodel.SearchVM
import com.shop.app.modules.searchresult.ui.SearchResultActivity
import kotlin.String
import kotlin.Unit

public class SearchActivity : BaseActivity<ActivitySearchBinding>(R.layout.activity_search) {
  private val viewModel: SearchVM by viewModels<SearchVM>()

  public override fun setUpClicks(): Unit {
    binding.txtNikeAirMax27.setOnClickListener {

                      val destIntent = SearchResultActivity.getIntent(this, null)
                      startActivity(destIntent)

                    }
    binding.txtNikeAirMax27.setOnClickListener {

                      val destIntent = SearchResultActivity.getIntent(this, null)
                      startActivity(destIntent)

                    }
  }

  public override fun onInitialized(): Unit {
    binding.searchVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
