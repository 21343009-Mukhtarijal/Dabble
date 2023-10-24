package com.adminsapplication.app.modules.startup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.startup.`data`.model.StartupModel
import org.koin.core.KoinComponent

class StartupVM : ViewModel(), KoinComponent {
  val startupModel: MutableLiveData<StartupModel> = MutableLiveData(StartupModel())

  var navArguments: Bundle? = null
}
