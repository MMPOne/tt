package com.example.dell.duotiaomu.view.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.dell.duotiaomu.R;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by dell on 2018/4/16.
 */

public class GridChilderHolder extends RecyclerView.ViewHolder {

   public SimpleDraweeView grid_childer_simple;
   public TextView grid_childer_text;

    public GridChilderHolder(View itemView) {
        super(itemView);
        grid_childer_simple = itemView.findViewById(R.id.grid_childer_simple);
        grid_childer_text = itemView.findViewById(R.id.grid_childer_text);

    }
}
