package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.myapplication.adapters.SY3_1_ListViewAdapter;
import com.example.myapplication.beams.SY3_1_ItemBean;

import java.util.ArrayList;
import java.util.List;

public class SY3_1_MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";
    private RecyclerView mlist;
   private List<SY3_1_ItemBean> mdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sy3_1);

        //找到控件
        mlist =(RecyclerView)this.findViewById(R.id.recycler_view);
        TextView ttt=this.findViewById(R.id.recycler_ttt);
        ttt.setText("不高不好不好");
        //准备数据
        initData();

    }

    //这个方法用于初始化模拟数据
    private void initData() {
        //List-DataBea>——>Adapter>——>setAdapter>——>显示数据
        //创建数据集合
        mdata=new ArrayList<>();

        //创建模拟数据
        for(int i=0;i<10;i++){
            // 创建数据对象
            SY3_1_ItemBean data =new SY3_1_ItemBean();
//            data.icon=;
            data.title="haha"+i;

            //添加到集合里
            mdata.add(data);
        }
        //RecyclerView需要设置样式，其实就是布局管理器
        //需要创建一个LinearLayoutManager
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        mlist.setLayoutManager(layoutManager);

        //创建适配器
        SY3_1_ListViewAdapter adapter=new SY3_1_ListViewAdapter(mdata);
        //设置到setAdapter(到recyclerView里去)
        mlist.setAdapter(adapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sy3_1_mene,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       int itemId=item.getItemId();
        int a=0;
       switch (itemId){
           //ListView
           case R.id.list_view_vertical_stander:
               Log.d(TAG,"点击了list_view_vertical_stander");
               break;
           case R.id.list_view_vertical_reverse:
               break;
           case R.id.list_view_horizontal_stander:
               break;
           case R.id.list_view_horizontal_reverse:
               break;

           //GridView
           case R.id.grid_view_vertical_stander:
               break;
           case R.id.grid_view_vertical_reverse:
               break;
           case R.id.grid_view_horizontal_stander:
               break;
           case R.id.grid_view_horizontal_reverse:
               break;

           //瀑布流部分
           case R.id.stagger_view_vertical_stander:
               break;
           case R.id.stagger_view_vertical_reverse:
               break;
           case R.id.stagger_view_horizontal_stander:
               break;
           case R.id.stagger_view_horizontal_reverse:
               break;
       }
        return super.onOptionsItemSelected(item);
    }
}