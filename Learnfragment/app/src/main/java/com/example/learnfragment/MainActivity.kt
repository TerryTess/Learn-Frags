package com.example.learnfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.learnfragment.databinding.ActivityMainBinding

class MainFragment : Fragment() {
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentManager = requireActivity().supportFragmentManager
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btfragment1.setOnClickListener(){
            goToFragment(Fragment1())
        }
        binding.btfragment2.setOnClickListener(){
            goToFragment(Fragment2())
        }   // Initialize binding and set click listeners, etc.
    }

    private fun goToFragment(fragment: Fragment) {
        fragmentManager.beginTransaction()
            .replace(R.id.fragmentcontainer, fragment)
            .commit()
    }
}
