package com.home.learner;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class ABC extends AppCompatActivity {
    public MediaPlayer mp;


    Button a2z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abc3);


        final Button bta= (Button) findViewById(R.id.button7);
        bta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.a );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button7));
            }
        });
        final Button btb= (Button) findViewById(R.id.button8);
        btb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.bb );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button8));
            }
        });
        final Button btc= (Button) findViewById(R.id.button9);
        btc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.c );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button9));
            }
        });
        final Button btd= (Button) findViewById(R.id.button10);
        btd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.d );
                mp.start();

                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button10));
            }
        });
        final Button bte= (Button) findViewById(R.id.button11);
        bte.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.e );
                mp.start();

                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button11));
            }
        });

        final Button btf= (Button) findViewById(R.id.button12);
        btf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.f );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button12));
            }
        });final Button btg= (Button) findViewById(R.id.button13);
        btg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.g );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button13));
            }
        });final Button bth= (Button) findViewById(R.id.button14);
        bth.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.h );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button14));
            }
        });final Button bti= (Button) findViewById(R.id.button15);
        bti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.i );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button15));
            }
        });final Button btj= (Button) findViewById(R.id.button16);
        btj.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.j );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button16));
            }
        });final Button btk= (Button) findViewById(R.id.button17);
        btk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.k );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button17));
            }
        });final Button btl= (Button) findViewById(R.id.button18);
        btl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.l );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button18));
            }
        });final Button btm= (Button) findViewById(R.id.button19);
        btm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.m );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button19));
            }
        });final Button btn= (Button) findViewById(R.id.button20);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.n );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button20));
            }
        });final Button bto= (Button) findViewById(R.id.button21);
        bto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.o );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button21));
            }
        });final Button btp= (Button) findViewById(R.id.button22);
        btp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.p );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button22));
            }
        });
        final Button btq= (Button) findViewById(R.id.button23);
        btq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.q );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button23));
            }
        });final Button btr= (Button) findViewById(R.id.button24);
        btr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.r );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button24));
            }
        });final Button bts= (Button) findViewById(R.id.button25);
        bts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.s );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button25));
            }
        });final Button btt= (Button) findViewById(R.id.button26);
        btt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.t );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button26));
            }
        });final Button btu= (Button) findViewById(R.id.button27);
        btu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.u );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button27));
            }
        });final Button btv= (Button) findViewById(R.id.button28);
        btv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.v );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button28));
            }
        });final Button btw= (Button) findViewById(R.id.button29);
        btw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.w );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button29));
            }
        });final Button btx= (Button) findViewById(R.id.button30);
        btx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.x );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button30));
            }
        });
        final Button bty= (Button) findViewById(R.id.button31);
        bty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.y );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button31));
            }
        });
        final Button btz= (Button) findViewById(R.id.button32);
        btz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(getBaseContext(), R.raw.z );
                mp.start();
                YoYo.with( Techniques.FlipInY)
                        .duration(1000)
                        .repeat(2)
                        .playOn(findViewById(R.id.button32));
            }
        });




        }}
