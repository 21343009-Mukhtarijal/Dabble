package com.adminsapplication.app.modules.draft.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.draft.`data`.model.DraftModel
import org.koin.core.KoinComponent

class DraftVM : ViewModel(), KoinComponent {
  val draftModel: MutableLiveData<DraftModel> = MutableLiveData(DraftModel())

  var navArguments: Bundle? = null
}
