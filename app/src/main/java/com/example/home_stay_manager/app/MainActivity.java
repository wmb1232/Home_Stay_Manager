package com.example.home_stay_manager.app;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Button closeButton;
    private EditText  username=null;
    private EditText  password=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);

        TextView nameText = (TextView) findViewById(R.id.app_name);
        nameText.setTextColor(Color.RED);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/arial-black.ttf");
        nameText.setTypeface(type);


       // ImageView splashImage = (ImageView) findViewById(R.id.);

        //splashImage.setImageDrawable(getResources().getDrawable(R.drawable.yoyyes));
       // splashImage.setOnClickListener(new View.OnClickListener(){
          //  @Override
        //public void onClick(View v){
          //      Intent i = new Intent(MainActivity.this, PhotoActivity.class);
            //    startActivity(i);
         //   }

       // });

        // log in button
        final Button button = (Button) findViewById(R.id.log_in);
        button.setTypeface(type);
        button.setTextColor(Color.WHITE);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(MainActivity.this, StudentData.class);
                startActivity(i);
            }
        });

        // sign in button
        final Button Sign_in_button = (Button) findViewById(R.id.sign_in);
        Sign_in_button.setTypeface(type);
        Sign_in_button.setTextColor(Color.WHITE);
        Sign_in_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent k = new Intent(MainActivity.this, PhotoActivity.class);
                startActivity(k);
            }
        });

        // Facebook sign in button
        final Button Sign_in_button_Facebook = (Button) findViewById(R.id.log_in_facebook);
        Sign_in_button_Facebook.setTextColor(Color.BLUE);
        Sign_in_button_Facebook.setTypeface(type);
        Sign_in_button_Facebook.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Perform action on click
                Intent k = new Intent(MainActivity.this, PhotoActivity.class);
                startActivity(k);
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
