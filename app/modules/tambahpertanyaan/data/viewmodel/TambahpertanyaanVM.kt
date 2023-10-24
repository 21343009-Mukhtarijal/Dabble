package com.adminsapplication.app.modules.tambahpertanyaan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.tambahpertanyaan.`data`.model.TambahpertanyaanModel
import org.koin.core.KoinComponent

class TambahpertanyaanVM : ViewModel(), KoinComponent {
  val tambahpertanyaanModel: MutableLiveData<TambahpertanyaanModel> =
      MutableLiveData(TambahpertanyaanModel())

  var navArguments: Bundle? = null
}
