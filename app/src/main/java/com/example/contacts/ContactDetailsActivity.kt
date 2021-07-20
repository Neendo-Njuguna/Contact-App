package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class ContactDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)


        var nameintent = intent.getStringExtra("Name")
        var phoneintent = intent.getStringExtra("phoneNumber")
        var emailintent = intent.getStringExtra("email")
        var imageintent = intent.getStringExtra("imageUrl").toString()

        Toast.makeText(baseContext,nameintent,Toast.LENGTH_LONG).show()

        var name = findViewById<TextView>(R.id.tvName2)
        var phone = findViewById<TextView>(R.id.tvphoneNumber2)
        var email = findViewById<TextView>(R.id.tvEmail2)
        var image = findViewById<ImageView>(R.id.ivContact2)

        name.text = nameintent
        phone.text = phoneintent
        email.text = emailintent
        Picasso.get().load(imageintent).into(image)

    }
}