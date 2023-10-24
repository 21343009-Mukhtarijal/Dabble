package com.adminsapplication.app.modules.tambahpost.`data`.model

import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TambahpostModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEveryone: String? = MyApp.getInstance().resources.getString(R.string.lbl_everyone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreatePost: String? = MyApp.getInstance().resources.getString(R.string.lbl_create_post)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnswer: String? = MyApp.getInstance().resources.getString(R.string.lbl_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForYou: String? = MyApp.getInstance().resources.getString(R.string.lbl_for_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRequests: String? = MyApp.getInstance().resources.getString(R.string.lbl_requests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrafts: String? = MyApp.getInstance().resources.getString(R.string.lbl_drafts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdelinaSuciko: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_adelina_suciko)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_knows_indonesia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSaySomething: String? = MyApp.getInstance().resources.getString(R.string.msg_say_something)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnswerOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_answer)
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
