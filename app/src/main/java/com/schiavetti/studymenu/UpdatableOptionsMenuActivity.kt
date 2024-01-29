package com.schiavetti.studymenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

/**
 *   There are times where updating the menu items during
 *   runtime becomes necessary. Since the menu is created
 *   only when the activity is launched, a different
 *   approach should be taken in order to achieve this.
 *
 *   By calling invalidateOptionsMenu(), the system
 *   will understand that the menu needs to be rebuilt,
 *   and so it's going to call onPrepareOptionsMenu() to do
 *   that.
 *   Differently from a simple menu usage that calls the
 *   standard onCreateOptionsMenu(), the expected method
 *   to be implemented in this runtime-update scenario,
 *   should be onPrepareOptionsMenu(), according to
 *   documentation.
 *
 */
class UpdatableOptionsMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_updatable_options_menu)
        initListeners()
    }

    private fun initListeners() {
        findViewById<Button>(R.id.activityUpdatableOptionsMenuButton).setOnClickListener {
            invalidateOptionsMenu()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        println("Kfk: onCreateOptionsMenu")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        println("Kfk: onPrepareOptionsMenu")

        menuInflater.inflate(
            listOf(R.menu.menu, R.menu.menu2).random(),
            menu
        )
        return super.onPrepareOptionsMenu(menu)
    }
}
