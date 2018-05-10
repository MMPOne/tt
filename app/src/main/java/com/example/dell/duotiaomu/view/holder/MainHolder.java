package com.example.dell.duotiaomu.view.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell.duotiaomu.R;
import com.youth.banner.Banner;

/**
 * Created by dell on 2018/4/16.
 */

public class MainHolder extends RecyclerView.ViewHolder {

    public Banner banner;

    public MainHolder(View itemView) {
        super(itemView);
        banner = itemView.findViewById(R.id.banner);
    }

}
