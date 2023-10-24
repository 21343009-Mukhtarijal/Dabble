package com.adminsapplication.app.modules.notifikasi.`data`.model

import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotifikasiModel(
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationsOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllNotificatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_notificatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationsTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupNine: String? = MyApp.getInstance().resources.getString(R.string.msg_all_notificatio2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_stories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_questions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_spaces)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_people_updates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFour: String? = MyApp.getInstance().resources.getString(R.string.msg_comments_and_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_contens)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_announcements)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessage: String? = MyApp.getInstance().resources.getString(R.string.lbl_message)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationsThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfilOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profil)

)
