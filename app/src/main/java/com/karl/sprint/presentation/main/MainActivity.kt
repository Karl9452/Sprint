package com.karl.sprint.presentation.main

import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.karl.sprint.R
import com.karl.sprint.presentation.base.BaseActivity
import com.karl.sprint.presentation.find.FindFragment
import com.karl.sprint.presentation.home.HomeFragment
import com.karl.sprint.presentation.main.adapter.MainPagerAdapter
import com.karl.sprint.presentation.mine.MineFragment
import com.karl.sprint.presentation.video.VideoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainViewModel>() {

    override fun getLayoutResId(): Int = R.layout.activity_main


    override fun initData() {

    }

    override fun initView() {
        bnv_main.setOnNavigationItemSelectedListener {
            vp_main.currentItem = 0
            true
        }

        vp_main.apply {
            val fragmentList: MutableList<Fragment> = ArrayList()
            fragmentList.apply {
                add(HomeFragment())
                add(VideoFragment())
                add(FindFragment())
                add(MineFragment())
            }
            adapter = MainPagerAdapter(supportFragmentManager, fragmentList)
            currentItem = 0
            addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrollStateChanged(state: Int) {}

                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {}

                override fun onPageSelected(position: Int) {
                    bnv_main.selectedItemId = when(position) {
                        0 -> R.id.navigation_home

                        1 -> R.id.navigation_video

                        2 -> R.id.navigation_find

                        3 -> R.id.navigation_mine

                        else -> R.id.navigation_home
                    }
                }
            })
        }

        bnv_main.apply {
            selectedItemId = R.id.navigation_home
            setOnNavigationItemSelectedListener {
                vp_main.currentItem = when(it.itemId) {
                    R.id.navigation_home -> 0

                    R.id.navigation_video -> 1

                    R.id.navigation_find -> 2

                    R.id.navigation_mine -> 3

                    else -> 0
                }
                true
            }
        }
    }

}
