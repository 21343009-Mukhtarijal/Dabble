package com.adminsapplication.app.modules.jawabpertanyaanone.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityJawabpertanyaanoneBinding
import com.adminsapplication.app.modules.jawabpertanyaanone.`data`.viewmodel.JawabpertanyaanoneVM
import kotlin.String
import kotlin.Unit

class JawabpertanyaanoneActivity :
    BaseActivity<ActivityJawabpertanyaanoneBinding>(R.layout.activity_jawabpertanyaanone) {
  private val viewModel: JawabpertanyaanoneVM by viewModels<JawabpertanyaanoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.jawabpertanyaanoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "JAWABPERTANYAANONE_ACTIVITY"

  }
}
