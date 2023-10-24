package com.adminsapplication.app.modules.akun.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.adminsapplication.app.databinding.ActivityAkunBinding
import com.adminsapplication.app.modules.akun.`data`.viewmodel.AkunVM
import kotlin.String
import kotlin.Unit

class AkunActivity : BaseActivity<ActivityAkunBinding>(R.layout.activity_akun) {
  private val viewModel: AkunVM by viewModels<AkunVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.akunVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

          }
      binding.imageArrowleft.setOnClickListener {
        // TODO please, add your navigation code here
        finish()
      }
    }

    companion object {
      const val TAG: String = "AKUN_ACTIVITY"

    }
  }
