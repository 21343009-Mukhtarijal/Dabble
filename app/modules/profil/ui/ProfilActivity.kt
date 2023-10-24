package com.adminsapplication.app.modules.profil.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityProfilBinding
import com.adminsapplication.app.modules.profil.`data`.viewmodel.ProfilVM
import kotlin.String
import kotlin.Unit

class ProfilActivity : BaseActivity<ActivityProfilBinding>(R.layout.activity_profil) {
  private val viewModel: ProfilVM by viewModels<ProfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profilVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFIL_ACTIVITY"

  }
}
