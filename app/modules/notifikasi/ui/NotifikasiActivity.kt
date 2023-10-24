package com.adminsapplication.app.modules.notifikasi.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityNotifikasiBinding
import com.adminsapplication.app.modules.notifikasi.`data`.viewmodel.NotifikasiVM
import kotlin.String
import kotlin.Unit

class NotifikasiActivity : BaseActivity<ActivityNotifikasiBinding>(R.layout.activity_notifikasi) {
  private val viewModel: NotifikasiVM by viewModels<NotifikasiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notifikasiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFIKASI_ACTIVITY"

  }
}
