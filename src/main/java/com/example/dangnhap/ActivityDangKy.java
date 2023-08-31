package com.example.dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityDangKy extends AppCompatActivity {
    EditText edtTK2,edtMK2,edtMKLai;
    Button btnDK;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        edtTK2 =(EditText) findViewById(R.id.edtTenDangNhap2);
        edtMK2=(EditText) findViewById(R.id.edtMatKhau2);
        edtMKLai=(EditText) findViewById(R.id.edtMatKhau22);
        btnDK =(Button) findViewById(R.id.btnDangKy2);

        btnDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User userDK =new User(edtTK2.getText().toString().trim(),edtMK2.getText().toString().trim());
                Intent intent=new Intent(ActivityDangKy.this,ActivityHome.class);
                Bundle bundle=new Bundle();
                bundle.putString("tk",edtTK2.getText().toString().trim());
                bundle.putString("mk",edtMK2.getText().toString().trim());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}