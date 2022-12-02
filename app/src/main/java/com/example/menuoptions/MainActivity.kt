package com.example.menuoptions
import DialogFragmentOne
import android.content.ClipData
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val create:TextView=findViewById(R.id.textView6)
        create.setOnClickListener {
            var dialog_var = DialogFragmentOne()
            dialog_var.show(supportFragmentManager, "Custom Dialog")
        }

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        //Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.menu01, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item0 -> Toast.makeText(this, "https://eu.battle.net/support/en/", Toast.LENGTH_SHORT).show()
            R.id.item1 -> {
                var dialog_var = DialogFragmentTwo()
                dialog_var.show(supportFragmentManager, "Custom Dialog")}//use to open fragment
            R.id.item2 -> Toast.makeText(this, "https://worldofwarcraft.com/en-us/", Toast.LENGTH_SHORT).show()
            R.id.subitem0 -> Toast.makeText(this, "Video", Toast.LENGTH_SHORT).show()
            R.id.subitem1 -> Toast.makeText(this, "Audio", Toast.LENGTH_SHORT).show()
            R.id.subitem2 -> Toast.makeText(this, "Key Bindings", Toast.LENGTH_SHORT).show()
            R.id.subitem3 -> Toast.makeText(this, "Social", Toast.LENGTH_SHORT).show()
            R.id.item4 -> {
                Toast.makeText(this, "Well Done Blizzard Entertainment", Toast.LENGTH_SHORT).show()
                var dialog_var = DialogFragmentCredit()
                dialog_var.show(supportFragmentManager, "Custom Dialog")//use to open fragment
            }
        }
        return true;

    }
    fun receiveFeedback(feedback: String){
        val server : TextView = findViewById(R.id.textView6)
        server.text = feedback;
    }

}