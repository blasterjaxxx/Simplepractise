package com.example.android.oneforall;

import android.content.Intent;
//import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String userName = "login";
    final String passWord = "login";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnLogin = findViewById(R.id.btnlogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = ((EditText)findViewById(R.id.editText1)).getText().toString();
                String password = ((EditText) findViewById(R.id.editText2)).getText().toString();
                Intent i = new Intent(getBaseContext(), browser_Activity.class);
                if (password.equals(passWord) && username.equals(userName)) {
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Enable To Proceed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
