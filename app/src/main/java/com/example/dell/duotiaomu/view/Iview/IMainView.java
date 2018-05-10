package com.example.dell.duotiaomu.view.Iview;

import com.example.dell.duotiaomu.model.bean.MainBean;

/**
 * Created by dell on 2018/4/16.
 */

public interface IMainView {
    void onSuccess(MainBean mainBean);
    void onFailure(Throwable throwable);
}
