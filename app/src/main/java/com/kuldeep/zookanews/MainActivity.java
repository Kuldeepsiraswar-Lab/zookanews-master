package com.kuldeep.zookanews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.kuldeep.zookanews.Main_Tab.BusinessNews;
import com.kuldeep.zookanews.Main_Tab.EducationalNews;
import com.kuldeep.zookanews.Main_Tab.HealthNews;
import com.kuldeep.zookanews.Main_Tab.JobsNews;
import com.kuldeep.zookanews.Main_Tab.LatestNews;
import com.kuldeep.zookanews.Main_Tab.LocalNews;
import com.kuldeep.zookanews.Main_Tab.SportNews;
import com.kuldeep.zookanews.Main_Tab.ScienceNews;
import com.kuldeep.zookanews.Main_Tab.TechNews;

public class MainActivity extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(new InternetDialog(this).getInternetStatus());
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new LatestNews();
                case 1:
                    return new LocalNews();
                case 2:
                    return new SportNews();
                case 3:
                    return new EducationalNews();
                case 4:
                    return new JobsNews();
                case 5:
                    return new ScienceNews();
                case 6:
                    return new TechNews();
                case 7:
                    return new HealthNews();
                case 8:
                    return new BusinessNews();
                default:
                    return new LatestNews();
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 9;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Latest-News";
                case 1:
                    return "Select-City";
                case 2:
                    return "Sports";
                case 3:
                    return "Educational";
                case 4:
                    return "Jobs";
                case 5:
                    return "Science";
                case 6:
                    return "Technology";
                case 7:
                    return "Health";
                case 8:
                    return "Business";
            }
            return null;
        }
    }
}

