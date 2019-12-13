package com.example.tugasakhirsem;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class CreateDosenActivity extends AppCompatActivity {
    EditText edtNama, edtNidn, edtAlamat, edtEmail, edtGelar;
    Button btnSave, btnBrowse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_dosen);
        this.setTitle("SI KRS - Hai Admin");

        edtNama = (EditText)findViewById(R.id.editText);
        edtNidn = (EditText)findViewById(R.id.editText2);
        edtAlamat = (EditText)findViewById(R.id.editText6);
        edtEmail = (EditText)findViewById(R.id.editText5);
        edtGelar = (EditText)findViewById(R.id.editText7);



 //       checkUpdate();
//        Button btnDaftarKrs = (Button)findViewById(R.id.btnSimpanDosen);
//        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(CreateDosenActivity.this, HomeAdmin.class);
//                startActivity(intent);
//            }
//        });
        Button btnSave = (Button) findViewById(R.id.btnSimpanDosen);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean isValid = true;

                //Validation

                if (edtNama.getText().toString().matches("")) {
                    edtNama.setError("Silahkan mengisi Nama Dosen");
                    isValid = false;
                }

                if (edtNidn.getText().toString().matches("")) {
                    edtNidn.setError("Silahkan mengisi NIM Dosen");
                    isValid = false;
                }

                if (edtAlamat.getText().toString().matches("")) {
                    edtAlamat.setError("Silahkan mengisi Alamat Dosen");
                    isValid = false;
                }

                if (edtEmail.getText().toString().matches("")) {
                    edtEmail.setError("Silahkan mengisi Email Dosen");
                    isValid = false;
                }

                if (edtGelar.getText().toString().matches("")) {
                    edtGelar.setError("Silahkan mengisi Gelar Dosen");
                }



            }
        });

    };
}
