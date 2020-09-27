package com.example.kazeemodukale_comp304lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    BottomFragment bottomFragment;
    TextView outputView;
    String outputString = "Main Activity:" + "\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomFragment = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_bottom);
        outputView = bottomFragment.getView().findViewById(R.id.txtBottonFragOutput);
        outputView.setText(outputString);
        outputString += "onCreate Executed" + "\n";
        outputView.setText(outputString);
    }

    public void onStart()
    {
        super.onStart();
        outputString += "onStart Executed" + "\n";
        outputView.setText(outputString);
    }
    //
    public void onRestart()
    {
        super.onRestart();
        outputString += "onRestart Executed" + "\n";
        outputView.setText(outputString);
    }
    public void onResume()
    {
        super.onResume();
        outputString += "onResume Executed" + "\n";
        outputView.setText(outputString);
    }
    public void onPause()
    {
        super.onPause();
        outputString += "onPause Executed" + "\n";
        outputView.setText(outputString);
    }
    //
    public void onStop()
    {
        super.onStop();
        outputString += "onStart Stop" + "\n";
        outputView.setText(outputString);
    }
    public void onDestroy()
    {
        super.onDestroy();
        outputString += "onDestory Executed" + "\n";
        outputView.setText(outputString);
    }
}