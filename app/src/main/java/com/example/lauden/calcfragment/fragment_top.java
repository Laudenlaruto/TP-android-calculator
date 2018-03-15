package com.example.lauden.calcfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lauden on 3/10/18.
 */

public class fragment_top extends Fragment {
    TextView result;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_top, container, false);
        result = (TextView) v.findViewById(R.id.resultat);
        return v;
    }
    public static fragment_top newInstance() {
        fragment_top fragment = new fragment_top();
        return fragment;
    }
    public void setTitleText(String text) {
        result.setText(text);
    }

}
