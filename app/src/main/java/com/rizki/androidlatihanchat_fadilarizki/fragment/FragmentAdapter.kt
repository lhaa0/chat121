package com.rizki.androidlatihanchat_fadilarizki.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.util.ArrayList


/**
 *   created by Irfan Assidiq on 2019-05-11
 *   email : assidiq.irfan@gmail.com
 **/
class FragmentAdapter (fm: FragmentManager): FragmentPagerAdapter(fm){
    private val mFragments = ArrayList<Fragment>()
    private val mFragmentTitles = ArrayList<String>()

    fun addFragment(fragment: Fragment, title: String) {
        mFragments.add(fragment)
        mFragmentTitles.add(title)
    }

    override fun getItem(p0: Int): Fragment {
        return mFragments[p0]
    }

    override fun getCount(): Int {
        return mFragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitles.get(position)
    }
}