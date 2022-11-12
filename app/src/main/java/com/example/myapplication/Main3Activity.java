package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.adapters.ListViewAdapter;
import com.example.myapplication.adapters.Sc3_ListViewAdapter;
import com.example.myapplication.beams.ItemBean;
import com.example.myapplication.beams.Sc3_Datas;
import com.example.myapplication.beams.Sc3_ItemBean;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    private List<Sc3_ItemBean> mdata;
    private RecyclerView mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //找到控件
        mlist =(RecyclerView)this.findViewById(R.id.sc3_ListView);
//        TextView ttt=this.findViewById(R.id.recycler_ttt);
//        ttt.setText("不高不好不好");
        //准备数据
        initData();
    }

    private void initData() {
        //List-DataBea>——>Adapter>——>setAdapter>——>显示数据
        //创建数据集合
        Sc3_Datas datas=new Sc3_Datas();
        mdata=datas.GetDataList();

        //创建模拟数据
//        for(int i=0;i<10;i++){
//            // 创建数据对象
//            ItemBean data =new ItemBean();
////            data.icon=;
//            data.title="haha"+i;
//
//            //添加到集合里
//            mdata.add(data);
//        }


        //RecyclerView需要设置样式，其实就是布局管理器
        //需要创建一个LinearLayoutManager
//        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//        mlist.setLayoutManager(layoutManager);

        //创建适配器
        Sc3_ListViewAdapter adapter=new Sc3_ListViewAdapter(mdata);
        //设置到setAdapter(到recyclerView里去)
        mlist.setAdapter(adapter);
    }
}