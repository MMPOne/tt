package com.example.dell.duotiaomu.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.duotiaomu.R;
import com.example.dell.duotiaomu.model.bean.MainBean;
import com.example.dell.duotiaomu.view.holder.WaterFallChilderHolder;
import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.List;

/**
 * Created by dell on 2018/4/16.
 */

public class WaterFallChilderAdapter extends RecyclerView.Adapter<WaterFallChilderHolder> {
    private Context context;
    private List<MainBean.DataBean> list;

    public WaterFallChilderAdapter(Context context, List<MainBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public WaterFallChilderHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.watefall_childer_item_layout, null);
        WaterFallChilderHolder waterFallChilderHolder=new WaterFallChilderHolder(view);
        return waterFallChilderHolder;
    }

    @Override
    public void onBindViewHolder(WaterFallChilderHolder holder, int position) {
        //初始化Fresco
        Fresco.initialize(context);
        holder.watefall_childer_simple.setImageURI(list.get(position).getAd8().get(position).getImage());
        holder.watefall_childer_title.setText(list.get(position).getAd8().get(position).getTitle());
        holder.watefall_childer_price.setText(list.get(position).getAd8().get(position).getPosition());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
