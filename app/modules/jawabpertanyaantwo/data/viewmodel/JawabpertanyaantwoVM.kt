package com.adminsapplication.app.modules.jawabpertanyaantwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.jawabpertanyaantwo.`data`.model.JawabpertanyaantwoModel
import org.koin.core.KoinComponent

class JawabpertanyaantwoVM : ViewModel(), KoinComponent {
  val jawabpertanyaantwoModel: MutableLiveData<JawabpertanyaantwoModel> =
      MutableLiveData(JawabpertanyaantwoModel())

  var navArguments: Bundle? = null
}
