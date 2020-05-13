package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.widget.TextView;

import java.io.CharArrayReader;
import java.nio.file.NotDirectoryException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Historia4 extends AppCompatActivity {

    Translator translator = new Translator();
    HashMap <Character, Node> map1= translator.getMap();
    LinkedList <Character> map= new LinkedList<>();

    TreeMap<Character, Node> sorted = new TreeMap<>(map1);
    Set<Map.Entry<Character, Node>> mappings = sorted.entrySet();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia4);



        for(Map.Entry<Character,Node> mapping : mappings){
            map.add(mapping.getKey());
        }



        TextView romano0 = findViewById(R.id.text_romano0);
        romano0.setText(""+ map.get(2));
        TextView romano1 = findViewById(R.id.text_romano1);
        romano1.setText("" + map.get(3));

        TextView romano2 = findViewById(R.id.text_romano2);
        romano2.setText("" + map.get(4));
        TextView romano3 = findViewById(R.id.text_romano3);
        romano3.setText("" + map.get(5));

        TextView romano4 = findViewById(R.id.text_romano4);
        romano4.setText("" + map.get(6));
        TextView romano5 = findViewById(R.id.text_romano5);
        romano5.setText("" + map.get(7));
        TextView romano6 = findViewById(R.id.text_romano6);
        romano6.setText("" + map.get(8));
        TextView romano7 = findViewById(R.id.text_romano7);
        romano7.setText("" + map.get(9));
        TextView romano8 = findViewById(R.id.text_romano8);
        romano8.setText("" + map.get(10));
        TextView romano9 = findViewById(R.id.text_romano9);
        romano9.setText("" + map.get(11));
        TextView romano10 = findViewById(R.id.text_romano10);
        romano10.setText("" + map.get(12));
        TextView romano11 = findViewById(R.id.text_romano11);
        romano11.setText("" + map.get(13));
        TextView romano12 = findViewById(R.id.text_romano12);
        romano12.setText("" + map.get(14));
        TextView romano13 = findViewById(R.id.text_romano13);
        romano13.setText("" + map.get(15));
        TextView romano14 = findViewById(R.id.text_romano14);
        romano14.setText("" + map.get(16));
        TextView romano15= findViewById(R.id.text_romano15);
        romano15.setText("" + map.get(17));
        TextView romano16= findViewById(R.id.text_romano16);
        romano16.setText("" + map.get(18));
        TextView romano17 = findViewById(R.id.text_romano17);
        romano17.setText("" + map.get(19));
        TextView romano18 = findViewById(R.id.text_romano18);
        romano18.setText("" + map.get(20));
        TextView romano19 = findViewById(R.id.text_romano19);
        romano19.setText("" + map.get(21));
        TextView romano20 = findViewById(R.id.text_romano20);
        romano20.setText("" + map.get(22));
        TextView romano21 = findViewById(R.id.text_romano21);
        romano21.setText("" + map.get(23));
        TextView romano22 = findViewById(R.id.text_romano22);
        romano22.setText("" + map.get(24));
        TextView romano23 = findViewById(R.id.text_romano23);
        romano23.setText("" + map.get(25));
        TextView romano24 = findViewById(R.id.text_romano24);
        romano24.setText("" + map.get(26));
        TextView romano25 = findViewById(R.id.text_romano25);
        romano25.setText("" + map.get(27));
        TextView romano26 = findViewById(R.id.text_romano26);
        romano26.setText("" + map.get(28));
        TextView romano27 = findViewById(R.id.text_romano27);
        romano27.setText("" + map.get(29));
        TextView romano28 = findViewById(R.id.text_romano28);
        romano28.setText("" + map.get(30));
        TextView romano29 = findViewById(R.id.text_romano29);
        romano29.setText("" + map.get(31));
        TextView romano30 = findViewById(R.id.text_romano30);
        romano30.setText("" + map.get(32));
        TextView romano31 = findViewById(R.id.text_romano31);
        romano31.setText("" + map.get(33));
        TextView romano32 = findViewById(R.id.text_romano32);
        romano32.setText("" + map.get(34));
        TextView romano33 = findViewById(R.id.text_romano33);
        romano33.setText("" + map.get(35));
        TextView romano34 = findViewById(R.id.text_romano34);
        romano34.setText("" + map.get(36));
        TextView romano35 = findViewById(R.id.text_romano35);
        romano35.setText("" + map.get(37));




        TextView morse0 = findViewById(R.id.text_morse0);
        morse0.setText(translator.charToMorse(map.get(2)));
        TextView morse1 = findViewById(R.id.text_morse1);
        morse1.setText(translator.charToMorse(map.get(3)));

        TextView morse2 = findViewById(R.id.text_morse2);
        morse2.setText(translator.charToMorse(map.get(4)));
        TextView morse3 = findViewById(R.id.text_morse3);
        morse3.setText(translator.charToMorse(map.get(5)));

        TextView morse4 = findViewById(R.id.text_morse4);
        morse4.setText(translator.charToMorse(map.get(6)));
        TextView morse5 = findViewById(R.id.text_morse5);
        morse5.setText(translator.charToMorse(map.get(7)));
        TextView morse6 = findViewById(R.id.text_morse6);
        morse6.setText(translator.charToMorse(map.get(8)));
        TextView morse7 = findViewById(R.id.text_morse7);
        morse7.setText(translator.charToMorse(map.get(9)));
        TextView morse8 = findViewById(R.id.text_morse8);
        morse8.setText(translator.charToMorse(map.get(10)));
        TextView morse9 = findViewById(R.id.text_morse9);
        morse9.setText(translator.charToMorse(map.get(11)));
        TextView morse10 = findViewById(R.id.text_morse10);
        morse10.setText(translator.charToMorse(map.get(12)));
        TextView morse11 = findViewById(R.id.text_morse11);
        morse11.setText(translator.charToMorse(map.get(13)));
        TextView morse12 = findViewById(R.id.text_morse12);
        morse12.setText(translator.charToMorse(map.get(14)));
        TextView morse13 = findViewById(R.id.text_morse13);
        morse13.setText(translator.charToMorse(map.get(15)));
        TextView morse14 = findViewById(R.id.text_morse14);
        morse14.setText(translator.charToMorse(map.get(16)));
        TextView morse15= findViewById(R.id.text_morse15);
        morse15.setText(translator.charToMorse(map.get(17)));
        TextView morse16= findViewById(R.id.text_morse16);
        morse16.setText(translator.charToMorse(map.get(18)));
        TextView morse17 = findViewById(R.id.text_morse17);
        morse17.setText(translator.charToMorse(map.get(19)));
        TextView morse18 = findViewById(R.id.text_morse18);
        morse18.setText(translator.charToMorse(map.get(20)));
        TextView morse19 = findViewById(R.id.text_morse19);
        morse19.setText(translator.charToMorse(map.get(21)));
        TextView morse20 = findViewById(R.id.text_morse20);
        morse20.setText(translator.charToMorse(map.get(22)));
        TextView morse21 = findViewById(R.id.text_morse21);
        morse21.setText(translator.charToMorse(map.get(23)));
        TextView morse22 = findViewById(R.id.text_morse22);
        morse22.setText(translator.charToMorse(map.get(24)));
        TextView morse23 = findViewById(R.id.text_morse23);
        morse23.setText(translator.charToMorse(map.get(25)));
        TextView morse24 = findViewById(R.id.text_morse24);
        morse24.setText(translator.charToMorse(map.get(26)));
        TextView morse25 = findViewById(R.id.text_morse25);
        morse25.setText(translator.charToMorse(map.get(27)));
        TextView morse26 = findViewById(R.id.text_morse26);
        morse26.setText(translator.charToMorse(map.get(28)));
        TextView morse27 = findViewById(R.id.text_morse27);
        morse27.setText(translator.charToMorse(map.get(29)));
        TextView morse28 = findViewById(R.id.text_morse28);
        morse28.setText(translator.charToMorse(map.get(30)));
        TextView morse29 = findViewById(R.id.text_morse29);
        morse29.setText(translator.charToMorse(map.get(31)));
        TextView morse30 = findViewById(R.id.text_morse30);
        morse30.setText(translator.charToMorse(map.get(32)));
        TextView morse31 = findViewById(R.id.text_morse31);
        morse31.setText(translator.charToMorse(map.get(33)));
        TextView morse32 = findViewById(R.id.text_morse32);
        morse32.setText(translator.charToMorse(map.get(34)));
        TextView morse33 = findViewById(R.id.text_morse33);
        morse33.setText(translator.charToMorse(map.get(35)));
        TextView morse34 = findViewById(R.id.text_morse34);
        morse34.setText(translator.charToMorse(map.get(36)));
        TextView morse35 = findViewById(R.id.text_morse35);
        morse35.setText(translator.charToMorse(map.get(37)));



    }



}





