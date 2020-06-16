package com.home.learner;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class kkh extends AppCompatActivity {

MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_kkh );

        final Button btk = (Button) findViewById ( R.id.k );
        btk.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.kk );
                mp.start ();
                YoYo.with ( Techniques.FlipInY ).duration ( 1000 ).repeat ( 2 ).playOn ( findViewById ( R.id.k ) );
            }
        } );
        final Button bttwo = (Button) findViewById ( R.id.k1 );
        bttwo.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.kh );
                mp.start ();
                YoYo.with ( Techniques.BounceInLeft ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k1 ) );
            }
        } );
        final Button three = (Button) findViewById ( R.id.k2 );
        three.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.gg );
                mp.start ();
                YoYo.with ( Techniques.RubberBand ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k2 ) );
            }
        } );
        final Button four = (Button) findViewById ( R.id.k3 );
        four.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.gh );
                mp.start ();
                YoYo.with ( Techniques.FlipInY ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k3 ) );
            }
        } );
        final Button btfive = (Button) findViewById ( R.id.k4 );
        btfive.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.ungo );
                mp.start ();
                YoYo.with ( Techniques.Shake ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k4 ) );

            }
        } );
        final Button btsix = (Button) findViewById ( R.id.k5 );
        btsix.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.cc );
                mp.start ();
                YoYo.with ( Techniques.Wave ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k5 ) );
            }
        } );
        final Button btseven = (Button) findViewById ( R.id.k6 );
        btseven.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.ch );
                mp.start ();
                YoYo.with ( Techniques.BounceInLeft ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k6 ) );
            }
        } );
        final Button bteight = (Button) findViewById ( R.id.k7 );
        bteight.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.jj );
                mp.start ();
                YoYo.with ( Techniques.ZoomIn ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k7 ) );
            }
        } );
        final Button btnine = (Button) findViewById ( R.id.k8 );
        btnine.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.jh );
                mp.start ();
                YoYo.with ( Techniques.FlipInX ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k8 ) );
            }
        } );
        final Button btzero = (Button) findViewById ( R.id.k9 );
        btzero.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.nio );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k9 ) );
            }
        } );
        final Button btz = (Button) findViewById ( R.id.k10 );
        btz.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.tt );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k10 ) );
            }
        } );
        final Button k11 = (Button) findViewById ( R.id.k11 );
        k11.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.th );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k11 ) );
            }
        } );
        final Button k12 = (Button) findViewById ( R.id.k12 );
        k12.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.dd );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k12 ) );
            }
        } );
        final Button k13 = (Button) findViewById ( R.id.k13 );
        k13.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.dho );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k13 ) );
            }
        } );
        final Button k14 = (Button) findViewById ( R.id.k14 );
        k14.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.nn );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k14 ) );
            }
        } );
        final Button k15 = (Button) findViewById ( R.id.k15 );
        k15.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.too );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k15 ) );
            }
        } );
        final Button k16 = (Button) findViewById ( R.id.k16 );
        k16.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.tho );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k16 ) );
            }
        } );
        final Button k17 = (Button) findViewById ( R.id.k17 );
        k17.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.doo );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k17 ) );
            }
        } );
        final Button k18 = (Button) findViewById ( R.id.k18 );
        k18.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.dhoo );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k18 ) );
            }
        } );
        final Button k19 = (Button) findViewById ( R.id.k19 );
        k19.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.nnn );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k19 ) );
            }
        } );
        final Button k20 = (Button) findViewById ( R.id.k20 );
        k20.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.pp );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k20 ) );
            }
        } );
        final Button k21 = (Button) findViewById ( R.id.k21 );
        k21.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.foo );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k21 ) );
            }
        } );
        final Button k22 = (Button) findViewById ( R.id.k22 );
        k22.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.bbb );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k22 ) );
            }
        } );
        final Button k23 = (Button) findViewById ( R.id.k23 );
        k23.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.bb );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k23 ) );
            }
        } );
        final Button k24 = (Button) findViewById ( R.id.k24 );
        k24.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.mm );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k24 ) );
            }
        } );
        final Button k25 = (Button) findViewById ( R.id.k25 );
        k25.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.yzz );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k25 ) );
            }
        } );
        final Button k26 = (Button) findViewById ( R.id.k26 );
        k26.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.rr );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k26 ) );
            }
        } );
        final Button k27 = (Button) findViewById ( R.id.k27 );
        k27.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.lo );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k27 ) );
            }
        } );
        final Button k28 = (Button) findViewById ( R.id.k28 );
        k28.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.talebossho );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k28 ) );
            }
        } );
        final Button k29 = (Button) findViewById ( R.id.k29 );
        k29.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.modhannoshh );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k29 ) );
            }
        } );
        final Button k30 = (Button) findViewById ( R.id.k30 );
        k30.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.so );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k30 ) );
            }
        } );
        final Button k31 = (Button) findViewById ( R.id.k31 );
        k31.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.hoo );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k31 ) );
            }
        } );
        final Button k32 = (Button) findViewById ( R.id.k32 );
        k32.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.dhoshnaro );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k32 ) );
            }
        } );
        final Button k33 = (Button) findViewById ( R.id.k33 );
        k33.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.dhashnaro );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k33 ) );
            }
        } );
        final Button k34 = (Button) findViewById ( R.id.k34 );
        k34.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.untostioo );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k34 ) );
            }
        } );
        final Button k35 = (Button) findViewById ( R.id.k35 );
        k35.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.khondo );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k35 ) );
            }
        } );
        final Button k36 = (Button) findViewById ( R.id.k36 );
        k36.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.unish );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k36 ) );
            }
        } );
        final Button k37 = (Button) findViewById ( R.id.k37 );
        k37.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.bishorgoo );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k37 ) );
            }
        } );
        final Button k38 = (Button) findViewById ( R.id.k38 );
        k38.setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                mp = MediaPlayer.create ( getBaseContext (),R.raw.chondro );
                mp.start ();
                YoYo.with ( Techniques.Landing ).duration ( 700 ).repeat ( 2 ).playOn ( findViewById ( R.id.k38 ) );
            }
        } );


    }

    }


