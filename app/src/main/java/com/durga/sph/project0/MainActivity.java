package com.durga.sph.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button spotifybtn;
    Button scoresbtn;
    Button librarybtn;
    Button buildbiggerbtn;
    Button xyzbtn;
    Button capstonebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spotifybtn = (Button) findViewById(R.id.spotifybutton);
        scoresbtn = (Button) findViewById(R.id.scoresbutton);
        librarybtn = (Button) findViewById(R.id.librarybutton);
        buildbiggerbtn = (Button) findViewById(R.id.builditbiggerbutton);
        xyzbtn = (Button) findViewById(R.id.xyzreaderbutton);
        capstonebtn = (Button) findViewById(R.id.capstonebutton);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        spotifybtn.setWidth(capstonebtn.getWidth());
    }

    public void OnButtonClick(View view)
    {
        String message = getString(R.string.clickedmessage) + " " + view.getTag() + " app!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
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
