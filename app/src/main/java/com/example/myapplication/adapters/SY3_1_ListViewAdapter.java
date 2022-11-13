package com.example.myapplication.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.beams.SY3_1_ItemBean;

import java.util.List;

public class SY3_1_ListViewAdapter extends RecyclerView.Adapter<SY3_1_ListViewAdapter.InnerHolder> {

    private  List<SY3_1_ItemBean> mdata;

    //通过构造方法传递数据
    public SY3_1_ListViewAdapter(List<SY3_1_ItemBean> data){
        this.mdata=data;
    }


    //用于创建条目的View
    @NonNull
    @Override
    public SY3_1_ListViewAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {




        //传递这个view（其实就是条目的界面）（就是数据面板）
        //在layout中创建一个数据模板
        //两个步骤
        //1 拿到view
        //2 创建InnerHolder——用来复用的
        View view=View.inflate(parent.getContext(),R.layout.item_list_view,null);
        return new InnerHolder(view);
    }

    //这个方法用于绑定内部holder的，一般用来设置数据
    @Override
    public void onBindViewHolder(@NonNull SY3_1_ListViewAdapter.InnerHolder holder, int position) {

        //在这里设置数据
        holder.setData(mdata.get(position));
    }

    //返回条目个数
    @Override
    public int getItemCount() {
        //不为空返回mdata大小
        if(null!=mdata){
            return mdata.size();
        }
        return 0;
    }


    public class InnerHolder extends RecyclerView.ViewHolder{

        public TextView mtext;
        public InnerHolder(@NonNull View itemView) {
            super(itemView);

            //在这里找到条目的控件
            mtext=(TextView) itemView.findViewById(R.id.list_view_title);

        }

        //这个方法用于设置数据
        public void setData(SY3_1_ItemBean itemBean) {
            //开始设置数据
            mtext.setText(itemBean.title);
        }
    }
}
