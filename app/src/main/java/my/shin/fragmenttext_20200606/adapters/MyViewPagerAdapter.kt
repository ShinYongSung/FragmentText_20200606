package my.shin.fragmenttext_20200606.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import my.shin.fragmenttext_20200606.fragments.StudentListFragment
import my.shin.fragmenttext_20200606.fragments.myProfileFragment

class MyViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0) {
            return "내 프로필"
        }

        else {
            return "수강생 목록"
        }

    }

    override fun getItem(position: Int): Fragment {
        if (position ==0) {
            return myProfileFragment()
        }

        else {
            return StudentListFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}