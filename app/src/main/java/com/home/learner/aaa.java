package com.home.learner;

import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Locale;

public class aaa extends AppCompatActivity {

MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_aaa );

        final Button btone= (Button) findViewById(R.id.btone);
        btone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.aa);
                mp.start();
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btone));

            }
        });
        final Button bttwo= (Button) findViewById(R.id.bttwo);
        bttwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.ab);
                mp.start();
                YoYo.with( Techniques.BounceInLeft)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.bttwo));
            }
        });
        final Button three= (Button) findViewById(R.id.btthree);
        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.ac);
                mp.start();
                YoYo.with( Techniques.RubberBand)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btthree));
            }
        });
        final Button four= (Button) findViewById(R.id.btfour);
        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.ad);
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btfour));
            }
        });
        final Button btfive= (Button) findViewById(R.id.btfive);
        btfive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.ae);
                mp.start();
                YoYo.with( Techniques.Shake)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btfive));

            }
        });
        final Button btsix= (Button) findViewById(R.id.btsix);
        btsix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.af);
                mp.start();
                YoYo.with( Techniques.Wave)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btsix));
            }
        });
        final Button btseven= (Button) findViewById(R.id.btseven);
        btseven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.ag);
                mp.start();
                YoYo.with( Techniques.BounceInLeft)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btseven));
            }
        });
        final Button bteight= (Button) findViewById(R.id.bteight);
        bteight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.ah);
                mp.start();

                YoYo.with( Techniques.ZoomIn)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.bteight));
            }
        });
        final Button btnine= (Button) findViewById(R.id.btnine);
        btnine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.ai);
                mp.start();
                YoYo.with( Techniques.FlipInX)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btnine));
            }
        });
        final Button btzero= (Button) findViewById(R.id.btzero);
        btzero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.ak);
                mp.start();
                YoYo.with( Techniques.Landing )
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btzero));
            }
        });
        final Button btz= (Button) findViewById(R.id.btz);
        btz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.aj);
                mp.start();
                YoYo.with( Techniques.Landing )
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btz));
            }
        });

    }


}







