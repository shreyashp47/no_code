package com.shop.app.modules.orderdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityOrderDetailsBinding
import com.shop.app.modules.orderdetails.`data`.model.OrderDetails1RowModel
import com.shop.app.modules.orderdetails.`data`.viewmodel.OrderDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OrderDetailsActivity :
    BaseActivity<ActivityOrderDetailsBinding>(R.layout.activity_order_details) {
  private val viewModel: OrderDetailsVM by viewModels<OrderDetailsVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: OrderDetails1RowModel
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
                    override fun onItemClick(view:View, position:Int, item : OrderDetails1RowModel)
        {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.orderDetailsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ORDER_DETAILS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrderDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
