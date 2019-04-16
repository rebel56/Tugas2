package com.example.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*
 * NIM      : 10116056
 * Nama     : Bagea Junan Muhammad
 * Kelas    : AKB2
 * CHANGELOG
 * Aplikasi V0.1 15/04/2019 19.30
 * - Membuat Halaman Awal
 * - Membuat Halaman Register
 * - Membuat Halaman Verify
 * - Membuat Halaman Send
 * - Membuat Halaman Terakhir
 * Selesai 17/04/2019 01.51
 */


public class MainActivity extends AppCompatActivity {

    private TextView textview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview3 = (TextView) findViewById(R.id.textView3);
        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });
    }

    public void openRegisterActivity(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
