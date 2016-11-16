package com.example.suya.sample_mvp.presenter;

/**
 * Created by SuYa on 2016. 11. 16..
 */

public interface BasePresenter {

    void setView(BasePresenter.View view);

    void onConfirm();

    public interface View {
        void setConfirmText(String text);
    }

}