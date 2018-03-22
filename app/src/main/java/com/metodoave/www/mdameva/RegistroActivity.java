package com.metodoave.www.mdameva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        showToolbar(getResources().getString(R.string.createhere),true);
    }

    public void showToolbar(String Titulo,boolean upBotton){
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(Titulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upBotton);
    }
}
