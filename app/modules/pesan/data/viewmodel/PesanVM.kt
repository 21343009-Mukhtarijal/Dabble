package com.adminsapplication.app.modules.pesan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.pesan.`data`.model.PesanModel
import org.koin.core.KoinComponent

class PesanVM : ViewModel(), KoinComponent {
  val pesanModel: MutableLiveData<PesanModel> = MutableLiveData(PesanModel())

  var navArguments: Bundle? = null
}
