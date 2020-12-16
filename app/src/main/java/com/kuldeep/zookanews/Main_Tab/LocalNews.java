package com.kuldeep.zookanews.Main_Tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kuldeep.zookanews.Child_Tab.Ajmer;
import com.kuldeep.zookanews.Child_Tab.Alwar;
import com.kuldeep.zookanews.Child_Tab.Bharatpur;
import com.kuldeep.zookanews.Child_Tab.Dausa;
import com.kuldeep.zookanews.Child_Tab.Jaipur;
import com.kuldeep.zookanews.R;

public class LocalNews extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.nestedtab, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);

        return view;

    }


    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return Alwar.newInstance(1);
                case 1:
                    return Bharatpur.newInstance(2);
                case 2:
                    return Dausa.newInstance(3);
                case 3:
                    return Ajmer.newInstance(3);
                default:
                    return Jaipur.newInstance(3);
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Alwar";
                case 1:
                    return "Bharatpur";
                case 2:
                    return "Dausa";
                case 3:
                    return "Ajmer";
                case 4:
                    return "Jaipur";
            }

            return null;
        }
    }


}