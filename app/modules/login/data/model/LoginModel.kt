package com.adminsapplication.app.modules.login.`data`.model

import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLOGIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLupakatasandi: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lupa_kata_sandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_belum_memiliki)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftarSekarang: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_daftar_sekarang)
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
  var etGroupNinetySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNinetySixValue: String? = null
)
