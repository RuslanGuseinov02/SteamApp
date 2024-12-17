package com.ruslanhuseynov.steamapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ruslanhuseynov.steamapp.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentDetailsBinding.inflate(inflater,container,false)

        val bundle : DetailsFragmentArgs by navArgs()

        val games = bundle.game

        binding.imageViewDetails.setImageResource(games.image)
        binding.gameNameDetails.text = games.name
        binding.gamePriceDetails.text = "${games.price} $"

        binding.toolbardetails.title = games.name
        return binding.root
    }
}