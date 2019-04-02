package com.example.grievance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GrievanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grievance);
    }


    public void registerGrievance1(View view)
    {
        Bundle bundle =new Bundle();
        bundle.putString("category","Infrastructure Development");
        Intent intent =new Intent(GrievanceActivity.this,RegisterGrievance.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void registerGrievance2(View view)
    {
        Bundle bundle =new Bundle();
        bundle.putString("category","Health");
        Intent intent =new Intent(GrievanceActivity.this,RegisterGrievance.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void registerGrievance3(View view)
    {
        Bundle bundle =new Bundle();
        bundle.putString("category","Water");
        Intent intent =new Intent(GrievanceActivity.this,RegisterGrievance.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void registerGrievance4(View view)
    {
        Bundle bundle =new Bundle();
        bundle.putString("category","Education");
        Intent intent =new Intent(GrievanceActivity.this,RegisterGrievance.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void registerGrievance5(View view)
    {
        Bundle bundle =new Bundle();
        bundle.putString("category","Help");
        Intent intent =new Intent(GrievanceActivity.this,RegisterGrievance.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void registerGrievance6(View view)
    {
        Bundle bundle =new Bundle();
        bundle.putString("category","Energy");
        Intent intent =new Intent(GrievanceActivity.this,RegisterGrievance.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void registerGrievance7(View view)
    {
        Bundle bundle =new Bundle();
        bundle.putString("category","Sanitation");
        Intent intent =new Intent(GrievanceActivity.this,RegisterGrievance.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void registerGrievance8(View view)
    {
        Bundle bundle =new Bundle();
        bundle.putString("category","Other");
        Intent intent =new Intent(GrievanceActivity.this,RegisterGrievance.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}
