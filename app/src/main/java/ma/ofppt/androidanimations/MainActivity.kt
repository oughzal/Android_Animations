package ma.ofppt.androidanimations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import ma.ofppt.androidanimations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var b = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val animation = AnimationUtils.loadAnimation(this,R.anim.animation1)
        binding.btnGo.startAnimation(animation)
        binding.btnGo.setOnClickListener {
            var animatorSet = AnimatorSet()

                val animator1 =ObjectAnimator.ofFloat(binding.btnGo,"rotation",0f,7200f)
                animator1.duration = 2000
                val animator2 =ObjectAnimator.ofFloat(binding.btnGo,"translationX",400f,600f)
                animator2.duration = 2000
              val animator3 =ObjectAnimator.ofFloat(binding.btnGo,"translationY",600f,800f)
                animator3.duration = 2000
            val animator4 =ObjectAnimator.ofFloat(binding.btnGo,"scaleX",1f,4f)
                animator4.duration = 2000
            animatorSet.playSequentially(animator4,animator1,animator2,animator3)
            animatorSet.start()





        }


    }
}