package com.legenddreamz.rentalapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.legenddreamz.rentalapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.expand_1).setOnClickListener(v ->startActivity(new Intent(getApplicationContext(), DescActivity1.class)));
        findViewById(R.id.expand_2).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), DescActivity.class)));
        findViewById(R.id.expand_3).setOnClickListener(v ->startActivity(new Intent(getApplicationContext(), DescActivity2.class)));
        findViewById(R.id.expand_4).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), DescActivity3.class)));
    }
}