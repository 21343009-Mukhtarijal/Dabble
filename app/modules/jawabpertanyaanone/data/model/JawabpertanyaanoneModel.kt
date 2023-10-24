package com.adminsapplication.app.modules.jawabpertanyaanone.`data`.model

import com.adminsapplication.app.R
import com.adminsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class JawabpertanyaanoneModel(
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
  var txtQuestionsfory: String? =
      MyApp.getInstance().resources.getString(R.string.msg_questions_for_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWherecanIfin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_where_can_i_fin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt100answerLa: String? = MyApp.getInstance().resources.getString(R.string.msg_100_answer_la)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnswerOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollow: String? = MyApp.getInstance().resources.getString(R.string.lbl_follow)
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
