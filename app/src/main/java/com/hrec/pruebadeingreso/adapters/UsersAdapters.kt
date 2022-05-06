package com.hrec.pruebadeingreso.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.hrec.pruebadeingreso.activities.MainActivity
import com.hrec.pruebadeingreso.databinding.MainListViewholderBinding
import com.hrec.pruebadeingreso.interfaces.ChangeActivities
import com.hrec.pruebadeingreso.models.UserResponse

class UsersAdapters(
    private val values: List<UserResponse>,
    private val mContext: MainActivity
): RecyclerView.Adapter<UsersAdapters.UsersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        return UsersViewHolder(MainListViewholderBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        val item = values[position]
        holder.userName.text = "${item.name}"
        holder.phoneNumber.text = "${item.phone}"
        holder.email.text = "${item.email}"
        holder.goToPosts.setOnClickListener {
            val onChange : ChangeActivities = mContext
            onChange.onChangeActivity(item)
        }
    }

    override fun getItemCount(): Int {
        return values.size
    }

    inner class UsersViewHolder(binding:MainListViewholderBinding): RecyclerView.ViewHolder(binding.root) {
        val email: TextView = binding.tvEmail
        val phoneNumber: TextView = binding.tvPhoneNumber
        val userName: TextView = binding.tvUsername
        val goToPosts: Button = binding.btnPosts
    }
}