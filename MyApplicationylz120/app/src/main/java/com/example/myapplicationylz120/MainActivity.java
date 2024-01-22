package com.example.myapplicationylz120;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mregisterbutton;
    private Button menturingbutton;
    private EditText mEtuser;
    private EditText mEtPassword;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mregisterbutton=findViewById(R.id.register_button);
        mEtuser=findViewById(R.id.et_1);
        mEtPassword=findViewById(R.id.et_2);
        mregisterbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=null;
                intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        menturingbutton=findViewById(R.id.entering_button);
        menturingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        menturingbutton.setOnClickListener(this);
    }
    public void onClick(View view){
        String username=mEtuser.getText().toString();
        String password=mEtPassword.getText().toString();
        Intent intent=null;
        if(username.equals("ylz")&&password.equals(("123456"))){
            intent=new Intent(MainActivity.this,MainActivity3.class);
            startActivity(intent);
        }else{

        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}