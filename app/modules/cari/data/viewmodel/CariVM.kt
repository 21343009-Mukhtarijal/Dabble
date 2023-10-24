package com.adminsapplication.app.modules.cari.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.cari.`data`.model.CariModel
import org.koin.core.KoinComponent

class CariVM : ViewModel(), KoinComponent {
  val cariModel: MutableLiveData<CariModel> = MutableLiveData(CariModel())

  var navArguments: Bundle? = null
}
