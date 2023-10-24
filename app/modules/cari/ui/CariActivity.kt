package com.adminsapplication.app.modules.cari.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityCariBinding
import com.adminsapplication.app.modules.cari.`data`.viewmodel.CariVM
import kotlin.String
import kotlin.Unit

class CariActivity : BaseActivity<ActivityCariBinding>(R.layout.activity_cari) {
  private val viewModel: CariVM by viewModels<CariVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cariVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CARI_ACTIVITY"

  }
}
