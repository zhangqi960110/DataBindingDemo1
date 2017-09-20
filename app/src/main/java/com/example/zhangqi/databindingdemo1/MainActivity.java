package com.example.zhangqi.databindingdemo1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhangqi.databindingdemo1.bean.User;
import com.example.zhangqi.databindingdemo1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Sunzxying", "12345678");
        mBinding.setUser(user);
    }
}
