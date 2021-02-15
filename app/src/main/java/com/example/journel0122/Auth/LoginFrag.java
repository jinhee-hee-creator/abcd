package com.example.journel0122.Auth;

import android.content.Intent;
import android.os.Bundle;


import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.journel0122.AuthActivity;
import com.example.journel0122.R;
import com.example.journel0122.databinding.FragmentLoginBinding;

//fragment에서는...
//1. 뷰모델클래스 선언
//2. 바인딩 선언
//3. 버튼에 따른 이벤트 선언
public class LoginFrag extends Fragment {
    private LoginViewModel mViewModel;
    private FragmentLoginBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mViewModel = new LoginViewModel( getContext() );

        binding = DataBindingUtil.inflate( inflater, R.layout.fragment_login, container, false );

        binding.btnNavToJoinFragment.setOnClickListener( v -> mViewModel.navigationToJoin( v ) );


        binding.btnNavToMainActivity.setOnClickListener( v -> mViewModel.navigationToMain( v ) );

        return binding.getRoot();

    }
}