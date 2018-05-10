package com.example.dell.duotiaomu.presenter.Ipresenter;

import com.example.dell.duotiaomu.model.bean.MainBean;

/**
 * Created by dell on 2018/4/16.
 */

public interface IMainPresenter {
    void onSuccess(MainBean mainBean);
    void onFailure(Throwable throwable);
}
