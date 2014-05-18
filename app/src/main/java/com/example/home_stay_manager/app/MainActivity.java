package com.example.home_stay_manager.app;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameText = (TextView) findViewById(R.id.app_name);
        nameText.setTextColor(Color.BLUE);

        ImageView splashImage = (ImageView) findViewById(R.id.splash);
        splashImage.setImageDrawable(getResources().getDrawable(R.drawable.testing1));
        splashImage.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Intent i = new Intent(MainActivity.this, PhotoActivity.class);
                startActivity(i);
            }

        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view)
    {

    }

}
