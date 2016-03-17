package com.example.upam.menu2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.SubMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private static final int ID_M1=1;
   private static final int ID_M2=2;
    private static final int ID_M3=3 ;
    private static final int SID_M4=4;
    private static final int SID_M5=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.add(Menu.NONE,ID_M1,Menu.NONE, "Opcion 1").setIcon(R.mipmap.ic_launcher);
        menu.add(Menu.NONE, ID_M2, Menu.NONE, "Opcion 2");
        SubMenu sbmenu=
                menu.addSubMenu(Menu.NONE, ID_M3, Menu.NONE, "Opcion 3");
        sbmenu.add(Menu.NONE,SID_M4,Menu.NONE,"Opcion 3.1");
        sbmenu.add(Menu.NONE,SID_M5,Menu.NONE,"Opcion 3.2");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId())
        {
            case ID_M1: mensaje("opcion1");
                return  true;
            case ID_M2: mensaje("opcion2");
                return  true;
            case ID_M3 :mensaje("opcion3");
                return  true;
            case SID_M4: mensaje("opcion3.1");
                return  true;
            case SID_M5 :mensaje("opcion3.2∫");
                return  true;

            default:return super.onOptionsItemSelected(item);
        }

    }

    private void mensaje(String opcion3) {
        Toast.makeText(this, opcion3, Toast.LENGTH_SHORT).show();

    }



}
