package com.example.grievance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterGrievance extends AppCompatActivity
{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_grievance);
        textView=findViewById(R.id.category_textView);
        Bundle b=getIntent().getExtras();
        String cat= b.getString("category");
        setTitle(cat);
        textView.setText(cat);
    }
}
