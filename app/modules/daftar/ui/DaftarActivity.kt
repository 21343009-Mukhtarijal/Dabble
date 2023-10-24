package com.adminsapplication.app.modules.daftar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityDaftarBinding
import com.adminsapplication.app.modules.daftar.`data`.viewmodel.DaftarVM
import kotlin.String
import kotlin.Unit

class DaftarActivity : BaseActivity<ActivityDaftarBinding>(R.layout.activity_daftar) {
  private val viewModel: DaftarVM by viewModels<DaftarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.daftarVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DAFTAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DaftarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
