package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Declare class variables
    private String message;
    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //methods for each button to pass the correct message to the showToast
    public void onClickBtnStreamer(View v){
        message = "This button will show the Spotify Streamer App";
        showToast(message);
    }

    public void onClickBtnScores(View v){
        message = "This button will show the Football Scores App";
        showToast(message);
    }

    public void onClickBtnLibrary(View v){
        message = "This button will show the Library App";
        showToast(message);
    }

    public void onClickBtnBigger(View v){
        message = "This button will show the Build It Bigger App";
        showToast(message);
    }

    public void onClickBtnXyz(View v){
        message = "This button will show the XYZ Reader App";
        showToast(message);
    }

    public void onClickBtnCapstone(View v){
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
