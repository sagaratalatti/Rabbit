package com.example.android.rabbit;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.rabbit.R;

/**
 * Created by sagar_000 on 11/12/2015.
 */
public class FeedsFragment extends ListFragment {

    //Copied from MainActivity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_feeds, container, false);
        return rootView;
    }
}
