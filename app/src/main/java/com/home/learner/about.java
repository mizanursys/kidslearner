package com.home.learner;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class about extends AppCompatActivity {
    private Object Menu;
    private Object MenuItem;
    private android.view.Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.about );
          final TextView mail=findViewById ( R.id.mail );

          final ImageButton home=findViewById ( R.id.home );

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData( Uri.fromParts ("mailto","sudodeveloper81@gmail.com",null));
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });

    }
}
