package com.test.giaodienprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp_Activity extends AppCompatActivity {
    EditText edtUser, edtPassword;
    Button btnLogin, btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtUser = (EditText)findViewById(R.id.editTextUser);
        edtPassword = (EditText)findViewById(R.id.editTextPassword);
        btnLogin = (Button)findViewById(R.id.buttonLogin);
        btnSignIn = (Button)findViewById(R.id.buttonSignIn);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = "admin";
                String password = "12345";
                if(edtUser.getText().toString().equals(user) && edtPassword.getText().toString().equals(password)) {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công", Toast.LENGTH_LONG).show();
                    Intent myIntent=new Intent(SignUp_Activity.this, ProfileActivity.class);
                    startActivity(myIntent);
                }else {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thất bại", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent myIntent = new Intent(SignUp_Activity.this, SignIn_Activity.class);
                    startActivity(myIntent);
            }
        });
    }
}