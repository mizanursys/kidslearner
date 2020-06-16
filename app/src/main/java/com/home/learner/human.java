package com.home.learner;

import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;

import java.util.Locale;

public class human extends AppCompatActivity {
    TextToSpeech t1;
    Button ear,forehead,mouth,chest,stomach,knee,foot,eye,nose,arm,hand,leg,toe,eyebrow2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.human);
        hand=(Button) findViewById ( R.id.hand );
        ear=(Button) findViewById ( R.id.ear );
        leg=(Button) findViewById ( R.id.leg );
        forehead=(Button) findViewById ( R.id.forehead );
        toe=(Button) findViewById ( R.id.toe );
        mouth=(Button) findViewById ( R.id.mouth );
        chest=(Button) findViewById ( R.id.chest );
        stomach=(Button) findViewById ( R.id.stomach );
        knee=(Button) findViewById ( R.id.knee );
        foot=(Button) findViewById ( R.id.foot );
        eyebrow2=(Button) findViewById ( R.id.eyebrow2 );
        nose=(Button) findViewById ( R.id.nose );
        eye=(Button) findViewById ( R.id.eye );
        arm=(Button) findViewById ( R.id.arm );

        t1 = new TextToSpeech ( getApplicationContext (), new TextToSpeech.OnInitListener () {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage ( Locale.ENGLISH );

                }
            }
        } );

        ear.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Ear";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

        forehead.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Forehead";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        mouth.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Mouth";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        chest.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Cheast";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        stomach.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Stomach";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        knee.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Hair";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        foot.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Foot";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        eyebrow2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Eyebrow";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        nose.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Nose";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        eye.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Eye";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        arm.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Head";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        hand.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Hand";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        leg.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Leg";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        toe.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "Toe";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
    }
}
