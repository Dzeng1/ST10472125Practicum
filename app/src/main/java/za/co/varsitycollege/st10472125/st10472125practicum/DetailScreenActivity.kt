package za.co.varsitycollege.st10472125.st10472125practicum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailScreenActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_screen)

      var resultDisplay = findViewById<TextView>(R.id.resultDisplay)
        var btnSongs = findViewById<AppCompatButton>(R.id.btnSongs)
        var btnRatings = findViewById<AppCompatButton>(R.id.btnRatings)
        var backBtn = findViewById<AppCompatButton>(R.id.btnBack)


        //setting a return button that takes the user back to the main activity
        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }}
