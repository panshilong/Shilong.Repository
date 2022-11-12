package com.example.myapplication.beams;

import android.text.InputFilter;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

//数据集合
public class Sc3_Datas {
    List<Sc3_ItemBean> datas;

     public Sc3_Datas(){
         Sc3_ItemBean[] mds=new Sc3_ItemBean[]{
                 new Sc3_ItemBean(R.drawable.cat,new String("cat")),
                 new Sc3_ItemBean(R.drawable.dog,new String("dog")),
                 new Sc3_ItemBean(R.drawable.elephant,new String("elephant")),
                 new Sc3_ItemBean(R.drawable.lion,new String("lion")),
                 new Sc3_ItemBean(R.drawable.monkey,new String("monkey")),
                 new Sc3_ItemBean(R.drawable.tiger,new String("tiger"))
         };

         datas=new ArrayList<>();
         for(int i=0;i<mds.length;i++){
             datas.add(mds[i]);
         }


     }
    public List<Sc3_ItemBean> GetDataList(){
         if(null!=datas){
             return datas;
         }

         return null;
    }
}
