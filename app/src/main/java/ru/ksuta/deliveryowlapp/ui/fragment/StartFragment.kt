package ru.ksuta.deliveryowlapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import ru.ksuta.deliveryowlapp.R
import ru.ksuta.deliveryowlapp.databinding.FragmentStartBinding

class StartFragment : BaseFragment() , View.OnClickListener{

    private lateinit var binding: FragmentStartBinding
    lateinit var nvt: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.clickListener = this
        nvt = findNavController(view)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.bt_start -> {
                nvt.navigate(R.id.action_startFragment_to_mainMenuFragment)
            }
        }
    }

}