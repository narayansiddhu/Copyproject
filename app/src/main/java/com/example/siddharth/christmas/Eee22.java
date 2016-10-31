package com.example.siddharth.christmas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatCallback;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Eee22 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee22);
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

        for (Eee22_List enum_of_eee22 : Eee22_List.values()) {
            adapter_of_titles.add(getString(enum_of_eee22.title));
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
        Eee22_List item_of_list = Eee22_List.values()[position];
        switch (item_of_list) {
            case
                    choice_200:
                Intent intent_ana1 = new Intent(Eee22.this, ana1.class);
                startActivity(intent_ana1);
                break;
            case
                    choice_201:
                Intent intent_mee2 = new Intent(Eee22.this, mee2.class);
                startActivity(intent_mee2);
                break;

            case
                    choice_202:
                Intent intent_mee3 = new Intent(Eee22.this, mee3.class);
                startActivity(intent_mee3);
                break;
            case
                    choice_203:
                Intent intent_mee4 = new Intent(Eee22.this, mee4.class);
                startActivity(intent_mee4);
                break;
            case
                    choice_204:
                Intent intent_mee5 = new Intent(Eee22.this, mee5.class);
                startActivity(intent_mee5);
                break;
            case
                    choice_205:
                Intent intent_mee6 = new Intent(Eee22.this, mee6.class);
                startActivity(intent_mee6);
                break;
            case
                    choice_206:
                Intent intent_mee7 = new Intent(Eee22.this, mee7.class);
                startActivity(intent_mee7);
                break;
            case
                    choice_207:
                Intent intent_mee8 = new Intent(Eee22.this, mee8.class);
                startActivity(intent_mee8);
                break;
        }
    }

}