package com.shop.app.network.models.createuserlogin

import com.google.gson.annotations.SerializedName

data class CreateUserLoginResponse(

	@field:SerializedName("success")
	val success: String? = null,

	@field:SerializedName("reward_detail")
	val rewardDetail: RewardDetail? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("user")
	val user: User? = null
)

data class RewardDetail(

	@field:SerializedName("billing_entity_id")
	val billingEntityId: Int? = null,

	@field:SerializedName("reward_corporate_id")
	val rewardCorporateId: Int? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("reward_description")
	val rewardDescription: String? = null,

	@field:SerializedName("reward_start_datetime")
	val rewardStartDatetime: String? = null,

	@field:SerializedName("reward_slug")
	val rewardSlug: String? = null,

	@field:SerializedName("reward_end_datetime")
	val rewardEndDatetime: String? = null,

	@field:SerializedName("reward_name")
	val rewardName: String? = null,

	@field:SerializedName("reward_program_logo")
	val rewardProgramLogo: String? = null,

	@field:SerializedName("reward_program_banner")
	val rewardProgramBanner: String? = null,

	@field:SerializedName("reward_is_deleted")
	val rewardIsDeleted: Int? = null,

	@field:SerializedName("trinket_billing_entity_id")
	val trinketBillingEntityId: Int? = null,

	@field:SerializedName("reward_code")
	val rewardCode: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("reward_status")
	val rewardStatus: Int? = null,

	@field:SerializedName("modified_at")
	val modifiedAt: String? = null
)

data class User(

	@field:SerializedName("gender")
	val gender: Any? = null,

	@field:SerializedName("user_name")
	val userName: Any? = null,

	@field:SerializedName("total_points")
	val totalPoints: Int? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("is_deleted")
	val isDeleted: Int? = null,

	@field:SerializedName("user_code")
	val userCode: Any? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("role_id")
	val roleId: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("remember_token")
	val rememberToken: Any? = null,

	@field:SerializedName("first_name")
	val firstName: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("last_name")
	val lastName: String? = null,

	@field:SerializedName("avatar")
	val avatar: Any? = null,

	@field:SerializedName("auth_id_tiwilo")
	val authIdTiwilo: Any? = null,

	@field:SerializedName("is_seen")
	val isSeen: Int? = null,

	@field:SerializedName("country_code")
	val countryCode: Any? = null,

	@field:SerializedName("phone_verified")
	val phoneVerified: Int? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("default_address_id")
	val defaultAddressId: Int? = null,

	@field:SerializedName("dob")
	val dob: Any? = null,

	@field:SerializedName("corporate_id")
	val corporateId: Int? = null,

	@field:SerializedName("referral_code")
	val referralCode: String? = null,

	@field:SerializedName("total_earned_points")
	val totalEarnedPoints: Int? = null,

	@field:SerializedName("status")
	val status: String? = null
)
