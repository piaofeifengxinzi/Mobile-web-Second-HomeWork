package com.example.shangji2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQ_CODE = 123;
    private Button logbutton;
    private TextView textView;
    private EditText username;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logbutton = (Button)findViewById(R.id.logbuttonid);
        textView = (TextView)findViewById(R.id.title);
        username = (EditText)findViewById(R.id.usernametext);
        password = (EditText)findViewById(R.id.passwordtext);
        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Calculater.class);
                intent.putExtra("username", username.getText().toString());
                intent.putExtra("password", password.getText().toString());
                username.setText("");
                password.setText("");
                startActivityForResult(intent,REQ_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent intent){
        if(requestCode == REQ_CODE){
            String data = intent.getStringExtra("result");
            if(data.equals("")){

            }else{
                textView.setText("Calculate 34*25="+data);
                Toast.makeText(MainActivity.this,"你计算的结果为："+data,Toast.LENGTH_LONG).show();
            }
        }
    }
}
