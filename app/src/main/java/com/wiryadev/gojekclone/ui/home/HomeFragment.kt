package com.wiryadev.gojekclone.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.viewbinding.library.fragment.viewBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wiryadev.gojekclone.R
import com.wiryadev.gojekclone.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding<FragmentHomeBinding>()

    private val viewModel by viewModels<HomeViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.mainServices.observe(viewLifecycleOwner) { services ->
            val adapter = ServiceAdapter(services)
            binding.rvServices.adapter = adapter
        }
    }

}