package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonWriter;
import android.view.View;
import android.widget.Button;

import org.json.JSONObject;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mShowInfo = findViewById(R.id.show_info);
        final Student[] StudentInfo = new Student[]{
                new Student("Bob Smith", 12),
                new Student("John Smith", 13),
                new Student("Jacob Smith", 14),
                new Student("Joseph Smith", 15),
                new Student("Adam Smith", 16)
        };
        mShowInfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               Intent i = new Intent(MainActivity.this, ShowInfo.class);
                //i.putExtra("StudentData", StudentInfo);
                i.putExtra("StudentInfo", (Serializable) StudentInfo);
               startActivity(i);
            }

        });

    }
}
