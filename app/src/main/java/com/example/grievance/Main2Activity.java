package com.example.grievance;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity
{

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item)
        {
            Fragment fragment=null;
            int menuID=item.getItemId();
            switch (menuID)
            {
                case R.id.navigation_home:
                    fragment=new HomeFragment();
                    setTitle("Home");
                    break;
                case R.id.navigation_notifications:
                    fragment=new NotificationFragment();
                    setTitle("Notification");
                    break;
                case R.id.navigation_settings:
                    fragment=new SettingsFragment();
                    setTitle("Settings");
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    public void grievance(View view)
    {
        Toast.makeText(getApplicationContext(),"Successful",Toast.LENGTH_SHORT).show();
    }
}
