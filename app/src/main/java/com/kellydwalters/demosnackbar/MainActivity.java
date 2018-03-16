package com.kellydwalters.demosnackbar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // this is the little button at the bottom of the screen
        // pressing it triggers the snackbar
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // snackbar is like toast but only at the bottom of the screen.
                // often used for an undo action
                Snackbar.make(view, "This is a SNACK BAR!!", Snackbar.LENGTH_LONG)
                        .setAction("DO A THING", new ToastMaker())
                        .show();
            }
        });
    }


    // this is a custom class that will handle what actions you want to happen when user
    // clicks the link on the Snack Bar
    public class ToastMaker implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "This was a simple action", Toast.LENGTH_SHORT).show();
        }
    }

}
