package com.example.odev4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.odev4.databinding.FragmentSayfaYBinding


class SayfaY : Fragment() {
    private lateinit var tasarim:FragmentSayfaYBinding



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim =  FragmentSayfaYBinding.inflate(inflater, container, false)

// Bu kısım zorları, Hintli abilerimiz sağolsun işi çözdük

    val callback = object : OnBackPressedCallback(true){
        override fun handleOnBackPressed() {
            findNavController().navigate(R.id.anasayfa)
        }
    }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,callback)
        return tasarim.root
    }
}