package com.example.kotlinnavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlinnavigationapp.databinding.FragmentHomeBinding
import com.example.kotlinnavigationapp.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_second, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)
        var input = arguments!!.getString("name")
        Toast.makeText(activity,"The received data is: $input", Toast.LENGTH_LONG).show()
        return binding.root
    }
}