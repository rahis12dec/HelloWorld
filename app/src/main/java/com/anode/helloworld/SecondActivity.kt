package com.anode.helloworld

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val nameValue:Bundle? =intent.extras
        val addressValue:Bundle? = intent.extras
        val name=nameValue!!.getString("Name") //!! not null assertion operator
        val address=addressValue!!.getString("Address")
        nameTextShow.text = name
        addressTextShow.text=address

        showToastMsg.setOnClickListener {
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, address, Toast.LENGTH_SHORT).show()

        }
    }
}