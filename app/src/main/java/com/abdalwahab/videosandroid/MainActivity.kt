package com.abdalwahab.videosandroid

import android.app.Dialog
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.VideoView
import kotlinx.android.synthetic.main.custom_video.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun playVideo(view : View) {

        val buttonClicked = findViewById<Button>(view.id)

        val alert = Dialog(this)
        alert.setContentView(R.layout.custom_video)

        val playButton = alert.findViewById<Button>(R.id.play_btn)
        val videoPlayer = alert.findViewById<VideoView>(R.id.video_player)
        val pauseButton = alert.findViewById<Button>(R.id.puase_btn)
        val cancleButton = alert.findViewById<Button>(R.id.cancel_btn)


        when(buttonClicked.id) {

            R.id.video_one -> {
                val videoURI = Uri.parse("android.resource://" + packageName + "/" + R.raw.video_one)
                videoPlayer.setVideoURI(videoURI)
                alert.show()
            }

            R.id.video_two -> {

                val videoURI = Uri.parse("android.resource://" + packageName + "/" + R.raw.video_two)
                videoPlayer.setVideoURI(videoURI)
                alert.show()
            }


            R.id.video_three -> {
                val videoURI = Uri.parse("android.resource://" + packageName + "/" + R.raw.video_three)
                videoPlayer.setVideoURI(videoURI)
                    alert.show()
            }
        }


        playButton.setOnClickListener {
            videoPlayer.start()
        }


        pauseButton.setOnClickListener {
            videoPlayer.pause()
        }

        cancleButton.setOnClickListener {
            alert.dismiss()
        }



    }
}
