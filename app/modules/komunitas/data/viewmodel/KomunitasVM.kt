package com.adminsapplication.app.modules.komunitas.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.komunitas.`data`.model.KomunitasModel
import org.koin.core.KoinComponent

class KomunitasVM : ViewModel(), KoinComponent {
  val komunitasModel: MutableLiveData<KomunitasModel> = MutableLiveData(KomunitasModel())

  var navArguments: Bundle? = null
}
