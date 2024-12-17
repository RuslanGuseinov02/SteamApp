package com.ruslanhuseynov.steamapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ruslanhuseynov.steamapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.toolbarhome.title = "Games"

        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val gamesList = ArrayList<Games>()

        val cs2 = Games(1,"Counter Strike-2",10.99,R.drawable.cs2)
        val dota2 = Games(2,"Dota-2",13.99,R.drawable.dota2)
        val ets2 = Games(3,"Euro Truck Simulator",18.99,R.drawable.ets2)
        val gta5 = Games(4,"Grand Theft Auto-5",24.99,R.drawable.gta5)
        val gta4 = Games(5,"Grand Theft Auto-4",21.99,R.drawable.gta4)
        val gtaSa = Games(6,"Grand Theft Auto-SA",17.99,R.drawable.gtasa)
        val gtaVc = Games(7,"Grand Theft Auto-Vice City",16.99,R.drawable.gtavice)
        val l4d2 = Games(8,"Left 4 Dead 2",19.99,R.drawable.left4dead2)
        val pubg = Games(9,"PUBG",0.0,R.drawable.pung)
        val nfs = Games(10,"Need For Speed",13.99,R.drawable.nfs)
        val nfsHeat = Games(11,"Need For Speed Heat",15.99,R.drawable.nfsheat)
        val nfsUnbound = Games(12,"Need For Speed",18.99,R.drawable.nfsunbound)

        gamesList.add(cs2)
        gamesList.add(dota2)
        gamesList.add(ets2)
        gamesList.add(gta5)
        gamesList.add(gta4)
        gamesList.add(gtaSa)
        gamesList.add(gtaVc)
        gamesList.add(l4d2)
        gamesList.add(pubg)
        gamesList.add(nfs)
        gamesList.add(nfsHeat)
        gamesList.add(nfsUnbound)

        val adapter = GamesAdapter(gamesList)
        binding.recyclerView.adapter = adapter

        return binding.root
    }
}