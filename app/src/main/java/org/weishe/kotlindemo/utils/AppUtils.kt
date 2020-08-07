package org.weishe.kotlindemo.utils

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import java.lang.Exception

class AppUtils private constructor() {

    companion object {
        fun getVersionName(context: Context): String {
            var versionName = ""
            try {
                val pm: PackageManager = context.packageManager
                val packageInfo: PackageInfo = pm.getPackageInfo(context.packageName, 0)
                versionName = packageInfo.versionName
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return versionName
        }
    }

}