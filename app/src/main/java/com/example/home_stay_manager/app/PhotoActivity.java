package com.example.home_stay_manager.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.home_stay_manager.app.R;

/**
 * Created by mauro on 5/17/2014.
 */
public class PhotoActivity extends Activity
{
    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.photo_layout);

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageDrawable(getResources().getDrawable(R.drawable.test2));
    }

}
