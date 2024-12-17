package com.ruslanhuseynov.steamapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.ruslanhuseynov.steamapp.databinding.CardDesignBinding

class GamesAdapter(private val gamesList: List<Games>) : RecyclerView.Adapter<GamesAdapter.GamesHolder>() {

    class GamesHolder(val binding: CardDesignBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesHolder {

        val binding = CardDesignBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return GamesHolder(binding)
    }

    override fun getItemCount(): Int {

        return gamesList.size
    }

    override fun onBindViewHolder(holder: GamesHolder, position: Int) {

        val game = gamesList[position]

        holder.binding.gameNameRv.text = game.name
        holder.binding.gamePriceRv.text = game.price.toString()
        holder.binding.imageViewRv.setImageResource(game.image)

        holder.binding.buttonBasket.setOnClickListener {

            Snackbar.make(it,"${game.name} Added Basket",Snackbar.LENGTH_SHORT).show()

        }

        holder.itemView.setOnClickListener {

            val action = HomeFragmentDirections.actionDetails(game)
            Navigation.findNavController(it).navigate(action)
        }
    }
}