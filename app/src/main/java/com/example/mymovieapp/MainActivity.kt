package com.example.mymovieapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:background="@android:color/white">

<!-- Logo Image -->
<ImageView
android:id="@+id/logo"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:src="@drawable/logo"  <!-- Use your logo image here -->
android:layout_centerInParent="true" />

</RelativeLayout>

package com.example.movieapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Parallel Arrays for Movie Details
    private val movieNames = arrayOf("Inception", "Titanic", "Avatar")
    private val directors = arrayOf("Christopher Nolan", "James Cameron", "James Cameron")
    private val ratings = arrayOf(8.8, 7.8, 7.8)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buttons for Add Movie and View Reviews
        val addMovieButton: Button = findViewById(R.id.addMovieButton)
        val viewReviewsButton: Button = findViewById(R.id.viewReviewsButton)

        // OnClickListener for Add Movie Button
        addMovieButton.setOnClickListener {
            val intent = Intent(this, AddMovieActivity::class.java)
            startActivity(intent)
        }

        // OnClickListener for View Reviews Button
        viewReviewsButton.setOnClickListener {
            val intent = Intent(this, ViewReviewsActivity::class.java)
            intent.putExtra("movieNames", movieNames)
            intent.putExtra("directors", directors)
            intent.putExtra("ratings", ratings)
            startActivity(intent)
        }
    }
}
