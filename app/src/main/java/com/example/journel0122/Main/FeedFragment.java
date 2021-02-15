package com.example.journel0122.Main;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.journel0122.R;
import com.example.journel0122.databinding.FragmentFeedBinding;


public class FeedFragment extends Fragment {

   // private NavDirections mActionToPost = FeedFragmentDirections.actionFeedFragmentToPostFragment();
    FragmentFeedBinding binding;
    private FeedViewModel mViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mViewModel = new FeedViewModel( getContext() );

        binding = DataBindingUtil.inflate( inflater, R.layout.fragment_feed, container, false );
        binding.btnNavToPostFragment.setOnClickListener( v -> mViewModel.navigationToPost(v));





        return binding.getRoot();
    }
}