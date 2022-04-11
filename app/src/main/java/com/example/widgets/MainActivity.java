package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView triangle;
    private ImageView circle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        triangle = findViewById(R.id.triangleShow);
        circle = findViewById(R.id.circleShow);
        circle.setVisibility(View.VISIBLE);
        triangle.setVisibility(View.GONE);
    }

    public void toggle(View view) {
        if (triangle.getVisibility() == View.VISIBLE){
            triangle.setVisibility(View.GONE);
            circle.setVisibility(View.VISIBLE);
        }
        else{
            circle.setVisibility(View.GONE);
            triangle.setVisibility(View.VISIBLE);
        }
    }
}
