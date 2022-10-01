package com.anode.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        /*val submitBtn :Button = findViewById(R.id.submitBtn)
        submitBtn.setOnClickListener {
            Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()
        }*/
        submitBtn.setOnClickListener {
            Log.i("MainActivity", "Hello World")
            Toast.makeText(this, "My First kotlin Project", Toast.LENGTH_SHORT).show()
        }

        sendMsgBtn.setOnClickListener {

            val message:String = massageInpuText.text.toString()
            //Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            val addressMessage:String = addressInputText.text.toString()
            //Toast.makeText(this, addressMessage, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)//Explicit Intent

            intent.putExtra("Name", message)
            intent.putExtra("Address", addressMessage)
            startActivity(intent)
        }

        sendOtherApps.setOnClickListener {
            val message:String =massageInpuText.text.toString()
            val intent =Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share to"))
        }
    }

}