package com.example.dell.duotiaomu.view.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell.duotiaomu.R;

/**
 * Created by dell on 2018/4/16.
 */

public class WaterFallHolder extends RecyclerView.ViewHolder {

   public RecyclerView waterfall_recycler;

    public WaterFallHolder(View itemView) {
        super(itemView);
        waterfall_recycler = itemView.findViewById(R.id.waterfall_recycler);
    }
}
