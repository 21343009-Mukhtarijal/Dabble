package com.adminsapplication.app.modules.jawabpertanyaanone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.jawabpertanyaanone.`data`.model.JawabpertanyaanoneModel
import org.koin.core.KoinComponent

class JawabpertanyaanoneVM : ViewModel(), KoinComponent {
  val jawabpertanyaanoneModel: MutableLiveData<JawabpertanyaanoneModel> =
      MutableLiveData(JawabpertanyaanoneModel())

  var navArguments: Bundle? = null
}
