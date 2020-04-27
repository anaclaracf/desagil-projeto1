package br.pro.hashi.ensino.desagil.projeto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.pm.PackageManager;

public class Historia1 extends AppCompatActivity {

    private static final int REQUEST_SEND_SMS = 0;

    private void startHistoria3() {

        Intent intent = new Intent(this, Historia3.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia1);
        TextView answer = (TextView)findViewById(R.id.display_msg1);
        String valor = getIntent().getStringExtra("bla");
        answer.setText(valor);

        Button buttonExample = findViewById(R.id.button_example);

        buttonExample.setOnClickListener((view) -> {

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
                Intent intent = new Intent(Historia1.this, Historia3.class);
                intent.putExtra("blabla", valor);
                startActivity(intent);
                finish();
            } else {
                String[] permissions = new String[]{
                        Manifest.permission.SEND_SMS,
                };

                ActivityCompat.requestPermissions(this, permissions, REQUEST_SEND_SMS);
            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode == REQUEST_SEND_SMS && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            startHistoria3();
        }
    }
}
