package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.LinkedList;

public class Historia5 extends AppCompatActivity {

    Translator translator = new Translator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia5);

        LinkedList<String> codes = translator.getCodes();

        TextView morse0 = findViewById(R.id.text_morse0);
        morse0.setText(codes.get(0));
        TextView morse1 = findViewById(R.id.text_morse1);
        morse1.setText(codes.get(1));
        TextView morse2 = findViewById(R.id.text_morse2);
        morse2.setText(codes.get(2));
        TextView morse3 = findViewById(R.id.text_morse3);
        morse3.setText(codes.get(3));
        TextView morse4 = findViewById(R.id.text_morse4);
        morse4.setText(codes.get(4));
        TextView morse5 = findViewById(R.id.text_morse5);
        morse5.setText(codes.get(5));
        TextView morse6 = findViewById(R.id.text_morse6);
        morse6.setText(codes.get(6));
        TextView morse7 = findViewById(R.id.text_morse7);
        morse7.setText(codes.get(7));
        TextView morse8 = findViewById(R.id.text_morse8);
        morse8.setText(codes.get(8));
        TextView morse9 = findViewById(R.id.text_morse9);
        morse9.setText(codes.get(9));
        TextView morse10 = findViewById(R.id.text_morse10);
        morse10.setText(codes.get(10));
        TextView morse11 = findViewById(R.id.text_morse11);
        morse11.setText(codes.get(11));
        TextView morse12 = findViewById(R.id.text_morse12);
        morse12.setText(codes.get(12));
        TextView morse13 = findViewById(R.id.text_morse13);
        morse13.setText(codes.get(13));
        TextView morse14 = findViewById(R.id.text_morse14);
        morse14.setText(codes.get(14));
        TextView morse15= findViewById(R.id.text_morse15);
        morse15.setText(codes.get(15));
        TextView morse16= findViewById(R.id.text_morse16);
        morse16.setText(codes.get(16));
        TextView morse17 = findViewById(R.id.text_morse17);
        morse17.setText(codes.get(17));
        TextView morse18 = findViewById(R.id.text_morse18);
        morse18.setText(codes.get(18));
        TextView morse19 = findViewById(R.id.text_morse19);
        morse19.setText(codes.get(19));
        TextView morse20 = findViewById(R.id.text_morse20);
        morse20.setText(codes.get(20));
        TextView morse21 = findViewById(R.id.text_morse21);
        morse21.setText(codes.get(21));
        TextView morse22 = findViewById(R.id.text_morse22);
        morse22.setText(codes.get(22));
        TextView morse23 = findViewById(R.id.text_morse23);
        morse23.setText(codes.get(23));
        TextView morse24 = findViewById(R.id.text_morse24);
        morse24.setText(codes.get(24));
        TextView morse25 = findViewById(R.id.text_morse25);
        morse25.setText(codes.get(25));
        TextView morse26 = findViewById(R.id.text_morse26);
        morse26.setText(codes.get(26));
        TextView morse27 = findViewById(R.id.text_morse27);
        morse27.setText(codes.get(27));
        TextView morse28 = findViewById(R.id.text_morse28);
        morse28.setText(codes.get(28));
        TextView morse29 = findViewById(R.id.text_morse29);
        morse29.setText(codes.get(29));
        TextView morse30 = findViewById(R.id.text_morse30);
        morse30.setText(codes.get(30));
        TextView morse31 = findViewById(R.id.text_morse31);
        morse31.setText(codes.get(31));
        TextView morse32 = findViewById(R.id.text_morse32);
        morse32.setText(codes.get(32));
        TextView morse33 = findViewById(R.id.text_morse33);
        morse33.setText(codes.get(33));
        TextView morse34 = findViewById(R.id.text_morse34);
        morse34.setText(codes.get(34));
        TextView morse35 = findViewById(R.id.text_morse35);
        morse35.setText(codes.get(35));

        Translator translator=new Translator();

        TextView romano0 = findViewById(R.id.text_romano0);
        romano0.setText(""+ translator.morseToChar(codes.get(0)));
        TextView romano1 = findViewById(R.id.text_romano1);
        romano1.setText(""+ translator.morseToChar(codes.get(1)));

        TextView romano2 = findViewById(R.id.text_romano2);
        romano2.setText(""+ translator.morseToChar(codes.get(2)));
        TextView romano3 = findViewById(R.id.text_romano3);
        romano3.setText(""+ translator.morseToChar(codes.get(3)));

        TextView romano4 = findViewById(R.id.text_romano4);
        romano4.setText(""+ translator.morseToChar(codes.get(4)));
        TextView romano5 = findViewById(R.id.text_romano5);
        romano5.setText(""+ translator.morseToChar(codes.get(5)));
        TextView romano6 = findViewById(R.id.text_romano6);
        romano6.setText(""+ translator.morseToChar(codes.get(6)));
        TextView romano7 = findViewById(R.id.text_romano7);
        romano7.setText(""+ translator.morseToChar(codes.get(7)));
        TextView romano8 = findViewById(R.id.text_romano8);
        romano8.setText(""+ translator.morseToChar(codes.get(8)));
        TextView romano9 = findViewById(R.id.text_romano9);
        romano9.setText(""+ translator.morseToChar(codes.get(9)));
        TextView romano10 = findViewById(R.id.text_romano10);
        romano10.setText(""+ translator.morseToChar(codes.get(10)));
        TextView romano11 = findViewById(R.id.text_romano11);
        romano11.setText(""+ translator.morseToChar(codes.get(11)));
        TextView romano12 = findViewById(R.id.text_romano12);
        romano12.setText(""+ translator.morseToChar(codes.get(12)));
        TextView romano13 = findViewById(R.id.text_romano13);
        romano13.setText(""+ translator.morseToChar(codes.get(13)));
        TextView romano14 = findViewById(R.id.text_romano14);
        romano14.setText(""+ translator.morseToChar(codes.get(14)));
        TextView romano15= findViewById(R.id.text_romano15);
        romano15.setText(""+ translator.morseToChar(codes.get(15)));
        TextView romano16= findViewById(R.id.text_romano16);
        romano16.setText(""+ translator.morseToChar(codes.get(16)));
        TextView romano17 = findViewById(R.id.text_romano17);
        romano17.setText(""+ translator.morseToChar(codes.get(17)));
        TextView romano18 = findViewById(R.id.text_romano18);
        romano18.setText(""+ translator.morseToChar(codes.get(18)));
        TextView romano19 = findViewById(R.id.text_romano19);
        romano19.setText(""+ translator.morseToChar(codes.get(19)));
        TextView romano20 = findViewById(R.id.text_romano20);
        romano20.setText(""+ translator.morseToChar(codes.get(20)));
        TextView romano21 = findViewById(R.id.text_romano21);
        romano21.setText(""+ translator.morseToChar(codes.get(21)));
        TextView romano22 = findViewById(R.id.text_romano22);
        romano22.setText(""+ translator.morseToChar(codes.get(22)));
        TextView romano23 = findViewById(R.id.text_romano23);
        romano23.setText(""+ translator.morseToChar(codes.get(23)));
        TextView romano24 = findViewById(R.id.text_romano24);
        romano24.setText(""+ translator.morseToChar(codes.get(24)));
        TextView romano25 = findViewById(R.id.text_romano25);
        romano25.setText(""+ translator.morseToChar(codes.get(25)));
        TextView romano26 = findViewById(R.id.text_romano26);
        romano26.setText(""+ translator.morseToChar(codes.get(26)));
        TextView romano27 = findViewById(R.id.text_romano27);
        romano27.setText(""+ translator.morseToChar(codes.get(27)));
        TextView romano28 = findViewById(R.id.text_romano28);
        romano28.setText(""+ translator.morseToChar(codes.get(28)));
        TextView romano29 = findViewById(R.id.text_romano29);
        romano29.setText(""+ translator.morseToChar(codes.get(29)));
        TextView romano30 = findViewById(R.id.text_romano30);
        romano30.setText(""+ translator.morseToChar(codes.get(30)));
        TextView romano31 = findViewById(R.id.text_romano31);
        romano31.setText(""+ translator.morseToChar(codes.get(31)));
        TextView romano32 = findViewById(R.id.text_romano32);
        romano32.setText(""+ translator.morseToChar(codes.get(32)));
        TextView romano33 = findViewById(R.id.text_romano33);
        romano33.setText(""+ translator.morseToChar(codes.get(33)));
        TextView romano34 = findViewById(R.id.text_romano34);
        romano34.setText(""+ translator.morseToChar(codes.get(34)));
        TextView romano35 = findViewById(R.id.text_romano35);
        romano35.setText(""+ translator.morseToChar(codes.get(35)));
    }

}

