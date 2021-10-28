package com.example.eventracker.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.eventracker.databinding.AppInfoFragmentBinding
import com.example.eventracker.databinding.LoginFragmentBinding

class AppInfoFragment: Fragment() {
    private var appInfoContainerBinding: AppInfoFragmentBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        appInfoContainerBinding = AppInfoFragmentBinding.inflate(inflater, container, false)
        return appInfoContainerBinding?.root
    }
}