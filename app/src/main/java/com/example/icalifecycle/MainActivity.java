package com.example.icalifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
    protected void onStart(){
        super.onStart();
        System.out.println("On start");
    }

    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("On resume");

        if(count==0) {
            str += getText(R.string.title);
        } else {
            //System.out.println("On start"+count);
            str += "\n"+"resume "+count;
            setContentView(R.layout.activity_main);

            TextView textView = findViewById(R.id.editText);
            textView.setText(str);
        }
        count++;
    }

    public void goToOther(View view){
        Intent intent = new Intent(this, OtherActivity.class);
        startActivity(intent);
    }
}
