package my.shin.fragmenttext_20200606.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import my.shin.fragmenttext_20200606.fragments.myProfileFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if (position ==0) {
            return myProfileFragment()
        }

        else if ()
    }

    override fun getCount(): Int {
        return 2
    }
}