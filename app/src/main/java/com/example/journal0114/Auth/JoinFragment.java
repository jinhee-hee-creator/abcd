package com.example.journal0114.Auth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.journal0114.R;


public class JoinFragment extends Fragment {


    public static JoinFragment newInstance() {
        return new JoinFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate( R.layout.fragment_join,container,false );
        return root;

        }
}