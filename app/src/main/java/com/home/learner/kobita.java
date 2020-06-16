package com.home.learner;

import android.media.MediaPlayer;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.net.URI;
import java.util.Locale;

public class kobita extends AppCompatActivity {
    TextToSpeech textToSpeech;
    SeekBar mSeekBarPitch,mSeekBarSpeed;
    CheckBox mvoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_kobita );

        mSeekBarPitch=(SeekBar) findViewById ( R.id.mpitch );
        mSeekBarSpeed=(SeekBar)findViewById ( R.id.mspeed );
        mvoice=(CheckBox) findViewById ( R.id.mvoice );
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
                if (status != TextToSpeech.SUCCESS) {
                    textToSpeech.setLanguage ( Locale.ENGLISH );

                }
            }
        } );

        final TextView kobita1= (TextView) findViewById(R.id.kobita1);
        kobita1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "BN" ));
                String toSpeak = "কবিতার নাম ,কাঠবিড়ালি কাঠবিড়ালি ।  "+"কাঠবিড়ালি কাঠবিড়ালি, পেয়ারা তুমি খাও দুধ ভাত খাও, গুর মুড়ি খাও, বাতাবি লেবু লাও বেড়াল বাচ্চা কুকুর ছানা তাও, ছোঁচা তুমি,তোমার সাথে আড়ি আমার যাও";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(14)
                        .playOn(findViewById(R.id.kobita1));
            }
        });
        final TextView kobita2= (TextView) findViewById(R.id.kobita2);
        kobita2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "BN" ));
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak = "কবিতার নাম ,দোল দোল দুলুনি ।"+"দোল দোল দুলুনি  রাঙ্গা মাথায় চিরুনি  বর আসবে এখুনি  নিয়ে যাবে তখনি";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(14)
                        .playOn(findViewById(R.id.kobita2));
            }
        });

        final TextView kobita3= (TextView) findViewById(R.id.kobita3);
        kobita3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "BN" ));
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak = "কবিতার নাম ,আম পাতা জোরা জোর। ।"+"আম পাতা জোরা জোরা । মারব চাবুক চোরব ঘোড়া ।   ওরে বুবু সরে দারা ।আসছে আমার পাগলা ঘোড়া ।পাগলা ঘোড়া খেপেছে চাবুক ছুরে মেরেছে";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(14)
                        .playOn(findViewById(R.id.kobita3));


            }
        });

        final TextView kobita4= (TextView) findViewById(R.id.kobita4);
        kobita4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "BN" ));
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak ="কবিতার নাম ,আতা গাছে তোতা পাখি ।  "+ "আতা গাছে তোতা পাখি ,ডালিম গাছে মৌ্‌এতো ডাকি তবু কথা ,কও না কেন বৌ";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(14)
                        .playOn(findViewById(R.id.kobita4));
            }
        });

        final TextView kobita6= (TextView) findViewById(R.id.kobita6);
        kobita6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                int result=textToSpeech.setLanguage(new Locale ( "BN" ));
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak = "কবিতার নাম ,ঘুমপাড়ানী মাসি পিসি । "+"ঘুমপাড়ানী মাসি পিসি, মোদের বাড়ি এসো। খাট নাই পালং নাই, চোখ পেতে বোসো। বাটা ভরা পান দেব, গাল ভরে খেও। খোকার চোখে ঘুম নাই, ঘুম দিয়ে যেও।";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(14)
                        .playOn(findViewById(R.id.kobita6));
            }
        });}


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
