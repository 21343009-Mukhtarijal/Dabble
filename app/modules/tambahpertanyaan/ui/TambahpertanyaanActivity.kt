package com.adminsapplication.app.modules.tambahpertanyaan.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityTambahpertanyaanBinding
import com.adminsapplication.app.modules.tambahpertanyaan.`data`.viewmodel.TambahpertanyaanVM
import kotlin.String
import kotlin.Unit

class TambahpertanyaanActivity :
    BaseActivity<ActivityTambahpertanyaanBinding>(R.layout.activity_tambahpertanyaan) {
  private val viewModel: TambahpertanyaanVM by viewModels<TambahpertanyaanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tambahpertanyaanVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TAMBAHPERTANYAAN_ACTIVITY"

  }
}
