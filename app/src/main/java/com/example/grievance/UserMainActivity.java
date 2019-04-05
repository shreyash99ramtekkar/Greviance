package com.example.grievance;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class UserMainActivity extends AppCompatActivity
{

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener1
            = new BottomNavigationView.OnNavigationItemSelectedListener()
    {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item1)
        {
            Fragment fragment1=null;
            int menuID=item1.getItemId();
            switch (menuID)
            {
                case R.id.navigationuser_home:
                    fragment1=new UserHomeFragment();
//                    setTitle("Home");
                    break;
                case R.id.navigationuser_complaint:
                    fragment1=new UserComplaintFragment();
//                    setTitle("Notification");
                    break;
                case R.id.navigationuser_settings:
                    fragment1=new UserSettingsFragment();
//                    setTitle("Settings");
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.userfragment_container,fragment1).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.user_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener1);
        getSupportFragmentManager().beginTransaction().replace(R.id.userfragment_container,new UserHomeFragment()).commit();
    }
    public void testToast(View view)
    {
        Toast.makeText(getApplicationContext(),"OK",Toast.LENGTH_SHORT).show();
    }
}
