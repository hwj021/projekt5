package com.example.domek;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView polubien;
    private Button button;
    private Button button2;
    private int x = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        polubien = findViewById(R.id.polubien);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    zwieksz();
                }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usun();
            }
        });



    }
    private void zwieksz(){
        x++;
        polubien.setText(x + " polubień");
    }

    private void usun(){
        x--;

        if(x<0){
            x++;
        }
        polubien.setText(x + " polubień");
    }
}