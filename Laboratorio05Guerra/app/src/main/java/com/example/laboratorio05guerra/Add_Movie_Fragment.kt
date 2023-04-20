package com.example.laboratorio05guerra

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Add_Movie_Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    //private var param1: String? = null
    //private var param2: String? = null

    private lateinit var btnSubmit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add__movie_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()
    }

    private fun bind(){
        btnSubmit = view?.findViewById(R.id.btn_submit) as Button
    }

    private fun listeners(){
        btnSubmit.setOnClickListener{
            it.findNavController().navigate(R.id.action_add_Movie_Fragment_to_billBoard_Fragment)
        }
    }
}