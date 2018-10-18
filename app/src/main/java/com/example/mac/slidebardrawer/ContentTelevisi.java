package com.example.mac.slidebardrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class ContentTelevisi extends Fragment{
    public ContentTelevisi(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        view = (RelativeLayout) inflater.inflate(R.layout.content_televisi, container, false);
        getActivity().setTitle("Televisi Streaming");
        return view;

    }
}
