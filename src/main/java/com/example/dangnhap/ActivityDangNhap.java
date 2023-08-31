package com.example.dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class ActivityDangNhap extends AppCompatActivity {
    EditText edtTK,edtMK;
    Button btnDN;
    CheckBox cbGN;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        edtTK =(EditText) findViewById(R.id.edtTenDangNhap);
        edtMK=(EditText) findViewById(R.id.edtMatKhau);
        btnDN=(Button) findViewById(R.id.btnDangNhap2);
        cbGN=(CheckBox) findViewById(R.id.cbGhiNho);
        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDangNhap.this,ActivityHome.class);
                User user=new User(edtTK.getText().toString().trim(),edtMK.getText().toString().trim());
                Bundle bundle=new Bundle();
                bundle.putSerializable("userDN",user);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}