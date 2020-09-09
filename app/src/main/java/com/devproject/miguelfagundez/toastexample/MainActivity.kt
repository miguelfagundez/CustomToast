package com.devproject.miguelfagundez.toastexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Views
    lateinit var btnPushToastCenter : Button
    lateinit var btnPushToastTop : Button
    lateinit var btnPushToastBottom : Button
    lateinit var textView : TextView
    lateinit var inflater : LayoutInflater
    lateinit var layout : View
    lateinit var image : ImageView
    lateinit var toast: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()
        setupListeners()

    }

    private fun setupViews() {
        btnPushToastTop = findViewById(R.id.btnButtonTop) as Button
        btnPushToastCenter = findViewById(R.id.btnButtonCenter) as Button
        btnPushToastBottom = findViewById(R.id.btnButtonBottom) as Button

        inflater = this.getLayoutInflater()
        layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_layout_container))

        textView = layout.findViewById(R.id.textView) as TextView
        image = layout.findViewById(R.id.imageView) as ImageView

    }

    private fun setupListeners() {

        btnPushToastTop.setOnClickListener {
            toast = Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.view = layout
            textView.text = "  Toast TOP  "
            image.setImageDrawable(resources.getDrawable(R.drawable.ic_problem))
            toast.show()
        }

        btnPushToastCenter.setOnClickListener {
            toast = Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.view = layout
            textView.text = "  Toast CENTER  "
            image.setImageDrawable(resources.getDrawable(R.drawable.ic_report))
            toast.show()
        }

        btnPushToastBottom.setOnClickListener {
            toast = Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM, 0, 0)
            toast.view = layout
            textView.text = "  Toast BOTTOM  "
            image.setImageDrawable(resources.getDrawable(R.drawable.ic_baseline_stars_24))
            toast.show()
        }

    }
}