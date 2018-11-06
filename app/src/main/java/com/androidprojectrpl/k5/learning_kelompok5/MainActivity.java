package com.androidprojectrpl.k5.learning_kelompok5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.logoLogin);
        mImageView.setImageResource(R.drawable.logo);
    }

    public void LOGIN(View view) {
        Intent intent = new Intent(MainActivity.this, HomeView.class);
        startActivity(intent);
    }
}
