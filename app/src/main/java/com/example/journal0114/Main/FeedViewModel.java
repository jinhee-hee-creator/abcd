package com.example.journal0114.Main;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.journal0114.R;


public class FeedViewModel extends Fragment {
    private NavDirections mActionToPostFragment = FeedFragmentDirections.actionFeedFragmentToPostFragment();
    private Context mContext;

    public FeedViewModel(Context context) {
        mContext = context;
    }


   public void navigateToPostFragment(View v) {
       Navigation.findNavController( v ).navigate( mActionToPostFragment );
       Toast.makeText( mContext,"WELCOME TO POSTFRAGMENT!",Toast.LENGTH_LONG ).show();


   }
}