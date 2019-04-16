package com.example.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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


public class RegisterActivity extends AppCompatActivity {

    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openalmost();
            }
        });
    }

    public void openalmost(){
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
    }
}