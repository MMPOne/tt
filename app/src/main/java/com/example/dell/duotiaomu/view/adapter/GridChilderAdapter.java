package com.example.dell.duotiaomu.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.duotiaomu.R;
import com.example.dell.duotiaomu.model.bean.MainBean;
import com.example.dell.duotiaomu.view.holder.GridChilderHolder;
import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.List;

/**
 * Created by dell on 2018/4/16.
 */

public class GridChilderAdapter extends RecyclerView.Adapter<GridChilderHolder> {
    private Context context;
    private List<MainBean.DataBean> list;

    public GridChilderAdapter(Context context, List<MainBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public GridChilderHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.grid_childer_item_layout, null);
        GridChilderHolder gridChilderHolder=new GridChilderHolder(view);
        return gridChilderHolder;
    }

    @Override
    public void onBindViewHolder(GridChilderHolder holder, int position) {
        //初始化Fresco
        Fresco.initialize(context);
        holder.grid_childer_simple.setImageURI(list.get(position).getAd5().get(position).getImage());
        holder.grid_childer_text.setText(list.get(position).getAd5().get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
