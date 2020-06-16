package com.home.learner;

import android.media.audiofx.LoudnessEnhancer;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.home.learner.R;

import java.util.Locale;

import static java.lang.System.in;

public class Poem extends AppCompatActivity {
TextToSpeech textToSpeech;
SeekBar mSeekBarPitch,mSeekBarSpeed;
CheckBox mvoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_poem );

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
        textToSpeech = new TextToSpeech (getApplicationContext (), new TextToSpeech.OnInitListener () {

            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    textToSpeech.setLanguage ( Locale.ENGLISH );
                }

            }
        } );

        final TextView humpty= (TextView) findViewById(R.id.humpty);
        humpty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak = " Humpty Dumpty . "+"Humpty Dumpty sat on a wall, Humpty Dumpty had a great fall. All the king’s horses , and , All the king’s men, Couldn’t put Humpty together again";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(10)
                        .playOn(findViewById(R.id.humpty));
            }
        });
        final TextView baa= (TextView) findViewById(R.id.baa);
        baa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak = " Baa baa black sheep. "+"Baa baa black sheep, Have you any wool? Yes sir yes sir, Three bags full; One for the master, And one for the dame, And one for the little boy, " +
                        "Who lives down the lane";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(10)
                        .playOn(findViewById(R.id.baa));

            }
        });

        final TextView ding= (TextView) findViewById(R.id.ding);
        ding.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak =" Ding dong bell . "+ "Ding dong bell Pussy’s in the well. Who put her in?. Little Johnny Flynn. Who pulled her out? Little Tommy Stout. What a naughty boy was that. " +
                        "To try to drown poor pussy cat. Who never did him any harm. But killed all the mice in the farmer's barn.";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(10)
                        .playOn(findViewById(R.id.ding));
            }
        });
        final TextView eeny= (TextView) findViewById(R.id.eeny);
        eeny.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak = " Eeny meeny miny moe . "+"Eeny meeny miny moe. Catch a tiger by the toe..If he hollers, let him go,Eeny meeny miny moe.";
              textToSpeech.speak ( toSpeak,TextToSpeech.QUEUE_ADD,null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(10)
                        .playOn(findViewById(R.id.eeny));
            }
        });
        final TextView five= (TextView) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak = " Five little speckled frogsa. "+"Five little speckled frogs. Sit on a speckled log. Eating the most delicious grubs. One jumped into the pool. Where it was nice and cool. Then there were four green speckled frogs.";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(10)
                        .playOn(findViewById(R.id.five));
            }
        });
        final TextView tea= (TextView) findViewById(R.id.tea);
        tea.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak = " Tea Pot. "+"I'm a little teapot. short and stout. Here's my handle, here's my spout. When the kettle's boiling, hear me shout. Tip me up and pour me out.";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(10)
                        .playOn(findViewById(R.id.tea));
            }
        });
        final TextView rain= (TextView) findViewById(R.id.rain);
        rain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak =" It's raining; . "+ "It's raining; it's pouring. The old man is snoring. He went to bed and bumped his head. And he wouldn't get up in the morning.";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(10)
                        .playOn(findViewById(R.id.rain));
            }
        });
        final TextView itsy= (TextView) findViewById(R.id.itsy);
        itsy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak =" itsy bitsy spider . "+ "The itsy bitsy spider. climbed up the water. spout Down came the rain, and washed the spider out. Out came the sun, and dried up all the rain .So the itsy bitsy spider. climbed up the spout again. Incy Wincy Spider climbed up the tree. Down came the snow ,and made poor Incy freeze. Out came the sunshine. and melted all the snow. So Incy Wincy Spider had another go.";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(10)
                        .playOn(findViewById(R.id.itsy));
            }
        });

        final TextView spart= (TextView) findViewById(R.id.spart);
        spart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float pitch=(float) mSeekBarPitch.getProgress () /50;
                if (pitch < 0.1)pitch=0.1f;

                float speed=(float) mSeekBarSpeed.getProgress () /50;
                if (speed < 0.1)speed=0.1f;

                textToSpeech.setPitch ( pitch );
                textToSpeech.setSpeechRate ( speed  );
                //int result=textToSpeech.setLanguage(new Locale ( "En" ));
                String toSpeak = " Jack Sprat . "+"Jack Sprat could eat, no fat, His wife could eat, no lean. And so between the two of them, They licked the platter clean!";
                textToSpeech.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                YoYo.with( Techniques.Pulse)
                        .duration(1000)
                        .repeat(10)
                        .playOn(findViewById(R.id.spart));
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

    private class LENGTH_LONG {
    }
}
