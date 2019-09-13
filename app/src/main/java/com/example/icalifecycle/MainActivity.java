package com.example.icalifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private static String str ="";
    private static int count = 0;
    private static Date pausedDate;
    private static Date resumeDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void submitShoppingListChange(View view){
        Intent intent = new Intent(this,OtherActivity.class);
    }


    protected void onStart(){
        super.onStart();
        System.out.println("On start");
    }

    protected void onRestart(){
        super.onRestart();
        System.out.println("On restart");
    }

    protected void onPause(){
        super.onPause();

        pausedDate = new Date();

        System.out.println("On pause");
    }

    protected void onStop(){
        super.onStop();
        System.out.println("On stop");
    }

    protected void onDestroy(){
        super.onDestroy();
        System.out.println("On destroy");
    }


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
        if(resumeDate!=null){
            resumeDate = new Date();
            int awaySeconds = (int) ( (pausedDate.getTime()-resumeDate.getTime())/1000);

            TextView timeView = (TextView) findViewById(R.id.timeText);
            timeView.setText("You were away for"+awaySeconds+" seconds");

        }


        count++;
    }

    public void goToOther(View view){
        Intent intent = new Intent(this, OtherActivity.class);
        startActivity(intent);
    }
}
