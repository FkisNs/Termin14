package com.ftninformatika.termin14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.ftninformatika.termin14.com.ftninformatika.termin14.model.Fruit;

public class FirstActivity extends AppCompatActivity {

    private boolean showDetails = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        Button btn = new Button(this);
        btn.setText("OK");
        LinearLayout layout = findViewById(R.id.layout1);
        layout.addView(btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getBaseContext(),"Click",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button btn2 = findViewById(R.id.button2);
        btn2.setText("dugme iz layout-a");

        for(final Fruit f:Fruit.fruits) {
            Button btn3 = new Button(this);
            btn3.setText(f.getName());
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                    i.putExtra("id",f.getId());
                    i.putExtra("showDetails",showDetails);
                    startActivity(i);
                }
            });
            layout.addView(btn3);
        }
    }
    public void onToggleClick(View view){
        ToggleButton tb = (ToggleButton)view;
        if(tb.isChecked())
            showDetails = true;
        else
            showDetails = false;
    }
}
