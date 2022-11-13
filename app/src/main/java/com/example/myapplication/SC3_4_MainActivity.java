package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import android.app.ListActivity;
import android.os.Bundle;






public class SC3_4_MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    @SuppressLint("ResourceType")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sc3_4);

        listView = (ListView) findViewById(R.id.sc3_4_listview);



        //创建一个Arraylist对象，用HashMap来存储键值对
        ArrayList<HashMap<String,String>> list=new ArrayList<HashMap<String,String>>();
        //创建三个HashMap对象
        HashMap<String,String> map1=new HashMap<String,String>();
        HashMap<String,String> map2=new HashMap<String,String>();
        HashMap<String,String> map3=new HashMap<String,String>();
        //给三个map赋予键值对
        map1.put("user_name","zhangsan");
        map1.put("user_id","aaa");
        map2.put("user_name","lisi");
        map2.put("user_id","bbb");
        map3.put("user_name","wangwu");
        map3.put("user_id","ccc");


        list.add(map1);
        list.add(map2);
        list.add(map3);
        //设置适配器

        SimpleAdapter listAdapter=new SimpleAdapter(this,list,R.layout.sc3_4_itemview,new String[]{"user_name","user_id"},new int[]{R.id.sc3_4_textview1_item,R.id.sc3_4_textview2_item});
        //解释——
        //new String[]{}里装的是键，比如user_name
        //因为传递过去的是 list ，它的成员又是map 包含了映射信息
        //new string的元素个数是对应new int元素个数的
        //比如我这里写 user_name user_id 那么 就在两个控件 textview1 和 textview2 上显示，如果map中没有对应的user_name user_id 则直接跳过
        listView.setAdapter(listAdapter);


        registerForContextMenu(listView);

    }




    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
//        filename=list.get(info.position).getName();//保存选中的文件名
//        Toast.makeText(getApplicationContext(),"you choose the file : "+filename,Toast.LENGTH_SHORT).show();
        menu.add(0,0,0,"删除");
        menu.add(0,1,0,"分享");
    }
    //方法1对应
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case 0: {
//                myDialog(filename);
                break;
            }
            case 1:{
//                share(filename);
                break;
            }
        }
        return true;
    }





}