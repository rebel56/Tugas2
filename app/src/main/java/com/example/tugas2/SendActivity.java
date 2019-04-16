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


public class SendActivity extends AppCompatActivity {

    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfinish();
            }
        });
    }

            public void openfinish() {
                Intent intent = new Intent(this, FinishActivity.class);
                startActivity(intent);

    }
}