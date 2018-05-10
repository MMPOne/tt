package com.example.dell.duotiaomu.model;

import android.util.Log;

import com.example.dell.duotiaomu.model.bean.MainBean;
import com.example.dell.duotiaomu.presenter.Ipresenter.IMainPresenter;
import com.example.dell.duotiaomu.presenter.MainPresenter;
import com.example.dell.duotiaomu.util.ApiService;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dell on 2018/4/16.
 */

public class MainModel {
    private IMainPresenter iMainPresenter;

    public MainModel(IMainPresenter iMainPresenter) {
        this.iMainPresenter=iMainPresenter;
    }

    public void getData() {
      //1.拿到retrofit对象
        Retrofit retrofit =new  Retrofit.Builder()
              .baseUrl("http://result.eolinker.com/")
              .addConverterFactory(GsonConverterFactory.create())
              .build();
     //2.创建一个网络请求接口
        ApiService apiService = retrofit.create(ApiService.class);
        //3.调用
        Map<String, String> map=new HashMap<>();
        final Call<MainBean> mainData = apiService.getMainData(map);
        mainData.enqueue(new Callback<MainBean>() {
            @Override
            public void onResponse(Call<MainBean> call, Response<MainBean> response) {
                Log.i("qwe",response.toString());
                iMainPresenter.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<MainBean> call, Throwable t) {
             iMainPresenter.onFailure(t);
            }
        });


    }
}
