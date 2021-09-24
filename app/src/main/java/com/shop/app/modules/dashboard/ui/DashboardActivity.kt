package com.shop.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityDashboardBinding
import com.shop.app.modules.dashboard.`data`.model.Dashboard1RowModel
import com.shop.app.modules.dashboard.`data`.model.Dashboard2RowModel
import com.shop.app.modules.dashboard.`data`.model.Dashboard3RowModel
import com.shop.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.shop.app.modules.favoriteproduct.ui.FavoriteProductActivity
import com.shop.app.modules.listcategory.ui.ListCategoryActivity
import com.shop.app.modules.notification.ui.NotificationActivity
import com.shop.app.modules.offerscreen.ui.OfferScreenActivity
import com.shop.app.modules.productdetail.ui.ProductDetailActivity
import com.shop.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard)
    {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  public override fun setUpClicks(): Unit {
    binding.image2.setOnClickListener {

          val destIntent = NotificationActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.txtSearchProduct.setOnClickListener {

          val destIntent = SearchActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.image1.setOnClickListener {

          val destIntent = FavoriteProductActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.txtMoreCategory.setOnClickListener {

          val destIntent = ListCategoryActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.linear14.setOnClickListener {

          val destIntent = OfferScreenActivity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Dashboard1RowModel
  ): Unit {
    when(view.id) {
        R.id.linear1 ->  {
          val destIntent = ProductDetailActivity.getIntent(this, null)
          startActivity(destIntent)
        }


        }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Dashboard2RowModel
  ): Unit {
    when(view.id) {


        }
  }

  public fun onClickRecyclerView2(
    view: View,
    position: Int,
    item: Dashboard3RowModel
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
        Dashboard1RowModel)
            {
                                onClickRecyclerView(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerViewList.observe(this) {
                            recyclerViewAdapter.updateData(it)
                        }
    val recyclerView1Adapter =
                               
        RecyclerView1Adapter(viewModel.recyclerView1List.value?:mutableListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
                        object : RecyclerView1Adapter.OnItemClickListener {
                            override fun onItemClick(view:View, position:Int, item :
        Dashboard2RowModel)
            {
                                onClickRecyclerView1(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerView1List.observe(this) {
                            recyclerView1Adapter.updateData(it)
                        }
    val recyclerView2Adapter =
                               
        RecyclerView2Adapter(viewModel.recyclerView2List.value?:mutableListOf())
    binding.recyclerView2.adapter = recyclerView2Adapter
    recyclerView2Adapter.setOnItemClickListener(
                        object : RecyclerView2Adapter.OnItemClickListener {
                            override fun onItemClick(view:View, position:Int, item :
        Dashboard3RowModel)
            {
                                onClickRecyclerView2(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerView2List.observe(this) {
                            recyclerView2Adapter.updateData(it)
                        }
    binding.dashboardVM = viewModel
  }

  public companion object {
    public const val TAG: String = "DASHBOARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
