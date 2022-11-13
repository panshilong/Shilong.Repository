package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class SC3_3_MainActivity extends AppCompatActivity {

    private static final String TAG = "没事";
    private TextView mtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sc3_3);

        mtext=findViewById(R.id.sc3_3_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sc3_3_menu,menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();
        int a=0;
        switch (itemId){
            //TextSize
            case R.id.sc3_3_menu_fontsize_small:
                mtext.setTextSize(10);
                break;
            case R.id.sc3_3_menu_fontsize_middle:
                mtext.setTextSize(16);
                break;
            case R.id.sc3_3_menu_fontsize_large:
                mtext.setTextSize(20);
                break;


            //Normal
            case R.id.sc3_3_menu_normal:
                Toast.makeText(SC3_3_MainActivity.this,"你点击了Normal",Toast.LENGTH_SHORT).show();
                break;


            //TextColor
            case R.id.sc3_3_menu_color_red:
                //android.graphic.Color

                mtext.setTextColor(Color.RED);
                break;
            case R.id.sc3_3_menu_color_black:

                mtext.setTextColor(Color.BLACK);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    public void setTextSize(){

    }
}