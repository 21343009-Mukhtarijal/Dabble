package com.adminsapplication.app.modules.jawabpertanyaantwo.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityJawabpertanyaantwoBinding
import com.adminsapplication.app.modules.jawabpertanyaantwo.`data`.viewmodel.JawabpertanyaantwoVM
import kotlin.String
import kotlin.Unit

class JawabpertanyaantwoActivity :
    BaseActivity<ActivityJawabpertanyaantwoBinding>(R.layout.activity_jawabpertanyaantwo) {
  private val viewModel: JawabpertanyaantwoVM by viewModels<JawabpertanyaantwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.jawabpertanyaantwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
    binding.imageCloseTwo.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "JAWABPERTANYAANTWO_ACTIVITY"

  }
}
