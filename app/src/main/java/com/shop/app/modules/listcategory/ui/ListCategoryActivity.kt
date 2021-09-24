package com.shop.app.modules.listcategory.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityListCategoryBinding
import com.shop.app.modules.listcategory.`data`.model.ListCategory1RowModel
import com.shop.app.modules.listcategory.`data`.viewmodel.ListCategoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ListCategoryActivity :
    BaseActivity<ActivityListCategoryBinding>(R.layout.activity_list_category) {
  private val viewModel: ListCategoryVM by viewModels<ListCategoryVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ListCategory1RowModel
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
        ListCategory1RowModel)
            {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.listCategoryVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LIST_CATEGORY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ListCategoryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
