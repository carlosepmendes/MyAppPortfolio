package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    //Declare as class variables
    private String message;
    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onClickBtn1(View v){
        message = "This button will show the Spotify Streamer App";
        showToast(message);
    }

    public void onClickBtn2(View v){
        message = "This button will show the Football Scores App";
        showToast(message);
    }

    public void onClickBtn3(View v){
        message = "This button will show the Library App";
        showToast(message);
    }

    public void onClickBtn4(View v){
        message = "This button will show the Build It Bigger App";
        showToast(message);
    }

    public void onClickBtn5(View v){
        message = "This button will show the XYZ Reader App";
        showToast(message);
    }

    public void onClickBtn6(View v){
        message = "This button will show my Capstone App";
        showToast(message);
    }

    public void showToast(String msg){

        //Stop any previous toasts
        if(mAppToast !=null){
            mAppToast.cancel();
        }

        //Make and display new toast
        mAppToast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        mAppToast.show();

    }


}
