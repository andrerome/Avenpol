package com.example.andres.avenpol;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.opengl.EGLExt;
import android.support.v7.app.*;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;


public class Solicitando extends FragmentActivity
{

    private FragmentTabHost tabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_solicitando);
        tabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);

        tabHost.setup(this,
                getSupportFragmentManager(),android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Perfil"),
                Perfil.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Mapa de Ruta"),
                MapaRuta.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Comentar"),
                Comentar.class, null);
    }
    /** Called when the activity is first created. */
    /*@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_solicitando);

        // create the TabHost that will contain the Tabs
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Tab");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Second Tab");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("Third tab");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected
        tab1.setIndicator("Perfil");
        tab1.setContent(new Intent(this,Perfil.class));

        tab2.setIndicator("Mapa de Ruta");
        tab2.setContent(new Intent(this,MapaRuta.class));

        tab3.setIndicator("Comentar");
        tab3.setContent(new Intent(this,Comentar.class));


        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);*/




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
