package com.example.journal0114.Main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.journal0114.R;


public class PostFragment extends Fragment {


    public static PostFragment newInstance() {

        return new PostFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View root = inflater.inflate( R.layout.fragment_post,container,false );
    return root;
          }
}