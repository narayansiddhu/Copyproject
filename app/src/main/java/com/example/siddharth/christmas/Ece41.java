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

public class Ece41 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece41);
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

        for (Ece41_List enum_of_ece41 : Ece41_List.values()) {
            adapter_of_titles.add(getString(enum_of_ece41.title));
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
        Ece41_List item_of_list = Ece41_List.values()[position];
        switch (item_of_list) {
            case
                    choice_160:
                Intent intent_bob1 = new Intent(Ece41.this, bob1.class);
                startActivity(intent_bob1);
                break;
            case
                    choice_161:
                Intent intent_bob2 = new Intent(Ece41.this, bob2.class);
                startActivity(intent_bob2);
                break;

            case
                    choice_162:
                Intent intent_bob3 = new Intent(Ece41.this, bob3.class);
                startActivity(intent_bob3);
                break;
            case
                    choice_163:
                Intent intent_bob4 = new Intent(Ece41.this, bob4.class);
                startActivity(intent_bob4);
                break;
            case
                    choice_164:
                Intent intent_bob5 = new Intent(Ece41.this, bob5.class);
                startActivity(intent_bob5);
                break;
            case
                    choice_165:

                break;
            case
                    choice_166:
                Intent intent_bob6 = new Intent(Ece41.this, bob6.class);
                startActivity(intent_bob6);
                break;
            case
                    choice_167:
                Intent intent_bob7 = new Intent(Ece41.this, bob7.class);
                startActivity(intent_bob7);
                break;
            case
                    choice_168:
                Intent intent_bob8 = new Intent(Ece41.this, bob8.class);
                startActivity(intent_bob8);
                break;

            case
                    choice_169:
                Intent intent_bob9 = new Intent(Ece41.this, bob9.class);
                startActivity(intent_bob9);
                break;
            case
                    choice_170:
                Intent intent_bob10 = new Intent(Ece41.this, bob10.class);
                startActivity(intent_bob10);
                break;
            case
                    choice_171:
                Intent intent_bob11 = new Intent(Ece41.this, bob11.class);
                startActivity(intent_bob11);
                break;
            case
                    choice_172:
                Intent intent_bob12 = new Intent(Ece41.this, bob12.class);
                startActivity(intent_bob12);
                break;
            case
                    choice_173:
                Intent intent_bob13 = new Intent(Ece41.this, bob13.class);
                startActivity(intent_bob13);
                break;
            case
                    choice_174:
                Intent intent_bob14 = new Intent(Ece41.this, bob14.class);
                startActivity(intent_bob14);
                break;
        }
    }

}