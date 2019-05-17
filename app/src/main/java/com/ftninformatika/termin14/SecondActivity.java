package com.ftninformatika.termin14;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.ftninformatika.termin14.com.ftninformatika.termin14.model.Fruit;

import java.io.InputStream;

public class SecondActivity extends AppCompatActivity {

    private int fruitId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fruitId = getIntent().getExtras().getInt("id",0);
        boolean showDetails = getIntent().getExtras().getBoolean("showDetails");
        Fruit fruit = null;
        for(Fruit f:Fruit.fruits) {
            if (f.getId() == fruitId)
                fruit = f;
        }
        TextView tv = findViewById(R.id.textViewName);
        tv.setText(fruit.getName());
        TextView tv2 = findViewById(R.id.textViewDescription);
        tv2.setText(fruit.getDescription());
        if(showDetails)
        tv2.setVisibility(View.VISIBLE);
        else
            tv2.setVisibility(View.INVISIBLE);
        ImageView iv = findViewById(R.id.imageView);

        InputStream is = null;
        try {
            is = getAssets().open(fruit.getImageFilename());
            Drawable drawable = Drawable.createFromStream(is, "");
            iv.setImageDrawable(drawable);
        }catch (Exception e){
            Log.e("SecondActivity",e.getMessage());
        }
    }
}
