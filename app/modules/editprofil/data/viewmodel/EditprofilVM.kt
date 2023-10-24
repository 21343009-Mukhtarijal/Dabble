package com.adminsapplication.app.modules.editprofil.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adminsapplication.app.modules.editprofil.`data`.model.EditprofilModel
import org.koin.core.KoinComponent

class EditprofilVM : ViewModel(), KoinComponent {
  val editprofilModel: MutableLiveData<EditprofilModel> = MutableLiveData(EditprofilModel())

  var navArguments: Bundle? = null
}
