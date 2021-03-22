package com.example.fragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val profilePageBtn: Button = view.findViewById(R.id.profilePageBtn)
        profilePageBtn.setOnClickListener {
            Toast.makeText(
                context,
                "This is a Profile Page",
                Toast.LENGTH_SHORT
            ).show()
        }

        val profileNameTextView:TextView = view.findViewById(R.id.nameTextView)
        val name =arguments?.getString("name")
        name?.let{
            profileNameTextView.text =name

        }
   }

}