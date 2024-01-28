package com.schiavetti.studymenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

/**
 *   Simple example of implementing an option menu.
 *   It displays two different menu items inside the Toolbar,
 *   all of them containing your own listener action.
 *
 *   In order to create a menu, one should create menu XML file
 *   under res/menu. This XML describes the menu tree, its titles,
 *   icons and other properties.
 *
 *   Second step is to inflate the menu XML file inside the menu object.
 *   This should happen inside onCreateOptionsMenu(), a native method for
 *   Activity and Fragment classes.
 *   The menu should be inflated by calling menuInflater.inflate and passing
 *   the menu resource ID as the first parameter. The second parameter is
 *   the menu itself, received from the native method.
 *
 *
 *   To handle click actions on menu items, onOptionsItemSelected
 *   should be overriden. It's a native method for activities and
 *   fragments, which provides the MenuItem object clicked by
 *   the user. By checking the menu item id, it becomes possible
 *   to give proper action to the corresponding item.
 */
class CreateOptionsMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_options_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(
                this,
                "Option menu item ${item.title} with id ${item.itemId} has just been clicked",
                Toast.LENGTH_SHORT
            ).show()
        return true
    }
}
