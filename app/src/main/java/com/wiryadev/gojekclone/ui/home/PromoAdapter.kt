package com.wiryadev.gojekclone.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.wiryadev.gojekclone.data.Promo
import com.wiryadev.gojekclone.databinding.ItemPromoCardBinding

class PromoAdapter(
    private val services: List<Promo>
) : RecyclerView.Adapter<PromoAdapter.PromoViewHolder>() {

    inner class PromoViewHolder(
        private val binding: ItemPromoCardBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Promo) {
            with(binding) {
                ivPromo.load(data.image)
                tvTitle.text = data.title
                tvDesc.text = data.desc
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromoViewHolder {
        val view = ItemPromoCardBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return PromoViewHolder(view)
    }

    override fun onBindViewHolder(holder: PromoViewHolder, position: Int) {
        holder.bind(services[position])
    }

    override fun getItemCount(): Int = services.size

}