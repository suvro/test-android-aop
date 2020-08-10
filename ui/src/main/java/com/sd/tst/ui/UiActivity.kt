package com.sd.tst.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.sd.tst.ui.ui.fragment1.Fragment1
import hugo.weaving.DebugLog

class UiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ui_activity)
        if (savedInstanceState == null) {
            navigateToFragment(Fragment1.newInstance())
        }
    }

    @DebugLog
    private fun navigateToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}