package com.adminsapplication.app.modules.draft.ui

import androidx.activity.viewModels
import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.base.BaseActivity
import com.adminsapplication.app.databinding.ActivityDraftBinding
import com.adminsapplication.app.modules.draft.`data`.viewmodel.DraftVM
import kotlin.String
import kotlin.Unit

class DraftActivity : BaseActivity<ActivityDraftBinding>(R.layout.activity_draft) {
  private val viewModel: DraftVM by viewModels<DraftVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.draftVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DRAFT_ACTIVITY"

  }
}
