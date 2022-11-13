package com.example.myapplication.sc_3;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

//数据集合
public class SC3_1_Datas {
    List<SC3_1_ItemBean> datas;

     public SC3_1_Datas(){
         SC3_1_ItemBean[] mds=new SC3_1_ItemBean[]{
                 new SC3_1_ItemBean(R.drawable.cat,new String("cat")),
                 new SC3_1_ItemBean(R.drawable.dog,new String("dog")),
                 new SC3_1_ItemBean(R.drawable.elephant,new String("elephant")),
                 new SC3_1_ItemBean(R.drawable.lion,new String("lion")),
                 new SC3_1_ItemBean(R.drawable.monkey,new String("monkey")),
                 new SC3_1_ItemBean(R.drawable.tiger,new String("tiger"))
         };

         datas=new ArrayList<>();
         for(int i=0;i<mds.length;i++){
             datas.add(mds[i]);
         }


     }
    public List<SC3_1_ItemBean> GetDataList(){
         if(null!=datas){
             return datas;
         }

         return null;
    }
}
