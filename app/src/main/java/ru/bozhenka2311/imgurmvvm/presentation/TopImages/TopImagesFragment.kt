package ru.bozhenka2311.imgurmvvm.presentation.TopImages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.bozhenka2311.imgurmvvm.R

class TopImagesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewImages = inflater.inflate(R.layout.fragment_top_images, container, false)
    }
}

