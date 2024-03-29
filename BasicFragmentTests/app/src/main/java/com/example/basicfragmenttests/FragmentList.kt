package com.example.basicfragmenttests

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.ListFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.basicfragmenttests.databinding.FragmentListBinding

class FragmentList(private val RemoteDataSource : RemoteAlbumDataSource) : Fragment() {

    lateinit private var binding : FragmentListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater ,  R.layout.fragment_list ,container , false )
        return binding.root
     }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }


        fun submitData(): RemoteAlbumDataSource {
            return RemoteDataSource

    }
    private fun initRecyclerView() {
        binding.recyclerView.apply{
            layoutManager = LinearLayoutManager(activity)
            //attach adapter
            // attach decoration
        }
    }


}