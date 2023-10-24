package com.adminsapplication.app.modules.editprofil.`data`.model

import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditprofilModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfil: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profil)
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
  var txtEditProfilOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditName: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfilecr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_profile_cr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditbio: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_bio)
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
