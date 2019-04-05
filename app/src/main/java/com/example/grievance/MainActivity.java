package com.example.grievance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private  static int SPLASH_TIMEOUT=4000;
    EditText uname,pass;
    TextView forg;
    private RadioGroup radioLoginGroup;
    private RadioButton radioLoginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void login(View view)
    {
        if (uname.getText().toString().isEmpty())
        {
            uname.setError("Cannot be empty");
            pass.setError("Cannot be empty");
        }
        else
        {
            radioLoginGroup = (RadioGroup) findViewById(R.id.logintype);
            if (radioLoginGroup.getCheckedRadioButtonId() == -1)
            {
                // no radio buttons are checked
            }
            else
            {
                int selectedId=radioLoginGroup.getCheckedRadioButtonId();
                radioLoginButton=(RadioButton)findViewById(selectedId);
                if(radioLoginButton.getId()==R.id.Admin)
                {
                    Intent jumpAdmin = new Intent(this,Main2Activity.class);
                    startActivity(jumpAdmin);

                }
                else
                {
                    Intent jumpUser = new Intent(this,GrievanceActivity.class);
                    startActivity(jumpUser);

                }





            }


        }
    }

    public void test(View view)
    {
        Intent intent=new Intent(MainActivity.this, GrievanceCategory.class);
        startActivity(intent);
    }


        /*public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();


            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.User:
                    if (checked)

                        startActivity(jumpUser);

                        break;
                case R.id.Admin:
                    if (checked)
                        startActivity(jumpAdmin);
                        break;
            }
        }*/

}
