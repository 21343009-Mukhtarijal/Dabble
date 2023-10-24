package com.adminsapplication.app.modules.tambahpost.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityTambahpostBinding
import com.adminsapplication.app.modules.tambahpost.`data`.viewmodel.TambahpostVM
import kotlin.String
import kotlin.Unit

class TambahpostActivity : BaseActivity<ActivityTambahpostBinding>(R.layout.activity_tambahpost) {
  private val viewModel: TambahpostVM by viewModels<TambahpostVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tambahpostVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "TAMBAHPOST_ACTIVITY"

  }
}
