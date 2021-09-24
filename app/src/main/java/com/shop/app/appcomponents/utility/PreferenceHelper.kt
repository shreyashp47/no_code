package com.shop.app.appcomponents.utility

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
import com.shop.app.R
import com.shop.app.appcomponents.di.MyApp
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class PreferenceHelper {
  private val masterKeyAlias: String = createGetMasterKey()

  private val sharedPreference: SharedPreferences = EncryptedSharedPreferences.create(
              MyApp.getInstance().resources.getString(R.string.app_name),
              masterKeyAlias,
              MyApp.getInstance().applicationContext,
              EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
              EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
          )

  public fun setUser_id(paramValue: Int?): Unit {
    with(sharedPreference.edit()) {
    this.putInt("user_id", paramValue!!)
    apply()
    }
  }

  public fun getUser_id(): Int? {
    with(sharedPreference) {
    return getInt("user_id", 0)
    }
  }

  public fun setReward_code(paramValue: String?): Unit {
    with(sharedPreference.edit()) {
    this.putString("reward_code", paramValue!!)
    apply()
    }
  }

  public fun getReward_code(): String? {
    with(sharedPreference) {
    return getString("reward_code", null)
    }
  }

  private fun createGetMasterKey(): String = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
}
