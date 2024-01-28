package com.schiavetti.studymenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

/**
 *   See #CreateOptionsMenuActivity first
 *
 *   Besides inflating an XML menu file, it's also possible to add
 *   items on runtime.
 *   In order to do that, one should call the add() method inside
 *   onCreateOptionsMenu. Note that there are several implementations
 *   possible for the add method. The one shown below is the more complete,
 *   in which an ID, order and group can be provided.
 *
 */
class DynamicOptionsMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_options_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add(Menu.NONE, 100, Menu.NONE, R.string.activity_dynamic_options_menu_item_100)
        menu?.add(Menu.NONE, 200, Menu.NONE, R.string.activity_dynamic_options_menu_item_200)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
}
