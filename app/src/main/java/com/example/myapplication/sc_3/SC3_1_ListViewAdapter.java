package com.example.myapplication.sc_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class SC3_1_ListViewAdapter extends RecyclerView.Adapter<SC3_1_ListViewAdapter.InnerHolder> {

    private  List<SC3_1_ItemBean> mdata;

    //通过构造方法传递数据
    public SC3_1_ListViewAdapter(List<SC3_1_ItemBean> data){
        this.mdata=data;
    }


    //用于创建条目的View
    @NonNull
    @Override
    public SC3_1_ListViewAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {




        //传递这个view（其实就是条目的界面）（就是数据面板）
        //在layout中创建一个数据模板
        //两个步骤
        //1 拿到view
        //2 创建InnerHolder——用来复用的
        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.sc3_1_itemlist_view,parent,false));
        //这里的layout是item模板的
//        View view=View.inflate(parent.getContext(),R.layout.sc3_item_list_view,null);
//        return new InnerHolder(view);
    }

    //这个方法用于绑定内部holder的，一般用来设置数据
    @Override
    public void onBindViewHolder(@NonNull SC3_1_ListViewAdapter.InnerHolder holder, int position) {

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
        public ImageView mimage;
        public InnerHolder(@NonNull View itemView) {
            super(itemView);

            //在这里找到条目的控件
            mtext=(TextView) itemView.findViewById(R.id.sc3_list_view_title);
            mimage=(ImageView) itemView.findViewById(R.id.sc3_list_view_iamge);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   String trip="我是：";
                   trip+=mtext.getText().toString();

                    Toast.makeText(itemView.getContext(),trip,Toast.LENGTH_SHORT).show();
                }
            });


        }

        //这个方法用于设置数据
        public void setData(SC3_1_ItemBean itemBean) {
            //开始设置数据
            mtext.setText(itemBean.title);
            mimage.setImageResource(itemBean.icon);
        }
    }
}
