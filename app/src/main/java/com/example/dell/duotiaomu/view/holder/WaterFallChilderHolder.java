package com.example.dell.duotiaomu.view.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.dell.duotiaomu.R;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by dell on 2018/4/16.
 */

public class WaterFallChilderHolder extends RecyclerView.ViewHolder  {

    public SimpleDraweeView watefall_childer_simple;
    public TextView watefall_childer_title;
    public TextView watefall_childer_price;

    public WaterFallChilderHolder(View itemView) {
        super(itemView);
        watefall_childer_simple = itemView.findViewById(R.id.watefall_childer_simple);
        watefall_childer_title = itemView.findViewById(R.id.watefall_childer_title);
        watefall_childer_price = itemView.findViewById(R.id.watefall_childer_price);

    }
}
