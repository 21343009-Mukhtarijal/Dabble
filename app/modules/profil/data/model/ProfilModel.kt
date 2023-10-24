package com.adminsapplication.app.modules.profil.`data`.model

import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfilModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDABBLE: String? = MyApp.getInstance().resources.getString(R.string.lbl_dabble)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatdoyouwan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_do_you_wan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAsk: String? = MyApp.getInstance().resources.getString(R.string.lbl_ask)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnswer: String? = MyApp.getInstance().resources.getString(R.string.lbl_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPost: String? = MyApp.getInstance().resources.getString(R.string.lbl_post)
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
  var txtAboutUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourcontens: String? = MyApp.getInstance().resources.getString(R.string.msg_your_contens)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookmarks: String? = MyApp.getInstance().resources.getString(R.string.lbl_bookmarks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrafts: String? = MyApp.getInstance().resources.getString(R.string.lbl_drafts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessage: String? = MyApp.getInstance().resources.getString(R.string.lbl_message)
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
