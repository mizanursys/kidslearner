package com.home.learner;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Locale;

public class fruits extends AppCompatActivity {
    TextToSpeech t1;
    CheckBox mvoice;
    SeekBar mSeekBarPitch,mSeekBarSpeed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        mSeekBarPitch=(SeekBar) findViewById ( R.id.mpitch );
        mSeekBarSpeed=(SeekBar)findViewById ( R.id.mspeed );
       final Button mango=(Button) findViewById ( R.id.mango );
       final ImageButton mango1=(ImageButton) findViewById ( R.id.mango1);
       final Button banana=(Button) findViewById ( R.id.banana );
       final ImageButton banana1=(ImageButton) findViewById ( R.id.banana1);
       final Button coconut=(Button) findViewById ( R.id.coconut );
       final ImageButton coconut1=(ImageButton) findViewById ( R.id.coconut1);
       final Button date=(Button) findViewById ( R.id.date );
       final ImageButton date1=(ImageButton) findViewById ( R.id.date1);
       final Button fig=(Button) findViewById ( R.id.fig );
       final ImageButton fig1=(ImageButton) findViewById ( R.id.fig1);
       final Button grapes=(Button) findViewById ( R.id.grapes );
       final ImageButton grapes1=(ImageButton) findViewById ( R.id.grapes1);
       final Button jackfruit=(Button) findViewById ( R.id.jackfruit );
       final ImageButton jackfruit1=(ImageButton) findViewById ( R.id.jackfruit1);
       final Button ly=(Button) findViewById ( R.id.ly );
       final ImageButton ly1=(ImageButton) findViewById ( R.id.ly1);
       final Button mulberry=(Button) findViewById ( R.id.mulberry );
       final ImageButton mulberry1=(ImageButton) findViewById ( R.id.mulberry1);
       final Button orange=(Button) findViewById ( R.id.orange );
       final ImageButton orange1=(ImageButton) findViewById ( R.id.orange1);
       final Button strawberry=(Button) findViewById ( R.id.strawberry );
       final ImageButton strawberry1=(ImageButton) findViewById ( R.id.strawberry1);
       final Button pears=(Button) findViewById ( R.id.pears );
       final ImageButton pears1=(ImageButton) findViewById ( R.id.pears1);
       final Button blueberry=(Button) findViewById ( R.id.blueberry );
       final ImageButton blueberry1=(ImageButton) findViewById ( R.id.blueberry1);
        mvoice=(CheckBox) findViewById ( R.id.mvoice );
        mvoice.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (mvoice.isChecked ()){
                    t1.setLanguage ( Locale.US );

                }else t1.setLanguage (new Locale ( "BN" ));
            }
        } );


        t1 = new TextToSpeech ( getApplicationContext (), new TextToSpeech.OnInitListener () {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage ( Locale.ENGLISH );

                }
            }
        } );
        mango.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Mango";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.mango));

            }
        } );
        mango1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String toSpeak = "MANGO";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.mango1));

            }
        } );
        banana.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "banana";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.banana));

            }
        } );
        banana1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "banana";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );

                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.banana1));

            }
        } );
        blueberry.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "blueberry";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.blueberry));

            }
        } );
        blueberry1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "blueberry";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.blueberry1));

            }
        } );
        coconut.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "coconut";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.coconut));

            }
        } );
        coconut1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "coconut";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.coconut1));

            }
        } );
        date.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "date";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.date));

            }
        } );
        date1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "date";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.date1));

            }
        } );
        fig.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "fig";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.fig));

            }
        } );
        fig1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "fig";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.fig1));

            }
        } );
        grapes.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "grapes";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.grapes));

            }
        } );
        grapes1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "grapes";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.grapes1));

            }
        } );
        ly.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Lychee";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.ly));

            }
        } );
        ly1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "Lychee";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.ly1));

            }
        } );
        jackfruit.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "jackfruit";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.jackfruit));

            }
        } );
        jackfruit1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "jackfruit";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.jackfruit1));

            }
        } );
        mulberry.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "mulberry";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.mulberry));

            }
        } );
        mulberry1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "mulberry";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.mulberry1));

            }
        } );
        orange.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "orange";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.orange));

            }
        } );
        orange1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "orange";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.orange1));

            }
        } );
        pears.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "pears";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.pears));

            }
        } );
        pears1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "pears";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.pears1));

            }
        } );
        strawberry.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "strawberry";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.strawberry));

            }
        } );
        strawberry1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                t1.setPitch ( pitch );
                t1.setSpeechRate ( speed );
                String toSpeak = "strawberry";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(findViewById(R.id.strawberry1));

            }
        } );
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        t1.stop ();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        t1.stop ();
    }
}
