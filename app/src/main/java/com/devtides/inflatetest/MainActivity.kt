package com.devtides.inflatetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devtides.inflatetest.gridlayout.GridlayoutActivity
import com.devtides.inflatetest.gridview.GridviewActivity
import com.devtides.inflatetest.linearlayout.LinearlayoutActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridview_button.setOnClickListener {
            startActivity<GridviewActivity>()
        }

        gridlayout_button.setOnClickListener {
            startActivity<GridlayoutActivity>()
        }

        linearlayout_button.setOnClickListener {
            startActivity<LinearlayoutActivity>()
        }
    }
}
