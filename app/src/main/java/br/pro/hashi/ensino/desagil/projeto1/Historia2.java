package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Historia2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia2);

        TextView textMorse = findViewById(R.id.text_morse);
        Button buttonwrite = findViewById(R.id.button_write);
        Button buttonbar = findViewById(R.id.button_bar);
        Button buttonspace = findViewById(R.id.button_space);



        buttonwrite.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, Historia2.class);
            startActivity(intent);
            onPause();
        });
//
//        buttonbar.setOnClickListener((view) -> {
//            Intent intent = new Intent(MainActivity.this, Historia2.class);
//            startActivity(intent);
//            onPause();
//        });
//        buttonspace.setOnClickListener((view) -> {
//            Intent intent = new Intent(MainActivity.this, Historia2.class);
//            startActivity(intent);
//            onPause();
//        });
    }



}
