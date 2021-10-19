package com.sprint.gina.constraintlayoutfuns1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// ghost icon credit:
// <div>Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
//        Button b = (Button) v;
//        String text = b.getText().toString();
        String text = v.getTag().toString();
        Log.d(TAG, "onButtonClick: " + text);
        // task: show a toast!!
        Toast.makeText(this, "Hello from, " + text, Toast.LENGTH_LONG).show();
    }
}