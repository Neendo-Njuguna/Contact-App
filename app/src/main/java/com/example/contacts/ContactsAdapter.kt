package com.example.contacts

import android.provider.Contacts
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView


class ContactsAdapter (var contactsList: List<com.example.contacts.Contacts>): RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
       var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
     var currentContact = contactsList.get(position)
        holder.tvName.text = currentContact.Name
        holder.tvNumber.text = currentContact.Number
        holder.tvEmail.text = currentContact.Email


    }

    override fun getItemCount(): Int {
       return contactsList.size
    }
}
class ContactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
}