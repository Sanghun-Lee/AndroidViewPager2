package com.dale.band.data.dummy

import android.graphics.Color
import com.dale.band.data.ColorAndTitleData

object DummyColorAndTitleDataSet {
    fun getDummyData(): List<ColorAndTitleData> = listOf(
        ColorAndTitleData(Color.BLUE, "title1"),
        ColorAndTitleData(Color.CYAN, "title2"),
        ColorAndTitleData(Color.GREEN, "title3"),
        ColorAndTitleData(Color.RED, "title4"),
        ColorAndTitleData(Color.YELLOW, "title5"),
        ColorAndTitleData(Color.WHITE, "title6"),
    )
}