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
    private String result1 = "";
    private String finalresult = "";

    private boolean isNext = false;

    private int state = -1;

    private String jieguo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);
        editText = (TextView)findViewById(R.id.textView);
        ButtonInit();
        setButtonListener();
        init();
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
            finishselect("");
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
                if(isNext){
                    result1 = result1 + "0";
                    finalresult += "0";
                }else {
                    result = result + "0";
                    finalresult = result;
                }
                editText.setText(finalresult);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNext){
                    result1 = result1 + "1";
                    finalresult += "1";
                }else {
                    result = result + "1";
                    finalresult = result;
                }
                editText.setText(finalresult);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNext){
                    result1 = result1 + "2";
                    finalresult += "2";
                }else {
                    result = result + "2";
                    finalresult = result;
                }
                editText.setText(finalresult);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNext){
                    result1 = result1 + "3";
                    finalresult += "3";
                }else {
                    result = result + "3";
                    finalresult = result;
                }
                editText.setText(finalresult);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNext){
                    result1 = result1 + "4";
                    finalresult += "4";
                }else {
                    result = result + "4";
                    finalresult = result;
                }
                editText.setText(finalresult);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNext){
                    result1 = result1 + "5";
                    finalresult += "5";
                }else {
                    result = result + "5";
                    finalresult = result;
                }
                editText.setText(finalresult);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNext){
                    result1 = result1 + "6";
                    finalresult += "6";
                }else {
                    result = result + "6";
                    finalresult = result;
                }
                editText.setText(finalresult);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNext){
                    result1 = result1 + "7";
                    finalresult += "7";
                }else {
                    result = result + "7";
                    finalresult = result;
                }
                editText.setText(finalresult);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNext){
                    result1 = result1 + "8";
                    finalresult += "8";
                }else {
                    result = result + "8";
                    finalresult = result;
                }
                editText.setText(finalresult);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNext){
                    result1 = result1 + "9";
                    finalresult += "9";
                }else {
                    result = result + "9";
                    finalresult = result;
                }
                editText.setText(finalresult);
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //Toast.makeText(Calculater.this,"功能暂未实现",Toast.LENGTH_SHORT).show();
                if(result.equals("")){
                    isNext = false;
                }else{
                    isNext = true;
                }
                if(state != -1){
                    finalresult = finalresult.substring(0,finalresult.length()-1);
                }
                finalresult += "+";
                editText.setText(finalresult);
                state = 0;
            }
        });
        buttonjian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.equals("")){
                    isNext = false;
                }else{
                    isNext = true;
                }
                if(state != -1){
                    finalresult = finalresult.substring(0,finalresult.length()-1);
                }
                finalresult += "-";
                editText.setText(finalresult);
                state = 1;
            }
        });
        buttoncheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.equals("")){
                    isNext = false;
                }else{
                    isNext = true;
                }
                if(state != -1){
                    finalresult = finalresult.substring(0,finalresult.length()-1);
                }
                finalresult += "*";
                editText.setText(finalresult);
                state = 2;
            }
        });
        buttonchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.equals("")){
                    isNext = false;
                }else{
                    isNext = true;
                }
                if(state != -1){
                    finalresult = finalresult.substring(0,finalresult.length()-1);
                }
                finalresult += "/";
                editText.setText(finalresult);
                state = 3;
            }
        });
        buttondian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (state){
                    case 0:
                        editText.setText(result+"+"+result1+"="+String.valueOf(Integer.valueOf(result)+Integer.valueOf(result1)));
                        jieguo = String.valueOf(Integer.valueOf(result)+Integer.valueOf(result1));
                        state = -1;
                        break;
                    case 1:
                        editText.setText(result+"-"+result1+"="+String.valueOf(Integer.valueOf(result)-Integer.valueOf(result1)));
                        jieguo = String.valueOf(Integer.valueOf(result)-Integer.valueOf(result1));
                        state = -1;
                        break;
                    case 2:
                        editText.setText(result+"*"+result1+"="+String.valueOf(Integer.valueOf(result)*Integer.valueOf(result1)));
                        jieguo = String.valueOf(Integer.valueOf(result)*Integer.valueOf(result1));
                        state = -1;
                        break;
                    case 3:
                        editText.setText(result+"/"+result1+"="+String.valueOf(Integer.valueOf(result)/Integer.valueOf(result1)));
                        jieguo = String.valueOf(Integer.valueOf(result)/Integer.valueOf(result1));
                        state = -1;
                        break;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "";
                result1 = "";
                finalresult = "";
                state = -1;
                isNext = false;
                editText.setText(finalresult);
            }
        });
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("result",jieguo);
                setResult(RESULT_OK,intent);
                finishselect("result");
            }
        });
    }


    private void finishselect(String data){
        if(data == "result"){
            finish();
        }else{
            Intent intent = new Intent();
            intent.putExtra("result","");
            setResult(RESULT_OK,intent);
            finish();
        }
    }

    @Override
    public void onBackPressed(){
        finishselect("");
    }



}
