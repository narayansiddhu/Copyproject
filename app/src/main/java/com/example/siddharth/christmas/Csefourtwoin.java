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

public class Csefourtwoin extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csefourtwoin);
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

        for (Csefourtwoin_List enum_of_csefourtwoin : Csefourtwoin_List.values()) {
            adapter_of_titles.add(getString(enum_of_csefourtwoin.title));
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
        Csefourtwoin_List item_of_list = Csefourtwoin_List.values()[position];
        switch (item_of_list) {
            case
                    choice_96:
                Intent intent_bha1 = new Intent(Csefourtwoin.this, bha1.class);
                startActivity(intent_bha1);
                break;
            case
                    choice_97:
                break;

            case
                    choice_98:
                Intent intent_bha2 = new Intent(Csefourtwoin.this, bha2.class);
                startActivity(intent_bha2);
                break;
            case
                    choice_99:
                Intent intent_bha3 = new Intent(Csefourtwoin.this, bha3.class);
                startActivity(intent_bha3);
                break;
            case
                    choice_100:
                Intent intent_bha4 = new Intent(Csefourtwoin.this, bha4.class);
                startActivity(intent_bha4);
                break;
            case
                    choice_101:
                Intent intent_bha5 = new Intent(Csefourtwoin.this, bha5.class);
                startActivity(intent_bha5);
                break;


            case
                    choice_102:
                Intent intent_bha6 = new Intent(Csefourtwoin.this, bha6.class);
                startActivity(intent_bha6);
                break;
            case
                    choice_103:
                Intent intent_bha7 = new Intent(Csefourtwoin.this, bha7.class);
                startActivity(intent_bha7);
                break;
            case
                    choice_104:
                Intent intent_bha8 = new Intent(Csefourtwoin.this, bha8.class);
                startActivity(intent_bha8);
                break;
            case
                    choice_105:
                break;
            case
                    choice_106:
                Intent intent_bha9 = new Intent(Csefourtwoin.this, bha9.class);
                startActivity(intent_bha9);
                break;
            case
                    choice_107:
                Intent intent_bha10 = new Intent(Csefourtwoin.this, bha10.class);
                startActivity(intent_bha10);
                break;
            case
                    choice_108:
                Intent intent_bha11 = new Intent(Csefourtwoin.this, bha11.class);
                startActivity(intent_bha11);
                break;
            case
                    choice_109:
                Intent intent_bha12 = new Intent(Csefourtwoin.this, bha12.class);
                startActivity(intent_bha12);
                break;
            case
                    choice_110:
                Intent intent_bha13 = new Intent(Csefourtwoin.this, bha13.class);
                startActivity(intent_bha13);
                break;
            case
                    choice_111:
                Intent intent_bha14 = new Intent(Csefourtwoin.this, bha14.class);
                startActivity(intent_bha14);
                break;
            case
                    choice_112:
                Intent intent_bha15 = new Intent(Csefourtwoin.this, bha15.class);
                startActivity(intent_bha15);
                break;
            case
                    choice_113:
                Intent intent_bha16 = new Intent(Csefourtwoin.this, bha16.class);
                startActivity(intent_bha16);
                break;

            case
                    choice_258:
                Intent intent_bha17 = new Intent(Csefourtwoin.this, bha17.class);
                startActivity(intent_bha17);
                break;
            case
                    choice_259:
                Intent intent_bha18 = new Intent(Csefourtwoin.this, bha18.class);
                startActivity(intent_bha18);
                break;
        }
    }

}
