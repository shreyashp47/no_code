package com.shop.app.modules.cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityCartBinding
import com.shop.app.modules.cart.`data`.model.Cart1RowModel
import com.shop.app.modules.cart.`data`.viewmodel.CartVM
import com.shop.app.modules.notification.ui.NotificationActivity
import com.shop.app.modules.shipto.ui.ShipToActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CartActivity : BaseActivity<ActivityCartBinding>(R.layout.activity_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  public override fun setUpClicks(): Unit {
    binding.btnCheckOut.setOnClickListener {

      val destIntent = ShipToActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image.setOnClickListener {

      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Cart1RowModel
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
                        override fun onItemClick(view:View, position:Int, item : Cart1RowModel) {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.cartVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
