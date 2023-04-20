package com.example.laboratorio05guerra

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BillBoard_Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    //private var param1: String? = null
    //private var param2: String? = null

    private lateinit var buttonFragmentNewMovie: FloatingActionButton
    private lateinit var cardViewFragmentStarWars: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bill_board_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()


    }

    private fun bind(){
        cardViewFragmentStarWars = view?.findViewById(R.id.card_view_star_wars) as CardView
        buttonFragmentNewMovie = view?.findViewById(R.id.btn_link_new_movie) as FloatingActionButton
    }

    private fun listeners(){
        buttonFragmentNewMovie.setOnClickListener{
            it.findNavController().navigate(R.id.action_billBoard_Fragment_to_add_Movie_Fragment)
        }

        cardViewFragmentStarWars.setOnClickListener{
            it.findNavController().navigate(R.id.action_billBoard_Fragment_to_description_Fragment)
        }
    }
