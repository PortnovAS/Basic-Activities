package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val button = findViewById<Button>(R.id.button_a)
        button.setOnClickListener{
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
    }
}