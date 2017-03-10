package com.example.dudco.goodreserve;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by dudco on 2017. 3. 8..
 */

public class TopPagerAdapter extends FragmentPagerAdapter{
    private List<Fragment> items;
    public TopPagerAdapter(FragmentManager fm, List<Fragment> items) {
        super(fm);
        this.items = items;
    }

    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return 4;
    }
}
