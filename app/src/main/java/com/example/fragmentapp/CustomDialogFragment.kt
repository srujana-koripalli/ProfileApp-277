package com.example.fragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_custom_dailog.*
import kotlinx.android.synthetic.main.fragment_custom_dailog.view.*


class CustomDialogFragment: androidx.fragment.app.DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.fragment_custom_dailog, container, false)

        rootView.cancelButton.setOnClickListener {
            dismiss()
        }

        rootView.submitButton.setOnClickListener {

            val selectedID = ratingRadioGroup.checkedRadioButtonId
            val radio = rootView.findViewById<RadioButton>(selectedID)

            val ratingResult = radio.text.toString()
            Toast.makeText(context, "You rated : $ratingResult", Toast.LENGTH_LONG).show()

        }
        return rootView
    }

}