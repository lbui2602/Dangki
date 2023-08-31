package com.example.dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {
   TextView tvTK,tvMK,tvTK2,tvMK2;
   Button tiep;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvTK =(TextView) findViewById(R.id.taiKhoanHome);
        tvMK=(TextView) findViewById(R.id.matKhauHome);
        tvTK2 =(TextView) findViewById(R.id.taiKhoanHome2);
        tvMK2=(TextView) findViewById(R.id.matKhauHome2);

        Intent intent1=getIntent();
        Bundle bundle =intent1.getExtras();
        String str = bundle.getString("tk");
        String str2 = bundle.getString("mk");
        tvTK2.setText(str);
        tvMK2.setText(str2);

        Intent intent=getIntent();
        User user= (User) intent.getExtras().get("userDN");
        tvTK.setText(user.getTaiKhoan());
        tvMK.setText(user.getMatKhau());


        tiep=(Button) findViewById(R.id.btnTiep);
        tiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ActivityHome.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}