package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var teams = arrayOf("INDIA", "GERMANY", "JAPAN", "CAMERRON", "BRAZIL","INDIA", "GERMANY", "JAPAN", "CAMERRON", "BRAZIL",
        "INDIA", "GERMANY", "JAPAN", "CAMERRON", "BRAZIL")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mylistview = findViewById<ListView>(R.id.mylistview)

        //var myadapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,teams)
        var myadapter = ArrayAdapter(this, R.layout.item_layout, R.id.textViewItem,teams)
        mylistview.adapter = myadapter

        mylistview.setOnItemClickListener { adapterView, view, pos, id ->

          var item =   adapterView.getItemAtPosition(pos).toString()
            Toast.makeText(this, "you clicked $item", Toast.LENGTH_SHORT).show()

        }


    }


}