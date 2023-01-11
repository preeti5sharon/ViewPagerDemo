package github.preeti5sharon.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import github.preeti5sharon.viewpager.databinding.FragmentFirstBinding
import github.preeti5sharon.viewpager.databinding.FragmentSecondBinding

class SecondFragment: Fragment() {
    private var _binding : FragmentSecondBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(layoutInflater)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.textView?.text="Second Fragment"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}