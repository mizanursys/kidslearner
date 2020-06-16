package com.home.learner;

import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Locale;

public class akduiteen extends AppCompatActivity {

   TextToSpeech textToSpeech;
   CheckBox mvoice;
   SeekBar mSeekBarPitch,mSeekBarSpeed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akduiteen);
        final Button btone= (Button) findViewById(R.id.btone);
        mvoice=(CheckBox) findViewById ( R.id.mvoice );
        mSeekBarPitch=(SeekBar) findViewById ( R.id.mpitch );
        mSeekBarSpeed=(SeekBar)findViewById ( R.id.mspeed );
        mvoice.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (mvoice.isChecked ()){
                    textToSpeech.setLanguage ( Locale.US );

                }else textToSpeech.setLanguage (new Locale ( "BN" ));
            }
        } );

        textToSpeech = new TextToSpeech ( getApplicationContext (), new TextToSpeech.OnInitListener () {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage ( Locale.ENGLISH );

                }
            }
        } );
        btone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "bn_IN" ));
                String toSpeak = "১";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btone));
                return ;

            }
        });
        final Button bttwo= (Button) findViewById(R.id.bttwo);
        bttwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "bn_IN" ));
                String toSpeak = "২";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.BounceInLeft)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.bttwo));
            }
        });
        final Button three= (Button) findViewById(R.id.btthree);
        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "bn_IN" ));
                String toSpeak = "৩";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.RubberBand)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btthree));
            }
        });
        final Button four= (Button) findViewById(R.id.btfour);
        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "bn_IN" ));
                String toSpeak = "৪";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.FlipInY)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btfour));
            }
        });
        final Button btfive= (Button) findViewById(R.id.btfive);
        btfive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "bn_IN" ));
                String toSpeak = "৫";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Shake)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btfive));

            }
        });
        final Button btsix= (Button) findViewById(R.id.btsix);
        btsix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "bn_IN" ));
                String toSpeak = "৬";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Wave)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btsix));
            }
        });
        final Button btseven= (Button) findViewById(R.id.btseven);
        btseven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "bn_IN" ));
                String toSpeak = "৭";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.BounceInLeft)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btseven));
            }
        });
        final Button bteight= (Button) findViewById(R.id.bteight);
        bteight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "bn_IN" ));
                String toSpeak = "৮";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.bteight));
            }
        });
        final Button btnine= (Button) findViewById(R.id.btnine);
        btnine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "bn_IN" ));
                String toSpeak = "৯";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.FlipInX)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btnine));
            }
        });
        final Button btzero= (Button) findViewById(R.id.btzero);
        btzero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "bn_IN" ));
                String toSpeak = "০";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Landing )
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.btzero));
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        textToSpeech.stop ();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        textToSpeech.stop ();
    }

}
