package com.maxloh.files

import android.content.ComponentName
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(Intent.ACTION_VIEW)
        intent.component = ComponentName(
            "com.google.android.documentsui",
            "com.android.documentsui.files.FilesActivity"
        )
        intent.data = Uri.parse("content://com.android.externalstorage.documents/root/primary")
        intent.flags = FLAG_ACTIVITY_NEW_TASK or FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
        finish()
    }
}
