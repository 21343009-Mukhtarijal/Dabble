package com.adminsapplication.app.modules.daftar.`data`.model

import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DaftarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDAFTAR: String? = MyApp.getInstance().resources.getString(R.string.lbl_daftar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanjutkandenga: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lanjutkan_denga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNineteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEighteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventeenValue: String? = null
)
