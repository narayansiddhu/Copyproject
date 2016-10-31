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

public class Eee21 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee21);
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

        for (Eee21_List enum_of_eee21 : Eee21_List.values()) {
            adapter_of_titles.add(getString(enum_of_eee21.title));
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
        Eee21_List item_of_list = Eee21_List.values()[position];
        switch (item_of_list) {
            case
                    choice_192:
                Intent intent_enrique1 = new Intent(Eee21.this, enrique1.class);
                startActivity(intent_enrique1);
                break;
            case
                    choice_193:
                Intent intent_kiss2 = new Intent(Eee21.this, kiss2.class);
                startActivity(intent_kiss2);
                break;

            case
                    choice_194:
                Intent intent_ana6 = new Intent(Eee21.this, ana6.class);
                startActivity(intent_ana6);
                break;
            case
                    choice_195:
                Intent intent_kiss4 = new Intent(Eee21.this, kiss4.class);
                startActivity(intent_kiss4);
                break;
            case
                    choice_196:
                Intent intent_kiss5 = new Intent(Eee21.this, kiss5.class);
                startActivity(intent_kiss5);
                break;
            case
                    choice_197:
                Intent intent_kiss6 = new Intent(Eee21.this, kiss6.class);
                startActivity(intent_kiss6);
                break;
            case
                    choice_198:
                Intent intent_kiss7 = new Intent(Eee21.this, kiss7.class);
                startActivity(intent_kiss7);
                break;
            case
                    choice_199:
                Intent intent_kiss8 = new Intent(Eee21.this, kiss8.class);
                startActivity(intent_kiss8);
                break;
        }
    }

}