package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Historia5 extends AppCompatActivity {

    Translator translator = new Translator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia5);

        int contador = R.id.text_morse0;
        for (String morse : translator.getCodes()){

            //  String text_morse = R.id.text_morse + Integer.toString(contador);
            //  int id= Integer.parseInt();
            TextView letra = findViewById(contador);
            letra.setText(morse);
            contador++;


        }
        // while (contador < 36){
    }

}

