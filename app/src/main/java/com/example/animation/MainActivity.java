package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageAudi;
    private ImageView imageGolf;
    private boolean check = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void erasePhoto(View view) {
        imageAudi = findViewById(R.id.firstPhoto);
        imageGolf = findViewById(R.id.secondPhoto);
        if (imageAudi != null && check) {
            imageAudi.animate().rotation(7200).scaleX(0.1f).scaleY(0.1f).alpha(0).setDuration(3000);
            imageGolf.animate().rotation(7200).scaleX(1).scaleY(1).alpha(1).setDuration(3000);
            check = false;
        } else if(imageGolf != null){
            imageAudi.animate().rotation(3600).scaleX(1).scaleY(1).alpha(1).setDuration(3000);
            imageGolf.animate().rotation(3600).scaleX(0.1f).scaleY(0.1f).alpha(0).setDuration(3000);
            check = true;
        }
    }
}