package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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

    public void showToast(String message){
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}
