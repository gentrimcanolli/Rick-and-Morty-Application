package com.mirtneg.rickandmorty.ui.episodedetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.mirtneg.rickandmorty.databinding.FragmentEpisodeDetailBinding
import com.mirtneg.rickandmorty.ui.home.CharactersAdapter

class EpisodeDetailFragment : Fragment() {
    private lateinit var binding: FragmentEpisodeDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEpisodeDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}