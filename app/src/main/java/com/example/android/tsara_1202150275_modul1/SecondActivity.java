package com.example.android.tsara_1202150275_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView porsi, tempat, menu, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String HasilTempat = intent.getStringExtra("tempat");
        String HasilMenu = intent.getStringExtra("menu");
        String HasilJumlah = intent.getStringExtra("jumlah");
        String HasilHarga = intent.getStringExtra("Harga");

        int TotalHarga = Integer.valueOf(HasilHarga) * Integer.valueOf(HasilJumlah);

        tempat = (TextView) findViewById(R.id.textViewTempat);
        tempat.setText(HasilTempat);

        menu = (TextView) findViewById(R.id.textViewMenuNasi);
        menu.setText(HasilMenu);

        porsi = (TextView) findViewById(R.id.textViewJumlahPorsi);
        porsi.setText(HasilJumlah);

        harga = (TextView) findViewById(R.id.textViewJumlahHarga);
        harga.setText(String.valueOf(TotalHarga));

        if (TotalHarga > 65000) {
            Toast toast1 = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast1.show();
        } else {
            Toast toast1 = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast1.show();
        }
    }
}
