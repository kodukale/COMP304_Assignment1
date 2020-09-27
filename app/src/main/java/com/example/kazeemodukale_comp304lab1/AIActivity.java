package com.example.kazeemodukale_comp304lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity {

    String outputString = "AIActivity:" + "\n";
    TextView textViewOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);
        outputString += "onCreate Executed" + "\n";
        textViewOutput = findViewById(R.id.aiOutput);
        textViewOutput.setText(outputString);
    }

    public void onStart()
    {
        super.onStart();
        outputString += "onStart Executed" + "\n";
        textViewOutput.setText(outputString);
    }

    public void onRestart()
    {
        super.onRestart();
        outputString += "onRestart Executed" + "\n";
        textViewOutput.setText(outputString);
    }
    public void onResume()
    {
        super.onResume();
        outputString += "onResume Executed" + "\n";
        textViewOutput.setText(outputString);
    }
    public void onPause()
    {
        super.onPause();
        outputString += "onPause Executed" + "\n";
        textViewOutput.setText(outputString);
    }
    //
    public void onStop()
    {
        super.onStop();
        outputString += "onStart Stop" + "\n";
        textViewOutput.setText(outputString);
    }
    public void onDestroy()
    {
        super.onDestroy();
        outputString += "onDestory Executed" + "\n";
        textViewOutput.setText(outputString);
    }
}