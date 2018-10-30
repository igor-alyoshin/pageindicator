package com.chahinem.pageindicator.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearSnapHelper
import com.chahinem.pageindicator.sample.MyAdapter.MyItem
import com.squareup.picasso.Picasso.Builder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val picasso = Builder(this).build()

        // RecyclerView
        val adapter = MyAdapter(picasso)
        list.adapter = adapter
        LinearSnapHelper().attachToRecyclerView(list)
        adapter.swapData(LIST_ITEMS)
        pageIndicator.attachTo(list)

        // ViewPager
        val myPagerAdapter = MyPagerAdapter(picasso, LIST_ITEMS)
        pager.adapter = myPagerAdapter
        pager.currentItem = 50
        pagerPageIndicator.attachTo(pager)

        // Manual
        manualPageIndicator.count = 777
        leftBtn.setOnClickListener { manualPageIndicator.swipePrevious() }
        rightBtn.setOnClickListener { manualPageIndicator.swipeNext() }
    }

    companion object {
        private val LIST_ITEMS = listOf(
                MyItem(
                        "San Francisco, California",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/25024416_182774512460963_6661054269581426688_n.jpg"),
                MyItem(
                        "Valensole",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/25022757_375109192929045_3153371362454667264_n.jpg"),
                MyItem(
                        "Étretat",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/25005816_2020789231533395_4507938399037947904_n.jpg"),
                MyItem(
                        "Tokyo, Japan",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/23421860_192904647945945_6319320906002857984_n.jpg"),
                MyItem(
                        "Paris, France",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/23347334_633654673691303_8149777143685971968_n.jpg"),
                MyItem(
                        "New York, New York",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/23101824_1822687121355425_8930059065124454400_n.jpg"),
                MyItem(
                        "New York, New York",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/23161047_853121148199404_5154039615094521856_n.jpg"),
                MyItem(
                        "New York, New York",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/23161047_853121148199404_5154039615094521856_n.jpg"),
                MyItem(
                        "New York, New York",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/23161047_853121148199404_5154039615094521856_n.jpg"),
                MyItem(
                        "New York, New York",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/23161047_853121148199404_5154039615094521856_n.jpg"),
                MyItem(
                        "New York, New York",
                        "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                        "https://scontent-cdg2-1.cdninstagram.com/t51.2885-15/e35/23161047_853121148199404_5154039615094521856_n.jpg")
        )
    }
}
