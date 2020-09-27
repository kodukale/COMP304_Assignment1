package com.example.kazeemodukale_comp304lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    String outputString = "VRActivity:" + "\n";
    TextView textVROutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);
        outputString += "onCreate Executed" + "\n";
        textVROutput = findViewById(R.id.vrOutput);
        textVROutput.setText(outputString);
    }

    public void onStart()
    {
        super.onStart();
        outputString += "onStart Executed" + "\n";
        textVROutput.setText(outputString);
    }

    public void onRestart()
    {
        super.onRestart();
        outputString += "onRestart Executed" + "\n";
        textVROutput.setText(outputString);
    }
    public void onResume()
    {
        super.onResume();
        outputString += "onResume Executed" + "\n";
        textVROutput.setText(outputString);
    }
    public void onPause()
    {
        super.onPause();
        outputString += "onPause Executed" + "\n";
        textVROutput.setText(outputString);
    }
    //
    public void onStop()
    {
        super.onStop();
        outputString += "onStart Stop" + "\n";
        textVROutput.setText(outputString);
    }
    public void onDestroy()
    {
        super.onDestroy();
        outputString += "onDestory Executed" + "\n";
        textVROutput.setText(outputString);
    }
}