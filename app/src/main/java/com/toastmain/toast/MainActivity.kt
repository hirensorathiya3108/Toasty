package com.toastmain.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.toast.toasty.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            Toaster.simpleToast(context = applicationContext,"Simple toast")
    }
}