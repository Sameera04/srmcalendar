package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Upcoming;
    private Button Cal;
    private ImageView Logo;
    private TextView Srmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Upcoming = (Button) findViewById(R.id.etupcoming);
        Cal = (Button)findViewById(R.id.etcalendar);
        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2cal();
            }
        });
        Logo = (ImageView)findViewById(R.id.etimage);
        Srmt = (TextView)findViewById(R.id.etevent);



    }
    public void openActivity2cal(){
        Intent intent=new Intent (this, Activity2cal.class);
        startActivity(intent);
    }

}
