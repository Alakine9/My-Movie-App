package com.example.mymovieapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Parallel Arrays for Movie Details
    private val movieNames = arrayOf("Inception", "Titanic", "Avatar")
    private val directors = arrayOf("Christopher Nolan", "James Cameron", "James Cameron")
    private val ratings = arrayOf(8.8, 7.8, 7.8)

    private lateinit var averageRatingTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the views
        averageRatingTextView = findViewById(R.id.averageRatingTextView)

        // Calculate average rating
        val averageRating = calculateAverageRating(ratings)
        averageRatingTextView.text = "Average Rating: %.2f".format(averageRating)

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

    // Function to calculate the average rating
    private fun calculateAverageRating(ratings: Array<Double>): Double {
        var totalRating = 0.0
        for (rating in ratings) {
            totalRating += rating
        }
        return totalRating / ratings.size
    }
}
