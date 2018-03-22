package com.metodoave.www.mdameva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void goRegister(View view){
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    void goDashBoard(View view){
        Intent intent =  new Intent(this,DashboardActivity.class);
        startActivity(intent);
    }
}
