package com.example.contacts


import android.content.Context
import android.content.Intent
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class ContactsAdapter (var contactsList: List<Contacts>, var context: Context ): RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
       var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
     var currentContact = contactsList.get(position)
        holder.tvName.text = currentContact.Name
        holder.tvNumber.text = currentContact.Number
        holder.tvEmail.text = currentContact.Email
        holder.cvContacts.setOnClickListener{
            val intent = Intent(
                context,ContactDetailsActivity::class.java
            )
            intent.putExtra("name",currentContact.Name)
            intent.putExtra("Number",currentContact.Number)
            intent.putExtra("Email",currentContact.Email)
            intent.putExtra("Image",currentContact.imageUrl)
            Toast.makeText(context,"name",Toast.LENGTH_LONG).show()
            Toast.makeText(context,"Number",Toast.LENGTH_LONG).show()
            Toast.makeText(context,"Email",Toast.LENGTH_LONG).show()

            context.startActivity(intent)


        }
       Picasso.get()
            .load(currentContact.imageUrl)
           .resize(80,80)
           .centerCrop()
            .into(holder.ivContacts)

        holder.cvContacts.setOnClickListener{
            var intent = Intent(context,ContactDetailsActivity::class.java)
            intent.putExtra("Name",currentContact.Name)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

            context.startActivity(intent)
        }
        holder.ivContacts.setOnClickListener{
            Toast.makeText(context,"You have touched my face",Toast.LENGTH_LONG)
        }


    }

    override fun getItemCount(): Int {
       return contactsList.size
    }
}
class ContactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var ivContacts = itemView.findViewById<ImageView>(R.id.ivContact)
    var cvContacts = itemView.findViewById<CardView>(R.id.cvContact)
}