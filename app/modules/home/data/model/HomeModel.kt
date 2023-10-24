package com.adminsapplication.app.modules.home.`data`.model

import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDABBLE: String? = MyApp.getInstance().resources.getString(R.string.lbl_dabble)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyOne: String? =
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
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_151)
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
