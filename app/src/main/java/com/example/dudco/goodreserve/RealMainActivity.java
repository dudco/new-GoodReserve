package com.example.dudco.goodreserve;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.dudco.goodreserve.databinding.ActivityRealMainBinding;

import java.util.ArrayList;
import java.util.List;

public class RealMainActivity extends AppCompatActivity {
    private ActivityRealMainBinding binding;
    private List<Fragment> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_real_main);

        setSupportActionBar(binding.rmainToolbar);

        View actionBarView = LayoutInflater.from(this).inflate(R.layout.item_action_bar, null);
        actionBarView.findViewById(R.id.action_bar_mypg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RealMainActivity.this, "마이페이지 준비중...",  Toast.LENGTH_SHORT);
            }
        });
        getSupportActionBar().setCustomView(actionBarView);

        items.add(new MyFragment(1));
        items.add(new MyFragment(2));
        items.add(new MyFragment(3));
        items.add(new MyFragment(4));

        binding.rmainTopContentPager.setAdapter(new TopPagerAdapter(getSupportFragmentManager(),items));

    }
}
