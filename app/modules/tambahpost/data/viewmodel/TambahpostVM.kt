package com.adminsapplication.app.modules.tambahpost.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.tambahpost.`data`.model.TambahpostModel
import org.koin.core.KoinComponent

class TambahpostVM : ViewModel(), KoinComponent {
  val tambahpostModel: MutableLiveData<TambahpostModel> = MutableLiveData(TambahpostModel())

  var navArguments: Bundle? = null
}
