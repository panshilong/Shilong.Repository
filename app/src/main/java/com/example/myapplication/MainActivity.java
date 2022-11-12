package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {
//        这三个经常是同时出现的
    private List<Map<String,Object>> lists;
    private SimpleAdapter adapter;
    private ListView listView;
    //    定义数据
    private String[] theme = {"张三","李四","王五"};
    private String[] content ={"我是张三，你好","我是李四，你好","我是王五，你好"};
    private int[] imageViews = {R.drawable.cat,R.drawable.dog,R.drawable.elephant};


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    //检查是否已经授予权限
                    if (!Settings.canDrawOverlays(MainActivity.this)) {
                        //若未授权则请求权限
                        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
                        intent.setData(Uri.parse("package:" + getPackageName()));
                        startActivityForResult(intent, 0);
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FloatBallView.getInstance(MainActivity.this).createFloatView();

            }
        });

//这边是点击悬浮按钮的响应事件

        FloatBallView.getInstance(MainActivity.this).onFloatViewClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击了悬浮球", Toast.LENGTH_LONG).show();
            }
        });



//        listView = (ListView)  findViewById(R.id.ll1);
//        Log.d("myTag", findViewById(R.id.ll1).toString());
////        Log.d("TAG", listView.toString());
//////        准备数据源
//        lists = new ArrayList<>();
//        for(int i = 0;i < theme.length;i++){
//            Map<String,Object> map =new HashMap<>();
//            map.put("image",imageViews[i]);
//            map.put("theme",theme[i]);
//            map.put("content",content[i]);
//            lists.add(map);
//        }
//        adapter = new SimpleAdapter(MainActivity.this,lists,R.layout.myitems
//                ,new String[]{"image","theme","content"}
//                ,new int[]{R.id.image1,R.id.text1,R.id.text2});
//
//        if(null==listView){
////            Log.d("TAG", "空");
//            Log.d("myTag", "This is my message1");
//        }
//        else{
//            if(null!=adapter){
//                listView.setAdapter(adapter);
//                Log.d("myTag", "This is my message2");
//            }else {
////                Log.d("TAG", "空2");
//                Log.d("myTag", "This is my message3");
//            }

//        }



    }
}