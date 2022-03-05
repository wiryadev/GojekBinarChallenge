package com.wiryadev.gojekclone.ui.home

import android.os.Bundle
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import coil.load
import coil.size.Scale
import coil.transform.CircleCropTransformation
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

        viewModel.quickAccess.observe(viewLifecycleOwner) { services ->
            val adapter = QuickAccessAdapter(services)
            binding.rvQuickAccess.adapter = adapter
            binding.rvQuickAccess.addItemDecoration(
                DividerItemDecoration(context, LinearLayoutManager.VERTICAL)
            )
        }

        viewModel.promos.observe(viewLifecycleOwner) { promos ->
            val adapter = PromoAdapter(promos)
            binding.rvPromos.adapter = adapter
        }
    }

}