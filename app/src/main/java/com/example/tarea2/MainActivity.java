package com.example.tarea2;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
    viewPager = (ViewPager) findViewById(R.id.viewpager);
    viewPager.setAdapter(mSectionsPagerAdapter);
    tabLayout = (TabLayout) findViewById(R.id.tabs);
    tabLayout.setupWithViewPager(viewPager);

    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {super(fm);}
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new FragmentTechnology();
                case 1:
                    return new FragmentHome();
                case 2:
                    return new FragmentElectronics();
                default:
                    return new FragmentTechnology();
            }
        }
        @Override
        public int getCount() {
            return 3;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0: return getString(R.string.title_section1).toUpperCase(l);
                case 1: return getString(R.string.title_section2).toUpperCase(l);
                case 2: return getString(R.string.title_section3).toUpperCase(l);
            }
            return null;
        }
    }

}
