package com.home.learner;

import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.YuvImage;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.advert.SP;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.home.learner.ABC;

import org.w3c.dom.Text;

import static com.advert.AdsLib.checkSubStatus;
import static com.advert.bdapps.Robi.MSG_TEXT;
import static com.advert.bdapps.Robi.USSD;

public class MainActivity extends AppCompatActivity {

    Button button, button2, button3, button4, fruits, kkh, akduiteen, animal, aaa, about;

    public boolean isPermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.CALL_PHONE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("TAG", "Permission is granted");
                return true;
            } else {

                Log.v("TAG", "Permission is revoked");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            Log.v("TAG", "Permission is granted");
            return true;
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {

            case 1: {

                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    String number = "*213*" + USSD;
                    number = number.replace("*", Uri.encode("*")).replace("#", Uri.encode("#"));
                    Intent mIntent = new Intent(Intent.ACTION_CALL);
                    Uri data = Uri.parse("tel:" + number);
                    mIntent.setData(data);
                    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(mIntent);
                    Toast.makeText(getApplicationContext(), "Permission granted", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Permission denied", Toast.LENGTH_SHORT).show();
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSubStatus(SP.getSubCode());
        if (SP.getSubscriptionStatus()) {
            showDialog(MainActivity.this, "");
        }
        fruits=(Button) findViewById(R.id.fruits);
        button4=(Button) findViewById(R.id.button4);
        button3= (Button) findViewById(R.id.button3);
        button= (Button) findViewById(R.id.button);
        button2= (Button) findViewById(R.id.button2);
        aaa=(Button) findViewById ( R.id.aa );
        animal=(Button) findViewById ( R.id.animal );
        kkh=(Button) findViewById ( R.id.kkh );
        akduiteen=(Button) findViewById ( R.id.akdui );
        about=(Button) findViewById ( R.id.about );

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SP.getSubscriptionStatus()) {
                    showDialog(MainActivity.this, "");

                    startActivity(new Intent(getApplicationContext(), ABC.class));
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SP.getSubscriptionStatus()) {
                    showDialog(MainActivity.this, "");

                    startActivity(new Intent(getApplicationContext(), Numbers.class));
                }
            }
        });

        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SP.getSubscriptionStatus()) {
                    showDialog(MainActivity.this, "");

                    startActivity(new Intent(getApplicationContext(), fruits.class));
                }
            }
        });
        kkh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SP.getSubscriptionStatus()) {
                    showDialog(MainActivity.this, "");
                    startActivity(new Intent(getApplicationContext(), kkh.class));
                }
            }
        });
        aaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SP.getSubscriptionStatus()) {
                    showDialog(MainActivity.this, "");
                    startActivity(new Intent(getApplicationContext(), aaa.class));
                }
            }
        });
        akduiteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SP.getSubscriptionStatus()) {
                    showDialog(MainActivity.this, "");
                    startActivity(new Intent(getApplicationContext(), akduiteen.class));
                }
            }
        });
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SP.getSubscriptionStatus()) {
                    showDialog(MainActivity.this, "");
                    startActivity(new Intent(getApplicationContext(), animal.class));
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SP.getSubscriptionStatus()) {
                    showDialog(MainActivity.this, "");
                    startActivity(new Intent(getApplicationContext(), Poem.class));
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SP.getSubscriptionStatus()) {
                    showDialog(MainActivity.this, "");
                    startActivity(new Intent(getApplicationContext(), kobita.class));
                }
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SP.getSubscriptionStatus()) {
                    showDialog(MainActivity.this, "");
                    startActivity(new Intent(getApplicationContext(), about.class));
                }
            }
        });
    }

    public void showDialog(final Activity activity, String msg) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_ACTION_MODE_OVERLAY);
        dialog.setCancelable(false);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(R.layout.subscribe);

/*
        TextView text = (TextView) dialog.findViewById(R.id.text_dialog);
        text.setText(msg);
*/

        final LinearLayout ll_submit = dialog.findViewById(R.id.ll_sub3);
        final LinearLayout ll_msg = dialog.findViewById(R.id.ll_sub);
        final LinearLayout ll_code = dialog.findViewById(R.id.ll_code);
        Button button_cancel=(Button) dialog.findViewById(R.id.button_cancel1);

//
//        if (msg.equals("clicked")) {
//
//            ll_submit.setVisibility(View.GONE);
//            ll_code.setVisibility(View.VISIBLE);
//        }

        final EditText getCode = dialog.findViewById(R.id.editText_getCode);

        final Button dialogButton = (Button) dialog.findViewById(R.id.button_sendSMS3);

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                dialog.dismiss();

              /*  Intent smsIntent = new Intent(android.content.Intent.ACTION_VIEW);
                smsIntent.setType("vnd.android-dir/mms-sms");
                smsIntent.putExtra("address","21213");
                smsIntent.putExtra("sms_body","start abcd");
                startActivity(smsIntent);*/
                // SP.setSubscriptionClicked(true);

                ll_submit.setVisibility(View.GONE);
                ll_code.setVisibility(View.VISIBLE);
                Uri uri = Uri.parse("smsto:21213");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", MSG_TEXT);
                startActivity(intent);
            }
        });


        dialog.findViewById(R.id.button_submit3)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isPermissionGranted()){
                            String number = "*213*"+USSD;
                            number =  number.replace("*", Uri.encode("*")).replace("#",Uri.encode("#"));
                            Intent mIntent = new Intent(Intent.ACTION_CALL);
                            Uri data = Uri.parse("tel:" + number);
                            mIntent.setData(data);
                            startActivity(mIntent);
                        }
//                        Intent callIntent = new Intent(Intent.ACTION_CALL);
//                        callIntent.setData(Uri.parse("tel:*213*7821%23"));
//                        startActivity(callIntent);
                        Toast.makeText(activity, "Write a vald code", Toast.LENGTH_SHORT).show();
                        ll_submit.setVisibility(View.VISIBLE);
                    }
                });


        dialog.findViewById(R.id.button_code)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (getCode.getText().toString().isEmpty()) {
                            Toast.makeText(activity, "Write a vald code", Toast.LENGTH_SHORT).show();
                        } else {
                            SP.setSubCode(getCode.getText().toString());
                            SP.setSubscriptionClicked(false);
                            checkSubStatus(getCode.getText().toString());
                            dialog.dismiss();
                        }

                    }
                });

        button_cancel.findViewById(R.id.button_cancel1)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SP.setSubscriptionClicked(false);
                        finish();
//                        Toast.makeText(activity, "Write a vald code", Toast.LENGTH_SHORT).show();
//                        ll_submit.setVisibility(View.GONE);
//                        ll_code.setVisibility(View.VISIBLE);
//                        dialog.dismiss();
                    }
                });
        dialog.show();
    }
}
