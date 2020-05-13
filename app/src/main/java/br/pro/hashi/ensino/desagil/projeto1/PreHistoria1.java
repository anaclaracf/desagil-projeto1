package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PreHistoria1 extends AppCompatActivity {

    private void startPreHistoria1Activity(){
        Intent intent = new Intent(this, Historia1.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed()
    {
        startActivity(new Intent(PreHistoria1.this, MainActivity.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_historia1);
        Button buttonExample1 = findViewById(R.id.button_example1);
        Button buttonExample2 = findViewById(R.id.button_example2);
        Button buttonExample3 = findViewById(R.id.button_example3);
        Button buttonExample4 = findViewById(R.id.button_example4);


        buttonExample1.setOnClickListener((view) -> {
            Intent intent = new Intent(PreHistoria1.this, Historia1.class);
            intent.putExtra("bla", buttonExample1.getText().toString());
            startActivity(intent);
            onPause();
        });

        buttonExample2.setOnClickListener((view) -> {
            Intent intent = new Intent(PreHistoria1.this, Historia1.class);
            intent.putExtra("bla", buttonExample2.getText().toString());
            startActivity(intent);
            onPause();
        });

        buttonExample3.setOnClickListener((view) -> {
            Intent intent = new Intent(PreHistoria1.this, Historia1.class);
            intent.putExtra("bla", buttonExample3.getText().toString());
            startActivity(intent);
            onPause();
        });

        buttonExample4.setOnClickListener((view) -> {
            Intent intent = new Intent(PreHistoria1.this, Historia1.class);
            intent.putExtra("bla", buttonExample4.getText().toString());
            startActivity(intent);
            onPause();
        });


    }
}
