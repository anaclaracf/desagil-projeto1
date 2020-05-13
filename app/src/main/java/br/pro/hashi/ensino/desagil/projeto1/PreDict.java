package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PreDict extends AppCompatActivity {
    @Override
    public void onBackPressed()
    {
        startActivity(new Intent(PreDict.this, MainActivity.class));
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_dict);

        Button buttonExample1 = findViewById(R.id.button_example1);
        Button buttonExample2 = findViewById(R.id.button_example2);



        buttonExample1.setOnClickListener((view) -> {
            Intent intent = new Intent(PreDict.this, Historia4.class);
            startActivity(intent);
            onPause();
        });


        buttonExample2.setOnClickListener((view) -> {
            Intent intent = new Intent(PreDict.this, Historia5.class);
            startActivity(intent);
            onPause();
        });
    }
}
