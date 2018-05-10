package com.example.dell.duotiaomu.view.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.duotiaomu.R;
import com.example.dell.duotiaomu.model.bean.MainBean;
import com.example.dell.duotiaomu.util.GlideImageLoader;
import com.example.dell.duotiaomu.view.holder.GridHolder;
import com.example.dell.duotiaomu.view.holder.MainHolder;
import com.example.dell.duotiaomu.view.holder.WaterFallHolder;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/4/16.
 */

public class MainAdapter extends RecyclerView.Adapter {
    //定义三种常量  表示三种条目类型
    private final int EMPTY_VIEW = 1;
    private final int PROGRESS_VIEW = 2;
    private final int IMAGE_VIEW = 3;
    private List<MainBean.DataBean> mData;
    private Context context;

    public MainAdapter(List<MainBean.DataBean> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //创建不同的 ViewHolder
        View view;
        //根据viewtype来创建条目

        if (viewType == EMPTY_VIEW) {
            view = View.inflate(parent.getContext(), R.layout.banner_item_layout, null);
            MainHolder mainHolder = new MainHolder(view);
            return mainHolder;
        } else if (viewType == PROGRESS_VIEW) {
            view = View.inflate(parent.getContext(), R.layout.grid_item_layout, null);
            GridHolder gridHolder = new GridHolder(view);
            return gridHolder;
        } else {
            view = View.inflate(parent.getContext(), R.layout.waterfall_item_layout, null);
            WaterFallHolder waterFallHolder = new WaterFallHolder(view);

            return waterFallHolder;
        }
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MainHolder) {
            for(int i=0;i<mData.get(position).getAd1().size();i++){
          //  mData.add(mData.get(position).getAd1().get(position).getImage());
            }
            //设置图片加载器

            ((MainHolder) holder).banner.setImageLoader(new GlideImageLoader());
            ((MainHolder) holder).banner.setImages(mData);
            ((MainHolder) holder).banner.start();


        } else if (holder instanceof GridHolder) {
            ((GridHolder) holder).grid_recycler.setLayoutManager(new GridLayoutManager(context,2, OrientationHelper.HORIZONTAL,false));
                        GridChilderAdapter gridChilderAdapter=new GridChilderAdapter(context,mData);
                        ((GridHolder) holder).grid_recycler.setAdapter(gridChilderAdapter);

        }else if(holder instanceof WaterFallHolder){
            ((WaterFallHolder) holder).waterfall_recycler.setLayoutManager(new StaggeredGridLayoutManager(2,OrientationHelper.VERTICAL));
                 WaterFallChilderAdapter waterFallChilderAdapter=new WaterFallChilderAdapter(context,mData);
                 ((WaterFallHolder) holder).waterfall_recycler.setAdapter(waterFallChilderAdapter);

        }


    }

    @Override
    public int getItemCount() {
        if (mData != null) {
            return mData.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (mData.size() == 0) {
            return EMPTY_VIEW;
        } else if (mData.get(position) == null) {
            return PROGRESS_VIEW;
        } else {
            return IMAGE_VIEW;
        }


    }
}
