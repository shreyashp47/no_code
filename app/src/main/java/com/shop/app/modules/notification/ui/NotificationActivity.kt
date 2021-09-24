package com.shop.app.modules.notification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityNotificationBinding
import com.shop.app.modules.notification.`data`.model.Notification1RowModel
import com.shop.app.modules.notification.`data`.viewmodel.NotificationVM
import com.shop.app.modules.notification2.ui.Notification2Activity
import com.shop.app.modules.notificationfeed.ui.NotificationFeedActivity
import com.shop.app.modules.notificationoffer.ui.NotificationOfferActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationActivity :
    BaseActivity<ActivityNotificationBinding>(R.layout.activity_notification) {
  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Notification1RowModel
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
                                        override fun onItemClick(view:View, position:Int, item :
                        Notification1RowModel)
                            {
                                            onClickRecyclerView(view, position, item)
                                        }
                                    }
                                    )
    viewModel.recyclerViewList.observe(this) {
                                        recyclerViewAdapter.updateData(it)
                                    }
    binding.notificationVM = viewModel
  }

  public fun onClickRecyclerViewFrame(
    view: View,
    position: Int,
    item: Notification1RowModel
  ): Unit {
    when(0) {
                            0 ->  {
                              val destIntent = Notification2Activity.getIntent(this, null)
                              startActivity(destIntent)
                            }


                            1 ->  {
                              val destIntent = NotificationFeedActivity.getIntent(this, null)
                              startActivity(destIntent)
                            }
                            2 ->  {
                              val destIntent = NotificationOfferActivity.getIntent(this, null)
                              startActivity(destIntent)
                            }
                            }
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
