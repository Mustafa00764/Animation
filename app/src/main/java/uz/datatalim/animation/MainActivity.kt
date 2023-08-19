package uz.datatalim.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val ivImage=findViewById<ImageView>(R.id.iv_image)
        val b_zoom=findViewById<Button>(R.id.b_zoom)
        val lav_animation=findViewById<LottieAnimationView>(R.id.lav_animation)
        val b_blink=findViewById<Button>(R.id.b_blink)
        val b_fade=findViewById<Button>(R.id.b_fade)
        val b_move=findViewById<Button>(R.id.b_move)
        val b_slide=findViewById<Button>(R.id.b_slide)
        val b_rotate=findViewById<Button>(R.id.b_rotate)

        b_zoom.setOnClickListener{
            val zoomIn=AnimationUtils.loadAnimation(this,R.anim.zoom_in)
            ivImage.startAnimation(zoomIn)
        }
        b_rotate.setOnClickListener{
            val rotateIn=AnimationUtils.loadAnimation(this,R.anim.rotate_in)
            ivImage.startAnimation(rotateIn)
        }

        b_fade.setOnClickListener{
            val fadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in)
            ivImage.startAnimation(fadeIn)
        }
        b_blink.setOnClickListener{
            val blinkIn = AnimationUtils.loadAnimation(this,R.anim.blink_in)
            ivImage.startAnimation(blinkIn)
        }
        b_move.setOnClickListener{
            val moveIn = AnimationUtils.loadAnimation(this,R.anim.move_in)
            ivImage.startAnimation(moveIn)
        }
        b_slide.setOnClickListener{
            val slideIn=AnimationUtils.loadAnimation(this,R.anim.slide_in)
            ivImage.startAnimation(slideIn)
        }
        b_rotate.setOnClickListener {
            lav_animation.setAnimation("loading2.json")
            lav_animation.playAnimation()
        }
        b_move.setOnClickListener {
            lav_animation.setAnimation("loading3.json")
            lav_animation.playAnimation()
        }
        b_blink.setOnClickListener {
            lav_animation.pauseAnimation()
        }



    }
}