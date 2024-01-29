package com.schiavetti.studymenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.core.view.removeItemAt
import androidx.core.view.size

class UpdatableOptionsMenuActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_updatable_options_menu2)

        initSpinner()
        initListeners()
    }

    private fun initSpinner() {
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.activity_updatable_options_menu_quantity,
            android.R.layout.simple_spinner_item
        )

        findViewById<Spinner>(R.id.activityUpdatableOptionsMenuQuantitySpinner).apply {
            this.adapter = adapter
            setSelection(0)
        }
    }

    private fun initListeners() {
        findViewById<Button>(R.id.activityUpdatableOptionsMenuButton).setOnClickListener {
            invalidateOptionsMenu()
        }
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val requiredTotalOfItems = Integer.valueOf(
            findViewById<Spinner>(R.id.activityUpdatableOptionsMenuQuantitySpinner).selectedItem.toString()
        )

        menu?.let {
            while (it.size() != requiredTotalOfItems) {
                if (it.size() > requiredTotalOfItems) {
                    it.removeItemAt(0)
                } else {
                    it.add("Item #${it.size()}")
                }
            }
        }

        return super.onPrepareOptionsMenu(menu)
    }
}
