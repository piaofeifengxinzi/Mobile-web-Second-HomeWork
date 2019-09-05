package com.example.shangji2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculater extends AppCompatActivity {
    private int wei = 0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonadd;
    private Button buttonjian;
    private Button buttoncheng;
    private Button buttonchu;
    private Button buttonC;
    private Button buttondian;
    private Button math;

    private TextView editText;

    private String result = "";
    private String finalresult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);
        editText = (TextView)findViewById(R.id.textView);
        init();
        ButtonInit();
        setButtonListener();
    }

    private void init(){
        Intent intent = getIntent();
        final String username = intent.getStringExtra("username");
        final String password = intent.getStringExtra("password");
        finalresult = editText.getText().toString();
        if(username.equals("zjl")&& password.equals("zjl")){
            Toast.makeText(Calculater.this,"欢迎使用",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(Calculater.this,"用户名或者密码错误",Toast.LENGTH_LONG).show();
            finish();
        }
    }
    private void ButtonInit(){
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonadd = (Button)findViewById(R.id.buttonadd);
        buttonjian = (Button)findViewById(R.id.buttonjian);
        buttoncheng = (Button)findViewById(R.id.buttoncheng);
        buttonchu = (Button)findViewById(R.id.buttonchu);
        buttonC = (Button)findViewById(R.id.buttonC);
        buttondian = (Button)findViewById(R.id.buttondian);
        math = (Button)findViewById(R.id.math);
    }
    private void setButtonListener(){
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "0";

                editText.setText(result);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "1";
                editText.setText(result);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "2";
                editText.setText(result);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "3";
                editText.setText(result);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "4";
                editText.setText(result);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "5";
                editText.setText(result);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "6";
                editText.setText(result);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "7";
                editText.setText(result);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "8";
                editText.setText(result);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "9";
                editText.setText(result);
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Toast.makeText(Calculater.this,"功能暂未实现",Toast.LENGTH_SHORT).show();
            }
        });
        buttonjian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calculater.this,"功能暂未实现",Toast.LENGTH_SHORT).show();
            }
        });
        buttoncheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calculater.this,"功能暂未实现",Toast.LENGTH_SHORT).show();
            }
        });
        buttonchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calculater.this,"功能暂未实现",Toast.LENGTH_SHORT).show();
            }
        });
        buttondian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Calculater.this,"功能暂未实现",Toast.LENGTH_SHORT).show();
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "";
                editText.setText(result);
            }
        });
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("result",result);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }


}
