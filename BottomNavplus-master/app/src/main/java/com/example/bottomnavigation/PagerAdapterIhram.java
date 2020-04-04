package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterIhram extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterIhram(@NonNull FragmentManager fm, int Number) {
        super(fm);
        this.num = Number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                MainActivityIhram frag1 = new MainActivityIhram();
                return frag1;
            case 1:
                MainActivityMiqot frag2 = new MainActivityMiqot();
                return frag2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
