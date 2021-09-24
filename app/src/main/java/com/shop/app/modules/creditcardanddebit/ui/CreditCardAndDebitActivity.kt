package com.shop.app.modules.creditcardanddebit.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityCreditCardAndDebitBinding
import com.shop.app.modules.addcard.ui.AddCardActivity
import com.shop.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebit1RowModel
import com.shop.app.modules.creditcardanddebit.`data`.viewmodel.CreditCardAndDebitVM
import com.shop.app.modules.lailyfafebrinacard.ui.LailyfaFebrinaCardActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CreditCardAndDebitActivity :
    BaseActivity<ActivityCreditCardAndDebitBinding>(R.layout.activity_credit_card_and_debit) {
  private val viewModel: CreditCardAndDebitVM by viewModels<CreditCardAndDebitVM>()

  public override fun setUpClicks(): Unit {
    binding.btnAddCard.setOnClickListener {

              val destIntent = AddCardActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: CreditCardAndDebit1RowModel
  ): Unit {
    when(view.id) {
            R.id.frame1 ->  {
              val destIntent = LailyfaFebrinaCardActivity.getIntent(this, null)
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
                    CreditCardAndDebit1RowModel) {
                                onClickRecyclerView(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerViewList.observe(this) {
                            recyclerViewAdapter.updateData(it)
                        }
    binding.creditCardAndDebitVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CREDIT_CARD_AND_DEBIT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreditCardAndDebitActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
