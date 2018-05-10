package com.example.dell.duotiaomu.util;

import com.example.dell.duotiaomu.model.bean.MainBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by dell on 2018/4/16.
 */

public interface ApiService {

    @GET("umIPmfS6c83237d9c70c7c9510c9b0f97171a308d13b611?uri=homepage")
    Call<MainBean> getMainData(@QueryMap Map<String,String> map);
}
