package com.example.administrator.betterbus;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    private Toast toast;
    protected void showText(CharSequence text){
        if (toast == null){
            toast = Toast.makeText(this,text,Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        toast.setText(text);
        //toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

}
