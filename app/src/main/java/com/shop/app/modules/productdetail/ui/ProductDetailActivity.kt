package com.shop.app.modules.productdetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityProductDetailBinding
import com.shop.app.modules.cart.ui.CartActivity
import com.shop.app.modules.productdetail.`data`.model.ProductDetail1RowModel
import com.shop.app.modules.productdetail.`data`.viewmodel.ProductDetailVM
import com.shop.app.modules.reviewproduct.ui.ReviewProductActivity
import com.shop.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProductDetailActivity :
    BaseActivity<ActivityProductDetailBinding>(R.layout.activity_product_detail) {
  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  public override fun setUpClicks(): Unit {
    binding.txtSeeMore.setOnClickListener {

              val destIntent = ReviewProductActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.btnAddToCart.setOnClickListener {

              val destIntent = CartActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image1.setOnClickListener {

              val destIntent = SearchActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ProductDetail1RowModel
  ): Unit {
    when(view.id) {


            }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                                   
            RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                            object : RecyclerViewAdapter.OnItemClickListener {
                                override fun onItemClick(view:View, position:Int, item :
                ProductDetail1RowModel)
                    {
                                    onClickRecyclerView(view, position, item)
                                }
                            }
                            )
    viewModel.recyclerViewList.observe(this) {
                                recyclerViewAdapter.updateData(it)
                            }
    binding.productDetailVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
