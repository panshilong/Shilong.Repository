package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SC3_2_MainActivity extends AppCompatActivity {

    private static final String TAG = "优秀";
    private Button sc3_2_tanchuang_but;
    private Button sc3_2_alertview_ok_but;
    private Button sc3_2_alertview_cancel_but;
    private Toast sc3toast;

    private AlertDialog thedialog;

    private View view;
    private AlertDialog.Builder builder;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sc3_2);

        view= LayoutInflater.from(this).inflate(R.layout.sc3_2_alertview, null);
        builder=new AlertDialog.Builder(this);
        builder.setView(view);

//        sc3toast=new Toast(this);
//        sc3toast.makeText(this,"你点击了确定按钮",Toast.LENGTH_SHORT);

        sc3_2_tanchuang_but= (Button) findViewById(R.id.sc3_2_tanchuang);
        sc3_2_alertview_ok_but=(Button) view.findViewById(R.id.sc3_2_alertview_ok);
        sc3_2_alertview_cancel_but=(Button)view.findViewById(R.id.sc3_2_alertview_cancel);


//        if（null!=sc3_2_alertview_ok_but）
        Log.d(TAG,"不是很好啊哈哈哈 啊啊 哈哈"+sc3_2_alertview_ok_but.toString());

        sc3_2_tanchuang_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                thedialog= builder.show();
            }
        });
//
        sc3_2_alertview_ok_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SC3_2_MainActivity.this,"你点击了确定按钮",Toast.LENGTH_SHORT).show();
            }
        });

        sc3_2_alertview_cancel_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (null!=thedialog){
                    thedialog.dismiss();
                }
            }
        });

    }




}