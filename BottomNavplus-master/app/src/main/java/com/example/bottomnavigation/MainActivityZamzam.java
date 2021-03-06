package com.example.bottomnavigation;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivityZamzam extends AppCompatActivity implements Zamzam1.OnFragmentInteractionListener,
        Zamzam2.OnFragmentInteractionListener, Zamzam3.OnFragmentInteractionListener, Zamzam4.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fiqihumrah_viewpager);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("Sejarah"));
        tabs.addTab(tabs.newTab().setText("Penjelasan"));
        tabs.addTab(tabs.newTab().setText("Keutamaan"));
        tabs.addTab(tabs.newTab().setText("Kesalahan"));
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = findViewById(R.id.view_pager);
        PagerAdapterZamzam pagerAdapter = new PagerAdapterZamzam(getSupportFragmentManager(), tabs.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
