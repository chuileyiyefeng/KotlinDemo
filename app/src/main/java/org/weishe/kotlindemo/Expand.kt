package org.weishe.kotlindemo

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Activity.showMineToast(string: String) {
    Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
}

fun Context.showMineToast(string: String) {
    Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
}

fun Fragment.showMineToast(string: String) {
    Toast.makeText(this.activity, string, Toast.LENGTH_SHORT).show()
}