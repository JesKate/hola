package com.example.firsapplication8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "the App has been created", Toast.LENGTH_LONG).show();
    }
    public void SingIn(View view){
        //redirect depends of login Activity
        String email= "peter@gmail.com";
        String passwd= "123abc";

        String email2= "peter12@gmail.com";
        String passwd2= "123abcd";
        //***************************
        //***************************
        if(passwd==passwd2 && email==email2){
            Toast.makeText(this, "Invalid Login", Toast.LENGTH_LONG).show();
        }else{
            //Redirect to menu Activity
        }
    }
    public void SingUp(View view){
        //redirect to SingUp activity
    }

}
