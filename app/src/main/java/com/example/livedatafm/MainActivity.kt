package com.example.livedatafm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSource = DemoDataSource()
        dataSource.loadNumbers()

        dataSource.numberLiveData.observe(this,
            Observer<List<Int>> { t -> txt.text = t?.toString() })
        
        txt.setOnClickListener {
            dataSource.addItem(1111)
        }


    }
}
