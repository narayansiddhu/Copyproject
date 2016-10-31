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

public class Ece32 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece32);
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

        for (Ece32_List enum_of_ece32 : Ece32_List.values()) {
            adapter_of_titles.add(getString(enum_of_ece32.title));
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
        Ece32_List item_of_list = Ece32_List.values()[position];
        switch (item_of_list) {
            case
                    choice_151:
                Intent intent_dic1 = new Intent(Ece32.this, dic1.class);
                startActivity(intent_dic1);
                break;
            case
                    choice_152:
                Intent intent_dic2 = new Intent(Ece32.this, dic2.class);
                startActivity(intent_dic2);
                break;

            case
                    choice_153:
                Intent intent_dic3 = new Intent(Ece32.this, dic3.class);
                startActivity(intent_dic3);
                break;
            case
                    choice_154:
                Intent intent_dic4 = new Intent(Ece32.this, dic4.class);
                startActivity(intent_dic4);
                break;
            case
                    choice_155:
                Intent intent_dic5 = new Intent(Ece32.this, dic5.class);
                startActivity(intent_dic5);
                break;
            case
                    choice_156:
                Intent intent_dic6 = new Intent(Ece32.this, dic6.class);
                startActivity(intent_dic6);
                break;
            case
                    choice_157:
                Intent intent_dic7 = new Intent(Ece32.this, dic7.class);
                startActivity(intent_dic7);
                break;
            case
                    choice_158:
                Intent intent_dic8 = new Intent(Ece32.this, dic8.class);
                startActivity(intent_dic8);
                break;
            case
                    choice_159:
                Intent intent_dic9 = new Intent(Ece32.this, dic9.class);
                startActivity(intent_dic9);
                break;
        }
    }

}