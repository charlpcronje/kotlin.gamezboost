package com.gamezboost

import android.app.AlertDialog
import android.content.Context
import android.view.View
import android.widget.Toast

data class Data(val context: Context) {

    var view: HashMap<String, View> = hashMapOf("" to View(App.applicationContext))
    var toast: HashMap<String, Toast> = hashMapOf("" to Toast(App.applicationContext))
    var dialogBuilder: HashMap<String, AlertDialog.Builder> = hashMapOf("" to AlertDialog.Builder(App.applicationContext))
    var alertDialog: HashMap<String, AlertDialog> = hashMapOf("test" to AlertDialog(App.applicationContext) {

    })

}