package com.shop.app.modules.reviewproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityReviewProductBinding
import com.shop.app.modules.reviewproduct.`data`.model.ReviewProduct1RowModel
import com.shop.app.modules.reviewproduct.`data`.viewmodel.ReviewProductVM
import com.shop.app.modules.writereviewfill.ui.WriteReviewFillActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ReviewProductActivity :
    BaseActivity<ActivityReviewProductBinding>(R.layout.activity_review_product) {
  private val viewModel: ReviewProductVM by viewModels<ReviewProductVM>()

  public override fun setUpClicks(): Unit {
    binding.btnWriteReview.setOnClickListener {

      val destIntent = WriteReviewFillActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ReviewProduct1RowModel
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
        ReviewProduct1RowModel)
            {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.reviewProductVM = viewModel
  }

  public companion object {
    public const val TAG: String = "REVIEW_PRODUCT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
