package com.example.android.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Toast noAppYetToast;

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

    //Each one of the following 6 methods is connected to one of the buttons in activity_main.xml,
    //they all start displaying a toast but their code will be updated as the apps they should
    //initialize are finished.
    //The stopping previous toast idea was taken from a comment made by hilfritz_13797270122 in
    //https://discussions.udacity.com/t/toast-function-for-each-button/20868/4

    public void launchApp1(View view){
        if(noAppYetToast !=null){
            noAppYetToast.cancel();
        }
        noAppYetToast = Toast.makeText(MainActivity.this, R.string.app_1_toast, Toast.LENGTH_SHORT);
        noAppYetToast.show();
    }

    public void launchApp2(View view){
        if(noAppYetToast !=null){
            noAppYetToast.cancel();
        }
        noAppYetToast = Toast.makeText(MainActivity.this, R.string.app_2_toast, Toast.LENGTH_SHORT);
        noAppYetToast.show();
    }

    public void launchApp3(View view){
        if(noAppYetToast !=null){
            noAppYetToast.cancel();
        }
        noAppYetToast = Toast.makeText(MainActivity.this, R.string.app_3_toast, Toast.LENGTH_SHORT);
        noAppYetToast.show();
    }

    public void launchApp4(View view){
        if(noAppYetToast !=null){
            noAppYetToast.cancel();
        }
        noAppYetToast = Toast.makeText(MainActivity.this, R.string.app_4_toast, Toast.LENGTH_SHORT);
        noAppYetToast.show();
    }

    public void launchApp5(View view){
        if(noAppYetToast !=null){
            noAppYetToast.cancel();
        }
        noAppYetToast = Toast.makeText(MainActivity.this, R.string.app_5_toast, Toast.LENGTH_SHORT);
        noAppYetToast.show();
    }

    public void launchApp6(View view){
        if(noAppYetToast !=null){
            noAppYetToast.cancel();
        }
        noAppYetToast = Toast.makeText(MainActivity.this, R.string.app_6_toast, Toast.LENGTH_SHORT);
        noAppYetToast.show();
    }

}
