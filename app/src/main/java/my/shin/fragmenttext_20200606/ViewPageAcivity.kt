package my.shin.fragmenttext_20200606

import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import my.shin.fragmenttext_20200606.adapters.MyViewPagerAdapter

class ViewPagerActivity : BaseActivity() {

    lateinit var myAdapter: FragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        myAdapter = MyViewPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myAdapter
    }

}


