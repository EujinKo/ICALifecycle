package com.example.icalifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private static String str ="";
    private static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onResume(){
        super.onResume();
        //System.out.println("On start"+count);
        str += "resume "+count+"\n";
        Intent intent = getIntent();
        intent.putExtra(EXTRA_MESSAGE,str);

        count++;
    }

    public void goToOther(View view){
        Intent intent = new Intent(this, OtherActivity.class);
        startActivity(intent);
    }
}
