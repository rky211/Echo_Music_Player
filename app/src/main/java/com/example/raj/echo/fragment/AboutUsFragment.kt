package com.example.raj.echo.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.raj.echo.R

class AboutUsFragment : Fragment() {

    var myImg:ImageView?  = null
    var myText:TextView? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       var view = inflater.inflate(R.layout.fragment_about_us, container, false)

        activity?.title = "About us"
        myImg = view.findViewById(R.id.mImg)
        myText = view.findViewById(R.id.txt)
        return view

    }


}
