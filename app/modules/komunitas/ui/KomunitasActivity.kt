package com.adminsapplication.app.modules.komunitas.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityKomunitasBinding
import com.adminsapplication.app.modules.komunitas.`data`.viewmodel.KomunitasVM
import kotlin.String
import kotlin.Unit

class KomunitasActivity : BaseActivity<ActivityKomunitasBinding>(R.layout.activity_komunitas) {
  private val viewModel: KomunitasVM by viewModels<KomunitasVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.komunitasVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "KOMUNITAS_ACTIVITY"

  }
}
