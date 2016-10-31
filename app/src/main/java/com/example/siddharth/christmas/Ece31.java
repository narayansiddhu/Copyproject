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

public class Ece31 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece31);
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

        for (Ece31_List enum_of_ece31 : Ece31_List.values()) {
            adapter_of_titles.add(getString(enum_of_ece31.title));
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
        Ece31_List item_of_list = Ece31_List.values()[position];
        switch (item_of_list) {
            case
                    choice_143:
                Intent intent_ass1 = new Intent(Ece31.this, ass1.class);
                startActivity(intent_ass1);
                break;
            case
                    choice_144:
                Intent intent_ass2 = new Intent(Ece31.this, ass2.class);
                startActivity(intent_ass2);
                break;

            case
                    choice_145:
                Intent intent_ass3 = new Intent(Ece31.this, ass3.class);
                startActivity(intent_ass3);
                break;
            case
                    choice_146:
                Intent intent_ass4 = new Intent(Ece31.this, ass4.class);
                startActivity(intent_ass4);
                break;
            case
                    choice_147:
                Intent intent_ass5 = new Intent(Ece31.this, ass5.class);
                startActivity(intent_ass5);
                break;
            case
                    choice_148:
                Intent intent_ass6 = new Intent(Ece31.this, ass6.class);
                startActivity(intent_ass6);
                break;
            case
                    choice_149:
                Intent intent_ass7 = new Intent(Ece31.this, ass7.class);
                startActivity(intent_ass7);
                break;
            case
                    choice_150:
                Intent intent_ass8 = new Intent(Ece31.this, ass8.class);
                startActivity(intent_ass8);
                break;
             }
    }

}
