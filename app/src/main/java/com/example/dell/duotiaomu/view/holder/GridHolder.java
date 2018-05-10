package com.example.dell.duotiaomu.view.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell.duotiaomu.R;

/**
 * Created by dell on 2018/4/16.
 */

public class GridHolder extends RecyclerView.ViewHolder {

    public RecyclerView grid_recycler;

    public GridHolder(View itemView) {
        super(itemView);
        grid_recycler = itemView.findViewById(R.id.grid_recycler);

    }
}
