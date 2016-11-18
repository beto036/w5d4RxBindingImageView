package com.example.admin.w5d4rxbindingandroid;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.w5d4rxbindingandroid.databinding.ActivityMainBinding;
import com.jakewharton.rxbinding.view.RxView;

import rx.Subscription;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private Subscription subscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new ViewModel());

        button = (Button)findViewById(R.id.aMainBtn);
        textView = (TextView)findViewById(R.id.aMainTxt);

        Subscription buttonSub =
                RxView.clicks(button).subscribe(new Action1<Void>() {
                    @Override
                    public void call(Void aVoid) {
                        textView.setText("You clicked the button");
                    }
                });
    }
}
