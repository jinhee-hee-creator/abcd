package com.example.journel0122.Auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.ViewModel;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.example.journel0122.AuthActivity;
import com.example.journel0122.MainActivity;

// 뷰모델에서는...
//1. 네비게이션 선언 - 클릭이벤트시 필요하니까
//2. 클릭이벤트
public class LoginViewModel extends ViewModel {

    private NavDirections mActionToJoin = LoginFragDirections.actionLoginFragToJoinFrag();
    private Context mContext;

    public LoginViewModel(Context context) {
        mContext = context;
    }

    public void navigationToJoin(View v) {
        Navigation.findNavController( v ).navigate( mActionToJoin );
        Toast.makeText( mContext, "쪼인!", Toast.LENGTH_LONG ).show();

    }

    public void navigationToMain(View v){
        Intent intent = new Intent( mContext, MainActivity.class );
         mContext.startActivity( intent );


    }


}
