package com.ayeshaazeema.portofolioapp.ui.experience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import com.ayeshaazeema.portofolioapp.databinding.FragmentExperienceDetailBinding

class ExperienceDetailFragment : Fragment() {
    private var _binding: FragmentExperienceDetailBinding? = null
    private val binding get() = _binding!!
    private val experienceArgs by navArgs<ExperienceDetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExperienceDetailBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            tvTitleExperienceDetail.text = experienceArgs.experience.title
            tvContentExperienceDetail.text = experienceArgs.experience.detail
            ivProfileExperienceDetail.load(experienceArgs.experience.image) {
                crossfade(2000)
            }
        }
    }
}