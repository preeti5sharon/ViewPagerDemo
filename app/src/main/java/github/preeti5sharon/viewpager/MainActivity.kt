package github.preeti5sharon.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import github.preeti5sharon.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        _binding?.viewPager?.adapter = FragmentAdapter(this)
        _binding?.viewPager?.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        TabLayoutMediator(_binding?.tabLayout!!, _binding?.viewPager!!) { tab, position ->
            when (position) {
                0 -> tab.text = "First Fragment"
                else -> tab.text = "Second Fragment"
            }
        }.attach()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}