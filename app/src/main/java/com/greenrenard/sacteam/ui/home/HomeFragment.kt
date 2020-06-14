package com.greenrenard.sacteam.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.greenrenard.sacteam.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private val sacImagen = "https://firebasestorage.googleapis.com/v0/b/wescis2018.appspot.com/o/logo_SAC.png?alt=media&token=25421368-fbea-4752-b68b-03e9d2afa547"

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.textoInicio)



        homeViewModel.text.observe(viewLifecycleOwner, Observer {
          //  textView.text = textoInicio.text

            Glide.with(this).load(sacImagen).into(sacImagenId)

        })
        return root
    }



}