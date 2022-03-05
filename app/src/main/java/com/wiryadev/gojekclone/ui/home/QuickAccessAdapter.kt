package com.wiryadev.gojekclone.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.wiryadev.gojekclone.data.MainService
import com.wiryadev.gojekclone.databinding.ItemQuickAccessBinding

class QuickAccessAdapter(
    private val services: List<MainService>
) : RecyclerView.Adapter<QuickAccessAdapter.QuickAccessViewHolder>() {

    inner class QuickAccessViewHolder(
        private val binding: ItemQuickAccessBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: MainService) {
            with(binding) {
                ivQa.load(data.image)
                tvQa.text = data.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuickAccessViewHolder {
        val view = ItemQuickAccessBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return QuickAccessViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuickAccessViewHolder, position: Int) {
        holder.bind(services[position])
    }

    override fun getItemCount(): Int = services.size

}