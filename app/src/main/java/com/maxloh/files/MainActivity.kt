package com.maxloh.files

import android.content.Intent
import android.content.ComponentName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(
            Intent()
                .setComponent(
                    ComponentName(
                        "com.android.documentsui",
                        "com.android.documentsui.files.FilesActivity"
                    )
                )
        )
        finish()
    }
}
