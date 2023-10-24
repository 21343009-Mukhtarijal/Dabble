package com.adminsapplication.app.modules.akun.`data`.model

import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AkunModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdelinaSuciko: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_adelina_suciko)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCari: String? = MyApp.getInstance().resources.getString(R.string.lbl_cari)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTanya: String? = MyApp.getInstance().resources.getString(R.string.lbl_tanya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdelinaSucikoOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_adelina_suciko)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfil: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCredentialsH: String? = MyApp.getInstance().resources.getString(R.string.msg_credentials_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddemployment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_employment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddeducationc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_education_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddlocationcr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_location_cr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_knows_indonesia2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJoinedOctober: String? =
      MyApp.getInstance().resources.getString(R.string.msg_joined_october)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnswer: String? = MyApp.getInstance().resources.getString(R.string.lbl_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfil: String? = MyApp.getInstance().resources.getString(R.string.lbl_profil)

)
