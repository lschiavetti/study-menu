package com.schiavetti.studymenu.contextual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.utils.widget.MockView
import androidx.recyclerview.widget.RecyclerView
import com.schiavetti.studymenu.R

/**
 *   WRITE TODO
 *
 *
 */
class FloatingContextualMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_contextual_menu)

        registerForContextMenu(findViewById<TextView>(R.id.activityFloatingContextualMenuTextView))
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        Toast.makeText(this, "Clicked on item: ${item.title}", Toast.LENGTH_SHORT).show()
        return true
    }
}
