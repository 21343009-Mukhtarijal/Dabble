package com.adminsapplication.app.modules.tambahpertanyaan.`data`.model

import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TambahpertanyaanModel(
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
  var txtRefreshPage: String? = MyApp.getInstance().resources.getString(R.string.lbl_refresh_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tips_on_getting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStartyourques: String? =
      MyApp.getInstance().resources.getString(R.string.msg_start_your_ques)
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
