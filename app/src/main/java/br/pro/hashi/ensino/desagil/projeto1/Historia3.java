package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Historia3 extends AppCompatActivity {

    private static final int PICK_CONTACT = 0;

    private void showToast(String text) {
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia3);
        TextView answer = (TextView)findViewById(R.id.text_message);
        String valor = getIntent().getStringExtra("blabla");
        answer.setText(valor);

        TextView textPhone = findViewById(R.id.text_phone);
        Button buttonSend = findViewById(R.id.button_send);
        Button buttonContacts = findViewById(R.id.button_contacts);

        buttonContacts.setOnClickListener((view) -> {
            Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
            startActivityForResult(intent, PICK_CONTACT);
        });

        buttonSend.setOnClickListener((view) -> {
            String message = answer.getText().toString();
            String phone = textPhone.getText().toString();

            SmsManager manager = SmsManager.getDefault();

            if (phone.isEmpty()) {
                showToast("Nenhum contato foi selecionado!");
                return;
            }else{
                showToast("Mensagem enviada com sucesso!");
                answer.setText("");
                textPhone.setText("");
                manager.sendTextMessage(phone, null, message, null, null);
                return;
            }

        });
    }

    @Override
    public void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);
        TextView textPhone = findViewById(R.id.text_phone);

        switch (reqCode) {
            case (PICK_CONTACT) :
                if (resultCode == Activity.RESULT_OK) {
                    Uri contactData = data.getData();
                    Cursor c =  getContentResolver().query(contactData, null, null, null, null);
                    if (c.moveToFirst()) {
                        String name = c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                        textPhone.setText(name);
                    }
                }
                break;
        }
    }


}
