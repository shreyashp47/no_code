package com.shop.app.modules.account.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityAccountBinding
import com.shop.app.modules.account.`data`.model.Account1RowModel
import com.shop.app.modules.account.`data`.viewmodel.AccountVM
import com.shop.app.modules.notification.ui.NotificationActivity
import com.shop.app.modules.profile.ui.ProfileActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AccountActivity : BaseActivity<ActivityAccountBinding>(R.layout.activity_account) {
  private val viewModel: AccountVM by viewModels<AccountVM>()

  public override fun setUpClicks(): Unit {
    binding.image.setOnClickListener {

      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Account1RowModel
  ): Unit {
    when(view.id) {
    R.id.frame ->  {
      onClickRecyclerViewFrame(view, position, item)
    }


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                            RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                    object : RecyclerViewAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : Account1RowModel) {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.accountVM = viewModel
  }

  public fun onClickRecyclerViewFrame(
    view: View,
    position: Int,
    item: Account1RowModel
  ): Unit {
    when(0) {
    0 ->  {
    }


    1 ->  {
    }
    2 ->  {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    }
  }

  public companion object {
    public const val TAG: String = "ACCOUNT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
