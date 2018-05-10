package com.example.dell.duotiaomu.presenter;

import com.example.dell.duotiaomu.model.MainModel;
import com.example.dell.duotiaomu.model.bean.MainBean;
import com.example.dell.duotiaomu.presenter.Ipresenter.IMainPresenter;
import com.example.dell.duotiaomu.view.Iview.IMainView;

/**
 * Created by dell on 2018/4/16.
 */

public class MainPresenter implements IMainPresenter {

    private  MainModel mainModel;
    private IMainView iMainView;

    public MainPresenter(IMainView iMainView) {
        this.iMainView=iMainView;
        mainModel = new MainModel(this);
    }

    public void getData() {
     mainModel.getData();
    }

    @Override
    public void onSuccess(MainBean mainBean) {
        iMainView.onSuccess(mainBean);

    }

    @Override
    public void onFailure(Throwable throwable) {
        iMainView.onFailure(throwable);

    }

    public void onDestroy() {
        if (iMainView != null) {
            iMainView = null;
        }
    }
}
