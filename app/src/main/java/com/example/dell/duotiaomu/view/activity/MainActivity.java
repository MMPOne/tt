package com.example.dell.duotiaomu.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.dell.duotiaomu.R;
import com.example.dell.duotiaomu.model.bean.MainBean;
import com.example.dell.duotiaomu.presenter.MainPresenter;
import com.example.dell.duotiaomu.view.Iview.IMainView;
import com.example.dell.duotiaomu.view.adapter.MainAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IMainView{

    private RecyclerView recycler;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recycler);

        mainPresenter = new MainPresenter(this);
        mainPresenter.getData();
    }

    @Override
    public void onSuccess(MainBean mainBean) {
        List<MainBean.DataBean> list=new ArrayList<>();
        Log.i("zcx",mainBean.getMsg());
        recycler.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter mainAdapter=new MainAdapter(list,this);
       recycler.setAdapter(mainAdapter);



    }

    @Override
    public void onFailure(Throwable throwable) {

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mainPresenter != null) {
            mainPresenter.onDestroy();
        }
    }
}
