package com.example.dudco.goodreserve;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

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

        items.add(new MyFragment(1));
        items.add(new MyFragment(2));
        items.add(new MyFragment(3));
        items.add(new MyFragment(4));

        binding.rmainTopContentPager.setAdapter(new TopPagerAdapter(getSupportFragmentManager(),items));
        binding.rmainTopContentPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                View view = inflater.inflate(R.layout.item_top_content, null);
                LinearLayout item = (LinearLayout) view.findViewById(R.id.top_content_indigater);
                for (int i = 0; i < 4; i++){
                    ImageView image = (ImageView) item.getChildAt(position);
                    image.setImageDrawable(ContextCompat.getDrawable(RealMainActivity.this, R.drawable.shape_top_content_indigater_off));
                }
                ImageView image = (ImageView) item.getChildAt(position);
                image.setImageDrawable(ContextCompat.getDrawable(RealMainActivity.this, R.drawable.shape_top_content_indigater_on));
                Log.d("dudco", ""+position);
                Log.d("dudco", ""+item.getChildAt(position));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
