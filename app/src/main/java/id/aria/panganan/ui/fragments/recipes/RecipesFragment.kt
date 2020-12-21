package id.aria.panganan.ui.fragments.recipes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.aria.panganan.databinding.FragmentRecipesBinding

class RecipesFragment : Fragment() {

    private var _binding: FragmentRecipesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentRecipesBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.rvShimmerRecipes.showShimmer()

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}