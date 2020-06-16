package com.home.learner;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Locale;

public class animal extends AppCompatActivity {
    TextToSpeech t1;
    SeekBar mSeekBarPitch,mSeekBarSpeed;
    CheckBox mvoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_animal );
       final TextView tiger=(TextView) findViewById ( R.id.tiger);
       final TextView lion=(TextView) findViewById ( R.id.lion);
       final TextView lemur=(TextView) findViewById ( R.id.lemur);
       final TextView snake=(TextView) findViewById ( R.id.snake);
       final TextView monkey=(TextView) findViewById ( R.id.monkey);
       final TextView horse=(TextView) findViewById ( R.id.horse);
       final TextView cow=(TextView) findViewById ( R.id.cow);
       final TextView zebra=(TextView) findViewById ( R.id.zebra);
       final TextView gorilla=(TextView) findViewById ( R.id.gorilla);
       final TextView fox=(TextView) findViewById ( R.id.fox);
       final ImageButton  tiger1=(ImageButton) findViewById ( R.id.tiger1);
       final ImageButton lion1=(ImageButton) findViewById ( R.id.lion1);
       final ImageButton lemur1=(ImageButton) findViewById ( R.id.lemur1);
       final ImageButton snake1=(ImageButton) findViewById ( R.id.snake1);
       final ImageButton monkey1=(ImageButton) findViewById ( R.id.monkey1);
       final ImageButton horse1=(ImageButton) findViewById ( R.id.horse1);
       final ImageButton cow1=(ImageButton) findViewById ( R.id.cow1);
       final ImageButton zebra1=(ImageButton) findViewById ( R.id.zebra1);
       final ImageButton gorilla1=(ImageButton) findViewById ( R.id.gorilla1);
       final ImageButton fox1=(ImageButton) findViewById ( R.id.fox1);
        mSeekBarPitch=(SeekBar) findViewById ( R.id.mpitch );
        mSeekBarSpeed=(SeekBar)findViewById ( R.id.mspeed );
        mvoice=(CheckBox) findViewById ( R.id.mvoice );

        mvoice.setOnClickListener ( new View.OnClickListener () {
    @Override
    public void onClick(View v) {
        if (mvoice.isChecked ()){
            t1.setLanguage ( Locale.US );

        }else t1.setLanguage (new Locale ( "BN_IN" ));
    }
} );





        t1 = new TextToSpeech ( getApplicationContext (), new TextToSpeech.OnInitListener () {
            @Override
            public void onInit(int status) {

                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
            }
        } );



        tiger.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Tiger";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(800)
                        .repeat(2)
                        .playOn(findViewById(R.id.tiger));
            }
        } );
        tiger1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Tiger";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(800)
                        .repeat(2)
                        .playOn(findViewById(R.id.tiger1));
            }
        } );
        lion.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Lion";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.lion));
            }
        } );
        lion1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Lion";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.lion1));
            }
        } );
        horse.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;
                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Horse";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.horse ));
            }
        } );
        horse1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;
                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Horse";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.horse ));
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.horse1));
            }
        } );
        cow.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;
                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Cow";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.cow ));
            }
        } );
        cow1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;
                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Cow";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.cow1));
            }
        } );
        lemur.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Lemur";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );

                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.lemur ));
            }
        } );
        lemur1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Lemur";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.lemur1 ));
            }
        } );
        zebra.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Zebra";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );

                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.zebra ));
            }
        } );
        zebra1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Zebra";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.zebra1 ));
            }
        } );
        snake.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Snake";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.snake ));
            }
        } );
        snake1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Snake";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.snake1 ));
            }
        } );
        gorilla.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Gorilla";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.gorilla ));
            }
        } );
        gorilla1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Gorilla";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.gorilla1 ));
            }
        } );
        fox.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Fox";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.fox ));
            }
        } );

        fox1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Fox";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.fox1 ));
            }
        } );
        monkey.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Monkey";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.monkey ));
            }
        } );
        monkey1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;
                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );

                String toSpeak = "Monkey";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.ZoomIn)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.monkey1 ));
            }
        } );

    }
}
