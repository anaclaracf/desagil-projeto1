package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Historia4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia4);
        Button buttonExample1 = findViewById(R.id.button_example6);

        buttonExample1.setOnClickListener((view) -> {
            Intent intent = new Intent(Historia4.this, Historia1.class);
            intent.putExtra("bla", buttonExample1.getText().toString());
            startActivity(intent);
            onPause();
        });
    }
}
