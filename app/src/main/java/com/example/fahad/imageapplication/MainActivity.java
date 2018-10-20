package com.example.fahad.imageapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView ;
    Button button ;
    int current_image ;
    int[] images = {R.drawable.image1,R.drawable.image2,R.drawable.android,R.drawable.studio};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn) ;
        imageView = findViewById(R.id.imgView) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image++ ;
                current_image= current_image % images.length ;
                imageView.setImageResource(images[current_image]);
            }
        });

    }
}
