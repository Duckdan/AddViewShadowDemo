package com.study.shadow.addviewshadowdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun jumpXml(view: View) {
        var intent = Intent(this@MainActivity, XmlShadowActivity::class.java)
        startActivity(intent)
    }

    fun jumpLayer(view: View) {
        var intent = Intent(this@MainActivity, LayerShapeActivity::class.java)
        startActivity(intent)
    }

    fun jumpLibrary(view: View) {
        var intent = Intent(this@MainActivity, OtherLibraryActivity::class.java)
        startActivity(intent)
    }
}
