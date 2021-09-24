package com.shop.app.modules.favoriteproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityFavoriteProductBinding
import com.shop.app.modules.favoriteproduct.`data`.model.FavoriteProduct1RowModel
import com.shop.app.modules.favoriteproduct.`data`.viewmodel.FavoriteProductVM
import com.shop.app.modules.productdetail.ui.ProductDetailActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class FavoriteProductActivity :
    BaseActivity<ActivityFavoriteProductBinding>(R.layout.activity_favorite_product) {
  private val viewModel: FavoriteProductVM by viewModels<FavoriteProductVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: FavoriteProduct1RowModel
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
            FavoriteProduct1RowModel) {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.favoriteProductVM = viewModel
  }

  public companion object {
    public const val TAG: String = "FAVORITE_PRODUCT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoriteProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
