package com.adminsapplication.app.modules.daftar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.daftar.`data`.model.DaftarModel
import org.koin.core.KoinComponent

class DaftarVM : ViewModel(), KoinComponent {
  val daftarModel: MutableLiveData<DaftarModel> = MutableLiveData(DaftarModel())

  var navArguments: Bundle? = null
}
