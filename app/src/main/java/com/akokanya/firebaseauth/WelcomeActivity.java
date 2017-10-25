package com.akokanya.firebaseauth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by pa6 on 25/10/2017.
 */

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mSignOutButton;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        mSignOutButton = (Button) findViewById(R.id.sign_out_button);
        mSignOutButton.setOnClickListener(this);


        mAuth = FirebaseAuth.getInstance();
    }

    private void signOut() {
        mAuth.signOut();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sign_out_button:
                signOut();
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
                break;
        }
    }
}