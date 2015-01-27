package com.example.andres.avenpol;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity implements OnClickListener {

    EditText etUser,etPass;
    Button btnIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_login);

        etUser=(EditText)findViewById(R.id.etUser);
        etPass=(EditText)findViewById(R.id.etPass);
        btnIngresar=(Button)findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public void onClick(View arg0){
        switch(arg0.getId()){
            case R.id.btnIngresar:
                String user=etUser.getText().toString();
                String pswd=etPass.getText().toString();
                if(user.equals("ajromero") && pswd.equals("123")){
                    //Mostrar pantalla-Actividad
                    //Intent int1= new Intent("com.example.appcomedores.Administrador");
                    //startActivity(int1);
                    finish();
                    break;
                }
                else if(user.equals("sromero") && pswd.equals("123")){
                    //Mostrar pantalla-Actividad
                    //Intent int2= new Intent("com.example.appcomedores.Dueno");
                   // startActivity(int2);
                    finish();
                    break;

                }else{
                    //Toast Presenta un cuadro de dialogo
                    Toast t=Toast.makeText(this,"User o Password Incorrecto",Toast.LENGTH_SHORT);
                    t.show();
                }
                break;
        }

    }
}
