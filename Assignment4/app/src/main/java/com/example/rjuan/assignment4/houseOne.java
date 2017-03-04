package com.example.rjuan.assignment4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class houseOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_one);
    }





    public void runMap(View v){
        //run the map lookup function

        String url = "https://www.google.com/maps/dir//3909+Reche+Rd,+Fallbrook,+CA+92028/@33.3681901,-117.1797633,17z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x80dc78a93cb509d5:0xadd08054dd2a27b3!2m2!1d-117.1775746!2d33.3681901";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}
