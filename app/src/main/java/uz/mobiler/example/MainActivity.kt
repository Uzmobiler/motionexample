package uz.mobiler.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout
import uz.mobiler.example.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMain2Binding
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {

            if (savedInstanceState == null) {
                val blankFragment = BlankFragment()
                supportFragmentManager.beginTransaction()
                    .add(R.id.my_container, blankFragment)
                    .commit()
            }
        }
    }
}