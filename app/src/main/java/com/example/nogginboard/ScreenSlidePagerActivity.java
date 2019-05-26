package com.example.nogginboard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//From https://developer.android.com/training/animation/screen-slide#java
public class ScreenSlidePagerActivity extends FragmentActivity {
    public static final int NUM_PAGES = 2;
    private ViewPager mpager;
    private PagerAdapter pagerAdapter;
}

