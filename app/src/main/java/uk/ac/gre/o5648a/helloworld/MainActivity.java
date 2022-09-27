package uk.ac.gre.o5648a.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import java.util.Random;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a reference to the GUI
        TextView main = (TextView) findViewById(R.id.TextView_Main);
        main.setTextColor(Color.parseColor("#008000"));

        /*Do some processing*/
        int mark = 0;
        Random r = new Random();
        mark = r.nextInt(100);
        mark++;

        //Output results
        main.setText("Hello world");
        main.append("\nYour mark is " + mark);

        if (mark>70) {
            main.setTextColor(Color.parseColor("#008000"));
            main.append("\nBrilliant you got a distinction");
        } else if (mark>50 && mark<70) {
            main.setTextColor(Color.parseColor("#FFC300"));
            main.append("\nWell done you passed");
        } else {
            main.setTextColor(Color.parseColor("#FF5733"));
            main.append("\nSorry you failed");
        }

    }
}