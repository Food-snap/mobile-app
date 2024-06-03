package com.foodsnap.app.ui.main.ui.account

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.foodsnap.app.databinding.FragmentAccountBinding
import com.foodsnap.app.ui.auth.AuthActivity
import com.foodsnap.app.ui.settings.editprofile.EditProfileActivity

class AccountFragment : Fragment() {

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        val root: View = binding.root

        setListeners()

        return root
    }

    private fun setListeners() {
        binding.apply {
            btnEditProfile.setOnClickListener {
                startActivity(Intent(requireActivity(), EditProfileActivity::class.java))
            }

            btnLogOut.setOnClickListener {
                requireActivity().finishAffinity()
                startActivity(Intent(requireActivity(), AuthActivity::class.java))
            }
        }
    }
}