package com.adminsapplication.app.modules.startup.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityStartupBinding
import com.adminsapplication.app.modules.login.ui.LoginActivity
import com.adminsapplication.app.modules.startup.`data`.viewmodel.StartupVM
import kotlin.String
import kotlin.Unit

class StartupActivity : BaseActivity<ActivityStartupBinding>(R.layout.activity_startup) {
  private val viewModel: StartupVM by viewModels<StartupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.startupVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.linearBranding.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "STARTUP_ACTIVITY"

    }
  }
