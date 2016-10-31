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

public class Eee41 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee41);
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

        for (Eee41_List enum_of_eee41 : Eee41_List.values()) {
            adapter_of_titles.add(getString(enum_of_eee41.title));
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
        Eee41_List item_of_list = Eee41_List.values()[position];
        switch (item_of_list) {
            case
                    choice_225:
                Intent intent_nud1 = new Intent(Eee41.this, nud1.class);
                startActivity(intent_nud1);
                break;
            case
                    choice_226:
                Intent intent_nud2 = new Intent(Eee41.this, nud2.class);
                startActivity(intent_nud2);
                break;

            case
                    choice_227:
                Intent intent_nud3 = new Intent(Eee41.this, nud3.class);
                startActivity(intent_nud3);
                break;
            case
                    choice_228:
                break;
            case
                    choice_229:
                Intent intent_nud4 = new Intent(Eee41.this, nud4.class);
                startActivity(intent_nud4);
                break;
            case
                    choice_230:
                Intent intent_nud5 = new Intent(Eee41.this, nud5.class);
                startActivity(intent_nud5);
                break;
            case
                    choice_231:
                Intent intent_nud6 = new Intent(Eee41.this, nud6.class);
                startActivity(intent_nud6);
                break;
            case
                    choice_232:
                Intent intent_nud7 = new Intent(Eee41.this, nud7.class);
                startActivity(intent_nud7);
                break;
            case
                    choice_233:
                Intent intent_nud8 = new Intent(Eee41.this, nud8.class);
                startActivity(intent_nud8);
                break;

            case
                    choice_234:
                Intent intent_nud9 = new Intent(Eee41.this, nud9.class);
                startActivity(intent_nud9);
                break;
            case
                    choice_266:
                Intent intent_nud10 = new Intent(Eee41.this, nud10.class);
                startActivity(intent_nud10);
                break;
            case
                    choice_235:
                Intent intent_nud11 = new Intent(Eee41.this, nud11.class);
                startActivity(intent_nud11);
                break;
            case
                    choice_236:
                Intent intent_nud12 = new Intent(Eee41.this, nud12.class);
                startActivity(intent_nud12);
                break;
            case
                    choice_237:
                Intent intent_nud13 = new Intent(Eee41.this, nud13.class);
                startActivity(intent_nud13);
                break;
            case
                    choice_238:
                Intent intent_nud14 = new Intent(Eee41.this, nud14.class);
                startActivity(intent_nud14);
                break;

        }
    }

}