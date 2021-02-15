package com.example.journal0114.Auth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.journal0114.R;
import com.example.journal0114.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {

    private LoginViewModel mLoginViewModel;
    private FragmentLoginBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        binding = DataBindingUtil.inflate( inflater, R.layout.fragment_login, container, false );
//        mLoginViewModel = new LoginViewModel( getContext() );?/
        binding.setViewModel( new LoginViewModel() );


//        binding.btnNaviToJoinFragment.setOnClickListener( v -> mLoginViewModel.navigateToJoinFragment(v));
//
//
//        binding.btnNaviToMain.setOnClickListener( v -> mLoginViewModel.navigateToMain(v));


        return binding.getRoot();


    }
}


