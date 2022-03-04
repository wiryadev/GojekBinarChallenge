package com.wiryadev.gojekclone.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.wiryadev.gojekclone.data.MainService
import com.wiryadev.gojekclone.databinding.ItemMainServiceBinding
import com.wiryadev.gojekclone.load

class ServiceAdapter(
    private val services: List<MainService>
) : RecyclerView.Adapter<ServiceAdapter.ServiceViewHolder>() {

    inner class ServiceViewHolder(
        private val binding: ItemMainServiceBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: MainService) {
            with(binding) {
                ivService.load(data.image)
                ivService.setColorFilter(
                    ContextCompat.getColor(root.context, data.colorTint)
                )
                tvService.text = data.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceViewHolder {
        val view = ItemMainServiceBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ServiceViewHolder(view)
    }

    override fun onBindViewHolder(holder: ServiceViewHolder, position: Int) {
        holder.bind(services[position])
    }

    override fun getItemCount(): Int = services.size

}