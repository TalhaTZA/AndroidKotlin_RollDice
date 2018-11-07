package kt.enterprises.com.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var   buttonRoll : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cast()


    }

    private fun cast() {
        buttonRoll = findViewById(R.id.roll_button)
    }
}
