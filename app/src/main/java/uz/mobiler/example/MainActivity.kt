package uz.mobiler.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout
import uz.mobiler.example.databinding.ActivityMain2Binding
import uz.mobiler.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMain2Binding
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {

//            linear2.setOnClickListener {
//                Toast.makeText(this@MainActivity, "Click2", Toast.LENGTH_SHORT).show()
//            }


            motion.setTransitionListener(object : MotionLayout.TransitionListener {
                override fun onTransitionStarted(
                    motionLayout: MotionLayout?,
                    startId: Int,
                    endId: Int
                ) {
                    swLayout.isEnabled = false
                    Log.d("ssss", "touch")
                }

                override fun onTransitionChange(
                    motionLayout: MotionLayout?,
                    startId: Int,
                    endId: Int,
                    progress: Float
                ) {

                }

                override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                    if (currentId == R.id.set1) {
                        motion.setTransition(currentId, R.id.set2)
                    }
                    swLayout.isEnabled = true
                }

                override fun onTransitionTrigger(
                    motionLayout: MotionLayout?,
                    triggerId: Int,
                    positive: Boolean,
                    progress: Float
                ) {
                    Log.d(TAG, "onTransitionTrigger: $progress")
                }
            })
        }
    }
}