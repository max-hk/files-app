package com.maxloh.files

import android.content.Intent
import android.content.ComponentName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.provider.DocumentsContract

class MainActivity : AppCompatActivity() {

    val ACTION_BROWSE_DOCUMENT_ROOT = "android.provider.action.MANAGE_DOCUMENT"
    private val DOCUMENT_AUTHORITY = "com.android.externalstorage.documents"
    private val DOCUMENT_ROOT_PRIMARY_EMULATED = "primary"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val uri = DocumentsContract.buildRootUri(
            DOCUMENT_AUTHORITY,
            DOCUMENT_ROOT_PRIMARY_EMULATED
        )
        val intent = Intent(ACTION_BROWSE_DOCUMENT_ROOT)
        intent.addCategory(Intent.CATEGORY_DEFAULT)
        intent.data = uri
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }
}
