package com.example.lauden.calcfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lauden on 3/10/18.
 */

public class fragment_keyboard extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_keyboard, container, false);
    }
    public static fragment_keyboard newInstance() {
        fragment_keyboard fragment = new fragment_keyboard();
        return fragment;
    }
}
