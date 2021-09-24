package com.shop.app.modules.offerscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityOfferScreenBinding
import com.shop.app.modules.offerscreen.`data`.model.OfferScreen1RowModel
import com.shop.app.modules.offerscreen.`data`.viewmodel.OfferScreenVM
import com.shop.app.modules.productdetail.ui.ProductDetailActivity
import com.shop.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OfferScreenActivity :
    BaseActivity<ActivityOfferScreenBinding>(R.layout.activity_offer_screen) {
  private val viewModel: OfferScreenVM by viewModels<OfferScreenVM>()

  public override fun setUpClicks(): Unit {
    binding.image1.setOnClickListener {

              val destIntent = SearchActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: OfferScreen1RowModel
  ): Unit {
    when(view.id) {
            R.id.linear ->  {
              val destIntent = ProductDetailActivity.getIntent(this, null)
              startActivity(destIntent)
            }


            }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                            RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                    object : RecyclerViewAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item :
        OfferScreen1RowModel) {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.offerScreenVM = viewModel
  }

  public companion object {
    public const val TAG: String = "OFFER_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OfferScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
