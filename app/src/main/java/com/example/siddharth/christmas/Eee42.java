package com.example.siddharth.christmas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Eee42 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee42);
        final Toolbar toolbar = (Toolbar)findViewById(R.id.Mytool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsebar);



        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context, R.color.colorAccent));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Use Apps and Save Papers", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        ListView view_of_list = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter_of_titles = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        for (Eee42_List enum_of_eee42 : Eee42_List.values()) {
            adapter_of_titles.add(getString(enum_of_eee42.title));
        }

        view_of_list.setAdapter(adapter_of_titles);


        view_of_list.setOnItemClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_option1:
                Toast.makeText(getApplicationContext(), item.toString(), Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Eee42_List item_of_list = Eee42_List.values()[position];
        switch (item_of_list) {
            case
                    choice_240:
                Intent intent_gir1 = new Intent(Eee42.this, gir1.class);
                startActivity(intent_gir1);
                break;
            case
                    choice_241:
                Intent intent_gir2 = new Intent(Eee42.this, gir2.class);
                startActivity(intent_gir2);
                break;

            case
                    choice_242:
                break;
            case
                    choice_243:
                Intent intent_gir3 = new Intent(Eee42.this, gir3.class);
                startActivity(intent_gir3);
                break;
            case
                    choice_244:
                Intent intent_gir4 = new Intent(Eee42.this, gir4.class);
                startActivity(intent_gir4);
                break;
            case
                    choice_245:
                Intent intent_gir5 = new Intent(Eee42.this, gir5.class);
                startActivity(intent_gir5);
                break;
            case
                    choice_246:
                Intent intent_gir6 = new Intent(Eee42.this, gir6.class);
                startActivity(intent_gir6);
                break;
            case
                    choice_247:
                Intent intent_gir7 = new Intent(Eee42.this, gir7.class);
                startActivity(intent_gir7);
                break;
            case
                    choice_248:
                Intent intent_gir8 = new Intent(Eee42.this, gir8.class);
                startActivity(intent_gir8);
                break;

            case
                    choice_249:

                break;
            case
                    choice_250:
                Intent intent_gir9 = new Intent(Eee42.this, gir9.class);
                startActivity(intent_gir9);
                break;
            case
                    choice_251:
                Intent intent_gir10 = new Intent(Eee42.this, gir10.class);
                startActivity(intent_gir10);
                break;
            case
                    choice_252:
                Intent intent_gir11 = new Intent(Eee42.this, gir11.class);
                startActivity(intent_gir11);
                break;
            case
                    choice_253:
                Intent intent_gir12 = new Intent(Eee42.this, gir12.class);
                startActivity(intent_gir12);
                break;

            case
                    choice_261:
                Intent intent_gir13 = new Intent(Eee42.this, gir13.class);
                startActivity(intent_gir13);
                break;
            case
                    choice_262:
                Intent intent_gir14 = new Intent(Eee42.this, gir14.class);
                startActivity(intent_gir14);
                break;
            case
                    choice_263:
                Intent intent_gir15 = new Intent(Eee42.this, gir15.class);
                startActivity(intent_gir15);
                break;
            case
                    choice_264:
                Intent intent_gir16 = new Intent(Eee42.this, gir16.class);
                startActivity(intent_gir16);
                break;
            case
                    choice_265:
                Intent intent_gir17 = new Intent(Eee42.this, gir17.class);
                startActivity(intent_gir17);
                break;

        }
    }}
