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

public class Eee31 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee31);
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

        for (Eee31_List enum_of_eee31 : Eee31_List.values()) {
            adapter_of_titles.add(getString(enum_of_eee31.title));
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
        Eee31_List item_of_list = Eee31_List.values()[position];
        switch (item_of_list) {
            case
                    choice_208:
                Intent intent_fuc1 = new Intent(Eee31.this, fuc1.class);
                startActivity(intent_fuc1);
                break;
            case
                    choice_209:
                Intent intent_fuc2 = new Intent(Eee31.this, fuc2.class);
                startActivity(intent_fuc2);
                break;

            case
                    choice_210:
                Intent intent_fuc3 = new Intent(Eee31.this, fuc3.class);
                startActivity(intent_fuc3);
                break;
            case
                    choice_211:
                Intent intent_fuc4 = new Intent(Eee31.this, fuc4.class);
                startActivity(intent_fuc4);
                break;
            case
                    choice_212:
                Intent intent_fuc5 = new Intent(Eee31.this, fuc5.class);
                startActivity(intent_fuc5);
                break;
            case
                    choice_213:
                Intent intent_fuc6 = new Intent(Eee31.this, fuc6.class);
                startActivity(intent_fuc6);
                break;
            case
                    choice_214:
                Intent intent_fuc7 = new Intent(Eee31.this, fuc7.class);
                startActivity(intent_fuc7);
                break;
            case
                    choice_215:
                Intent intent_fuc8 = new Intent(Eee31.this, fuc8.class);
                startActivity(intent_fuc8);
                break;
        }
    }

}