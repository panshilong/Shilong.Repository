package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.sc_3.SC3_1_ListViewAdapter;
import com.example.myapplication.sc_3.SC3_1_Datas;
import com.example.myapplication.sc_3.SC3_1_ItemBean;

import java.util.List;

public class SC3_1_MainActivity extends AppCompatActivity {

    private List<SC3_1_ItemBean> mdata;
    private RecyclerView mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sc3_1);

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
        SC3_1_Datas datas=new SC3_1_Datas();
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
        SC3_1_ListViewAdapter adapter=new SC3_1_ListViewAdapter(mdata);
        //设置到setAdapter(到recyclerView里去)
        mlist.setAdapter(adapter);
    }
}