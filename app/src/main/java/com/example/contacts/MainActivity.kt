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
            Contacts("Caroline Njuguna","0707556704","njugunaneendo@gmail.com", "https://cdn.pixabay.com/photo/2013/02/21/19/10/mother-84628__340.jpg"),
            Contacts("Natasha Marion", "07865443678","natasha@gmail.com","https://cdn.pixabay.com/photo/2017/08/01/08/28/bouquet-2563485__340.jpg"),
            Contacts("Esther Ayebaza","0752445787","estherayebaza@gmail.com","https://cdn.pixabay.com/photo/2017/03/02/14/56/pretty-2111498__340.jpg"),
            Contacts("Diana Jarenga", "07653234565","dianajarengs@gmail.com","https://cdn.pixabay.com/photo/2020/10/14/12/01/turan-annual-5654158__340.jpg"),
            Contacts("Caroline Njuguna","0707556704","njugunaneendo@gmail.com","https://cdn.pixabay.com/photo/2016/03/23/15/00/ice-cream-1274894__340.jpg"),
            Contacts("Natasha Marion", "07865443678","natasha@gmail.com","https://cdn.pixabay.com/photo/2017/07/28/14/29/macarons-2548827__340.jpg"),
            Contacts("Esther Ayebaza","0752445787","estherayebaza@gmail.com","https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg"),
            Contacts("Diana Jarenga", "07653234565","dianajarengs@gmail.com","https://cdn.pixabay.com/photo/2014/09/07/16/53/couple-437968__480.jpg"),

        )
        rvContacts = findViewById(R.id.rvContacts)
        rvContacts.layoutManager = LinearLayoutManager(baseContext)
        var contactsAdapter = ContactsAdapter(contactsList, baseContext)
        rvContacts.apply {
            layoutManager = LinearLayoutManager(baseContext)
            rvContacts.adapter = contactsAdapter
        }

    }
}