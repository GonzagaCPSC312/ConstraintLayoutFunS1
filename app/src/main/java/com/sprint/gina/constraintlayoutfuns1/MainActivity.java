package com.sprint.gina.constraintlayoutfuns1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        Button b = (Button) v;
//        String text = b.getText().toString();
        String text = b.getTag().toString();
        Log.d(TAG, "onButtonClick: " + text);
        // task: show a toast!!
        Toast.makeText(this, "Hello from, " + text, Toast.LENGTH_LONG).show();
    }
}