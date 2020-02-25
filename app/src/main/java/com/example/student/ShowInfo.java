package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Set;

public class ShowInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
        Bundle b = getIntent().getExtras();
        TextView Data = findViewById(R.id.Data);
        Data.setText(b.getSerializable("StudentInfo").toString());
        for (String key : b.keySet())
        {
            Log.d ("myApplication", key + " is a key in the bundle");
        }
    }
}
