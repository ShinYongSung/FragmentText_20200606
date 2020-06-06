package my.shin.fragmenttext_20200606

import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class ViewPagerActivity : BaseActivity() {

    lateinit var myAdapter: FragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager2)
    }

    override fun setupEvent() {
    }

    override fun setValues() {
        myAdapter = myViewPagerAdapter(supportFragmentManager)
        ViewPager.adapter = myAdapter
    }