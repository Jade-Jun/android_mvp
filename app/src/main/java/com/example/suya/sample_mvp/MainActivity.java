package com.example.suya.sample_mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.suya.sample_mvp.presenter.BasePresenter;
import com.example.suya.sample_mvp.presenter.MainPresenterImpl;

public class MainActivity extends AppCompatActivity implements BasePresenter.View {

    private BasePresenter _mainPresenter;
    private TextView _textView;
    private Button _btn_touch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _textView   = (TextView)findViewById(R.id.sample_name);
        _btn_touch  = (Button)  findViewById(R.id.touch_btn);

        _mainPresenter = new MainPresenterImpl(MainActivity.this);
        _mainPresenter.setView(this);

        _btn_touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _mainPresenter.onConfirm();
            }
        });

    }

    @Override
    public void setConfirmText(String text) {
        _textView.setText(text);
    }
}
