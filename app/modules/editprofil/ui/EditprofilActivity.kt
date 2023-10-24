package com.adminsapplication.app.modules.editprofil.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityEditprofilBinding
import com.adminsapplication.app.modules.editprofil.`data`.viewmodel.EditprofilVM
import kotlin.String
import kotlin.Unit

class EditprofilActivity : BaseActivity<ActivityEditprofilBinding>(R.layout.activity_editprofil) {
  private val viewModel: EditprofilVM by viewModels<EditprofilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editprofilVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDITPROFIL_ACTIVITY"

  }
}
