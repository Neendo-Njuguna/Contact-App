package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts
import android.provider.ContactsContract
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castContacts()
    }
    fun castContacts(){
        var contactsList = listOf(
            com.example.contacts.Contacts("Caroline Njuguna","0707556704","njugunaneendo@gmail.com"),
            com.example.contacts.Contacts("Natasha Marion", "07865443678","natasha@gmail.com"),
            com.example.contacts.Contacts("Esther Ayebaza","0752445787","estherayebaza@gmail.com"),
            com.example.contacts.Contacts("Diana Jarenga", "07653234565","dianajarengs@gmail.com")
             )

        rvContacts = findViewById(R.id.rvContacts)
        var contactsAdapter = ContactsAdapter(contactsList)
        rvContacts.layoutManager = LinearLayoutManager(baseContext)
        rvContacts.apply {
            rvContacts.layoutManager = LinearLayoutManager(baseContext)
            adapter = contactsAdapter
        }

    }
}