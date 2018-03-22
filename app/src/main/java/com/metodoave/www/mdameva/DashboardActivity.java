package com.metodoave.www.mdameva;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class DashboardActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottombarAction);
        bottomNavigationView.setSelectedItemId(R.id.leccionesitem);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.leccionesitem){
                    showToolbar("Lecciones",false);
                    LeccionesFragment leccionesFragment = new LeccionesFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,leccionesFragment).commit();
                    return true;
                }else if (item.getItemId() == R.id.examenesitem){
                    showToolbar("Examenes",false);
                    ExamenesFragment examenesFragment =  new ExamenesFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,examenesFragment).commit();
                    return true;
                }else if(item.getItemId() == R.id.docItem){
                    showToolbar("Documentos",false);
                    DocumentFragment documentFragment = new DocumentFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,documentFragment).commit();
                    return true;
                }else if(item.getItemId() == R.id.metItem){
                    showToolbar("Metodo EVA",false);
                    MetodoAVEFragment metodoAVEFragment = new MetodoAVEFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,metodoAVEFragment).commit();
                    return true;
                }

                return false;
            }
        });
    }

    public void showToolbar(String Titulo,boolean upBotton){
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(Titulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upBotton);
    }
}
