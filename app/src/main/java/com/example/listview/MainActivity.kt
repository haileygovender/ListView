package com.example.listview

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener{
    //create items for the list
    //just need to declare "arrayOf()" and list the items
    var listItems = arrayOf("Read a book", "Create a Project","Learn Kotlin","Go Shopping","Attend a Seminar")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declare a list in the activity_main.xml
        val listView : ListView = findViewById(R.id.lvItems)

        //Create an Array adapter
        /* this - refers to the activity
         * layout - a predefined layout for the list
         * items - the data to be in the listView
         */
        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        //Set adapter to the listAdapter
        // This is to connect the data with the list
        listView.adapter = listAdapter

        //All items should be clickable
        listView.onItemClickListener = this


    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?,position: Int, id: Long) {
            val selectedItem = listItems[position]// gets the position of the items being selected
            Toast.makeText(this, "You have clicked on: $selectedItem", Toast.LENGTH_SHORT).show() /// Returns the item details being clicked

    }


}