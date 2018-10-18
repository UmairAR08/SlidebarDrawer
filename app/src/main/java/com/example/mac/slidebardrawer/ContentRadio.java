package com.example.mac.slidebardrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class ContentRadio extends Fragment{
    public ContentRadio(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        view = (RelativeLayout) inflater.inflate(R.layout.content_radio, container, false);
        getActivity().setTitle("Radio Streaming");
        return view;

    }
}
