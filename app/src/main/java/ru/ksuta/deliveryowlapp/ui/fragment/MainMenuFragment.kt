package ru.ksuta.deliveryowlapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.ksuta.deliveryowlapp.databinding.FragmentMainmenuBinding
import ru.ksuta.deliveryowlapp.databinding.FragmentStartBinding

class MainMenuFragment : BaseFragment() {

    private lateinit var binding: FragmentMainmenuBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = FragmentMainmenuBinding.inflate(inflater, container, false)
        return binding.root
    }
}