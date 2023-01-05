package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name, password;
        EditText username,pass;
        Button btn;

         username = findViewById(R.id.username);
         pass = findViewById(R.id.password);
         btn = findViewById(R.id.button);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                String name = username.getText().toString();
                 String password = pass.getText().toString();
                 if(name.equals("abhijith")&&password.equals("password")){
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                    Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_SHORT).show();
                 }
                 else{
                     Toast.makeText(MainActivity.this,"invalid Credentials",Toast.LENGTH_SHORT).show();

                 }
             }
         });






    }
}