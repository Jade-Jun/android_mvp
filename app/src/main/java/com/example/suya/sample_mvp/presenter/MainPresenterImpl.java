package com.example.suya.sample_mvp.presenter;

import android.app.Activity;

import com.example.suya.sample_mvp.model.BaseModel;

/**
 * Created by SuYa on 2016. 11. 16..
 */

public class MainPresenterImpl implements BasePresenter {

    private Activity activity;
    private BasePresenter.View view;
    private BaseModel model;

    public MainPresenterImpl(Activity activity) {
        this.activity = activity;
        this.model = new BaseModel();
    }

    @Override
    public void onConfirm() {
        if (null != this.view) {
            view.setConfirmText(this.model.getClickedText());
        }
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }
}
