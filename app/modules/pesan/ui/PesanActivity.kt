package com.adminsapplication.app.modules.pesan.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityPesanBinding
import com.adminsapplication.app.modules.pesan.`data`.viewmodel.PesanVM
import kotlin.String
import kotlin.Unit

class PesanActivity : BaseActivity<ActivityPesanBinding>(R.layout.activity_pesan) {
  private val viewModel: PesanVM by viewModels<PesanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pesanVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PESAN_ACTIVITY"

  }
}
