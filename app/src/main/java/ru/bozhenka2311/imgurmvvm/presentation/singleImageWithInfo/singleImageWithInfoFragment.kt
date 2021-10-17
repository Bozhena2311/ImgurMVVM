/*
 * Created by Bozhena Balzhanova
 * on 13.10.2021
 */
package ru.bozhenka2311.imgurmvvm.presentation.singleImageWithInfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.bozhenka2311.imgurmvvm.R

/**
 * Фрагмент экрана показа выбранного изображения
 *
 */
class singleImageWithInfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_single_image_with_info, container, false)

    }

}