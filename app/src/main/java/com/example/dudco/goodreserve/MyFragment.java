package com.example.dudco.goodreserve;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dudco.goodreserve.databinding.ItemTopContentBinding;

public class MyFragment extends Fragment {
    private String[] titles = {"미스터 피자 서울대점", "미스터 피자 서울대점123", "미스터 피자 서울대점aaa", "미스터 피자 서울대점AAA"};
    private String[] locations = {"서울 특별시 동작구 봉천동", "서울 특별시 동작구 봉천동123", "서울 특별시 동작구 봉천동aaa", "서울 특별시 동작구 봉천동AAA"};
    private int num;



    public MyFragment(int num) {
        this.num = num - 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_top_content, container, false);

        ItemTopContentBinding binding = DataBindingUtil.bind(view);

        binding.setData(new TopContentData(titles[num], locations[num]));
        for (int i = 0; i < binding.topContentIndigater.getChildCount(); i++) {
            ImageView image = (ImageView) binding.topContentIndigater.getChildAt(i);
            image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.shape_top_content_indigater_off));
        }
        ImageView image = (ImageView) binding.topContentIndigater.getChildAt(num);
        image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.shape_top_content_indigater_on));
        return view;
    }
}
