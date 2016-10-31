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

public class Csethreetwoin extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csethreetwoin);
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

        for (Csethreetwoin_List enum_of_csethreetwoin : Csethreetwoin_List.values()) {
            adapter_of_titles.add(getString(enum_of_csethreetwoin.title));
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
        Csethreetwoin_List item_of_list = Csethreetwoin_List.values()[position];
        switch (item_of_list) {
            case
                    choice_74:
                Intent intent_sid1 = new Intent(Csethreetwoin.this, sid1.class);
                startActivity(intent_sid1);
                break;
            case
                    choice_75:
                Intent intent_sid2 = new Intent(Csethreetwoin.this, sid2.class);
                startActivity(intent_sid2);
                break;

            case
                    choice_76:
                Intent intent_sid3 = new Intent(Csethreetwoin.this, sid3.class);
                startActivity(intent_sid3);
                break;
            case
                    choice_77:
                Intent intent_sid4 = new Intent(Csethreetwoin.this, sid4.class);
                startActivity(intent_sid4);

                break;
            case
                    choice_78:
                Intent intent_sid5 = new Intent(Csethreetwoin.this, sid5.class);
                startActivity(intent_sid5);
                break;
            case
                    choice_79:
                Intent intent_sid6 = new Intent(Csethreetwoin.this, sid6.class);
                startActivity(intent_sid6);
                break;
            case
                    choice_80:
                Intent intent_sid7 = new Intent(Csethreetwoin.this, sid7.class);
                startActivity(intent_sid7);
                break;
            case
                    choice_81:
                Intent intent_sid8 = new Intent(Csethreetwoin.this, sid8.class);
                startActivity(intent_sid8);
                break;
            case
                    choice_82:
                Intent intent_sid9 = new Intent(Csethreetwoin.this, sid9.class);
                startActivity(intent_sid9);
                break;
        }
    }

}
