package com.example.grievance;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import static android.support.design.widget.Snackbar.LENGTH_INDEFINITE;

public class MainActivity extends AppCompatActivity
{
    ProgressBar progressBar;
    private  static int SPLASH_TIMEOUT=4000;
    EditText uname,pass;
    TextView forg,textView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.status_textView);
        uname=findViewById(R.id.username_editText);
        forg=findViewById(R.id.forgotpasswd_textView);
        pass=findViewById(R.id.passwd_editText);

        forg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(MainActivity.this,ForgotPassword.class);
                startActivity(i);

            }
        });

    }

    private void redirect(View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }

    public void register(View view)
    {
        if (uname.getText().toString().equals("")||pass.getText().toString().equals(""))
        {
            uname.setError("Cannot be empty");
            pass.setError("Cannot be empty");
        }
        else
        {
            Intent i=new Intent(this,Main2Activity.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"OK",Toast.LENGTH_SHORT).show();
        }
    }
    private void showSnackbar(String status)
    {
        View parentLayout = findViewById(R.id.loginLayout);
        Snackbar.make(parentLayout, status, Snackbar.LENGTH_INDEFINITE)
                .setAction("CLOSE", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                })
                .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                .show();

    }

    public void login(View view)
    {
        textView.setText("Logging in....");

        if (uname.getText().toString().isEmpty())
        {

            uname.setError("Cannot be empty");
            pass.setError("Cannot be empty");
            String status="Invalid credential. Please check your Username or Password";
            showSnackbar(status);
        }
        else
        {
            Intent i=new Intent(this,Main2Activity.class);
            startActivity(i);
            Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG).show();
        }
    }

    public void test(View view)
    {
        Intent intent=new Intent(MainActivity.this, GrievanceCategory.class);
        startActivity(intent);
    }
}
