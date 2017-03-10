package com.example.dudco.goodreserve;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dudco.goodreserve.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.mainBtnLogin.setOnClickListener(this);
        binding.mainBtnFacebook.setOnClickListener(this);
        binding.mainBtnReg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_btn_facebook:
                startActivity(new Intent(this, RealMainActivity.class));
                break;
            case R.id.main_btn_login:
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.main_btn_reg:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }
}
