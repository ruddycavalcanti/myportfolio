package br.com.mypportfolio.ruddy.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private String spotify_streamer, super_duo_scores, super_duo_library, build_it_bigger, xyz_reader, capstone;

    private String wasClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        wasClicked = " app was clicked. i want to see more now!";
    }

    public void spotify_streamer(View view){

        spotify_streamer = getResources().getString(R.string.spotify_streamer);
        showToast(spotify_streamer + wasClicked);
    }

    public void super_duo_scores(View view){
        super_duo_scores = getResources().getString(R.string.super_duo_scores);
        showToast(super_duo_scores  + wasClicked);
    }

    public void super_duo_library(View view){
        super_duo_library = getResources().getString(R.string.super_duo_library);
        showToast(super_duo_library  + wasClicked);
    }

    public void build_it_bigger(View view){
        build_it_bigger = getResources().getString(R.string.build_it_bigger);
        showToast(build_it_bigger  + wasClicked);
    }


    public void xyz_reader(View view){
        xyz_reader = getResources().getString(R.string.xyz_reader);
        showToast(xyz_reader  + wasClicked);
    }

    public void capstone(View view){
        capstone = getResources().getString(R.string.capstone);
        showToast(capstone  + wasClicked);
    }

    public void showToast(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
