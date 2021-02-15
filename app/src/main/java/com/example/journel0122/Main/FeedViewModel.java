package com.example.journel0122.Main;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.ViewModel;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

public class FeedViewModel extends ViewModel {

    private Context mContext;
    private NavDirections mActionToPost = FeedFragmentDirections.actionFeedFragmentToPostFragment();

    public FeedViewModel(Context context) {
        mContext = context;

    }

    public void navigationToPost(View v){
        Navigation.findNavController( v ).navigate( mActionToPost );
        Toast.makeText( mContext, "포스트!!", Toast.LENGTH_LONG ).show();

    }
}
