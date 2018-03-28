package com.wmps.paul_mac.newfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.cb2);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.cb3);
        final CheckBox cb4 = (CheckBox) findViewById(R.id.cb4);
        final CheckBox cb5 = (CheckBox) findViewById(R.id.cb5);
        final CheckBox cb6 = (CheckBox) findViewById(R.id.cb6);
        final CheckBox cb7 = (CheckBox) findViewById(R.id.cb7);

        Button btn = (Button) findViewById(R.id.btn1);

        final int cost[] = {0,520,420,320,100,180,200,70};

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int total = 0;
                if(cb1.isChecked()) {
                    total += cost[1];
                    cb1.setEnabled(false);
                }

                if(cb2.isChecked()) {
                    total += cost[2];
                    cb2.setEnabled(false);
                }

                if(cb3.isChecked()) {
                    total += cost[3];
                    cb3.setEnabled(false);
                }

                if(cb4.isChecked()) {
                    total += cost[4];
                    cb4.setEnabled(false);
                }

                if(cb5.isChecked()) {
                    total += cost[5];
                    cb5.setEnabled(false);
                }

                if(cb6.isChecked()) {
                    total += cost[6];
                    cb6.setEnabled(false);
                }

                if(cb7.isChecked()) {
                    total += cost[7];
                    cb7.setEnabled(false);
                }
                else {
                    total += cost[0];
                }

                Toast.makeText(getApplicationContext(), "Your total Order is Rs."+Integer.toString(total), Toast.LENGTH_LONG).show();

            }
        });


    }
}
