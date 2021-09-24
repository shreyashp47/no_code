package com.shop.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.shop.app.R
import com.shop.app.appcomponents.base.BaseActivity
import com.shop.app.databinding.ActivityAppNavigationBinding
import com.shop.app.modules.account.ui.AccountActivity
import com.shop.app.modules.addaddress.ui.AddAddressActivity
import com.shop.app.modules.addcard.ui.AddCardActivity
import com.shop.app.modules.address.ui.AddressActivity
import com.shop.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.shop.app.modules.cart.ui.CartActivity
import com.shop.app.modules.changepassword.ui.ChangePasswordActivity
import com.shop.app.modules.choosecreditordebitcard.ui.ChooseCreditOrDebitCardActivity
import com.shop.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import com.shop.app.modules.dashboard.ui.DashboardActivity
import com.shop.app.modules.explore.ui.ExploreActivity
import com.shop.app.modules.favoriteproduct.ui.FavoriteProductActivity
import com.shop.app.modules.filter.ui.FilterActivity
import com.shop.app.modules.lailyfafebrinacard.ui.LailyfaFebrinaCardActivity
import com.shop.app.modules.listcategory.ui.ListCategoryActivity
import com.shop.app.modules.login.ui.LoginActivity
import com.shop.app.modules.notification.ui.NotificationActivity
import com.shop.app.modules.notification2.ui.Notification2Activity
import com.shop.app.modules.notificationfeed.ui.NotificationFeedActivity
import com.shop.app.modules.notificationoffer.ui.NotificationOfferActivity
import com.shop.app.modules.offerscreen.ui.OfferScreenActivity
import com.shop.app.modules.offerscreen2.ui.OfferScreen2Activity
import com.shop.app.modules.order.ui.OrderActivity
import com.shop.app.modules.orderdetails.ui.OrderDetailsActivity
import com.shop.app.modules.productdetail.ui.ProductDetailActivity
import com.shop.app.modules.profile.ui.ProfileActivity
import com.shop.app.modules.registerform.ui.RegisterFormActivity
import com.shop.app.modules.reviewproduct.ui.ReviewProductActivity
import com.shop.app.modules.search.ui.SearchActivity
import com.shop.app.modules.searchresult.ui.SearchResultActivity
import com.shop.app.modules.searchresult2.ui.SearchResult2Activity
import com.shop.app.modules.shipto.ui.ShipToActivity
import com.shop.app.modules.shortby.ui.ShortByActivity
import com.shop.app.modules.splash.ui.SplashActivity
import com.shop.app.modules.successscreen.ui.SuccessScreenActivity
import com.shop.app.modules.writereviewfill.ui.WriteReviewFillActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linear35.setOnClickListener {

      val destIntent = AddCardActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear10.setOnClickListener {

      val destIntent = ReviewProductActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear12.setOnClickListener {

      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear31.setOnClickListener {

      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear19.setOnClickListener {

      val destIntent = SearchResult2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear15.setOnClickListener {

      val destIntent = Notification2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear17.setOnClickListener {

      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear23.setOnClickListener {

      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear34.setOnClickListener {

      val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear16.setOnClickListener {

      val destIntent = ExploreActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear28.setOnClickListener {

      val destIntent = AccountActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear6.setOnClickListener {

      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear37.setOnClickListener {

      val destIntent = AddressActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear24.setOnClickListener {

      val destIntent = ShipToActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear21.setOnClickListener {

      val destIntent = ShortByActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear29.setOnClickListener {

      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear8.setOnClickListener {

      val destIntent = FavoriteProductActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear32.setOnClickListener {

      val destIntent = OrderDetailsActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear3.setOnClickListener {

      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear30.setOnClickListener {

      val destIntent = ChangePasswordActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear36.setOnClickListener {

      val destIntent = LailyfaFebrinaCardActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear5.setOnClickListener {

      val destIntent = RegisterFormActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear26.setOnClickListener {

      val destIntent = SuccessScreenActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear4.setOnClickListener {

      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear14.setOnClickListener {

      val destIntent = NotificationFeedActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear33.setOnClickListener {

      val destIntent = AddAddressActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear22.setOnClickListener {

      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear9.setOnClickListener {

      val destIntent = ProductDetailActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear25.setOnClickListener {

      val destIntent = ChooseCreditOrDebitCardActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear11.setOnClickListener {

      val destIntent = WriteReviewFillActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear27.setOnClickListener {

      val destIntent = OfferScreen2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear18.setOnClickListener {

      val destIntent = SearchResultActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear7.setOnClickListener {

      val destIntent = OfferScreenActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear13.setOnClickListener {

      val destIntent = NotificationOfferActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear20.setOnClickListener {

      val destIntent = ListCategoryActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
