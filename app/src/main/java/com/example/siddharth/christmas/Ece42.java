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

public class Ece42 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece42);
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

        for (Ece42_List enum_of_ece42 : Ece42_List.values()) {
            adapter_of_titles.add(getString(enum_of_ece42.title));
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
        Ece42_List item_of_list = Ece42_List.values()[position];
        switch (item_of_list) {
            case
                    choice_175:
                Intent intent_tit1 = new Intent(Ece42.this, tit1.class);
                startActivity(intent_tit1);
                break;
            case
                    choice_176:
                break;

            case
                    choice_177:
                Intent intent_tit2 = new Intent(Ece42.this, tit2.class);
                startActivity(intent_tit2);
                break;
            case
                    choice_178:
                Intent intent_tit3 = new Intent(Ece42.this, tit3.class);
                startActivity(intent_tit3);
                break;
            case
                    choice_179:
                Intent intent_tit4 = new Intent(Ece42.this, tit4.class);
                startActivity(intent_tit4);
                break;
            case
                    choice_180:
                Intent intent_tit5 = new Intent(Ece42.this, tit5.class);
                startActivity(intent_tit5);
                break;
            case
                    choice_181:
                Intent intent_tit6 = new Intent(Ece42.this, tit6.class);
                startActivity(intent_tit6);
                break;
            case
                    choice_182:
                Intent intent_tit7 = new Intent(Ece42.this, tit7.class);
                startActivity(intent_tit7);
                break;
            case
                    choice_183:
                break;
            case
                    choice_184:
                Intent intent_tit8 = new Intent(Ece42.this, tit8.class);
                startActivity(intent_tit8);
                break;
            case
                    choice_185:
                Intent intent_tit9 = new Intent(Ece42.this, tit9.class);
                startActivity(intent_tit9);
                break;
            case
                    choice_186:
                Intent intent_tit10 = new Intent(Ece42.this, tit10.class);
                startActivity(intent_tit10);
                break;
            case
                    choice_187:
                Intent intent_tit11 = new Intent(Ece42.this, tit11.class);
                startActivity(intent_tit11);
                break;
            case
                    choice_188:
                Intent intent_tit12 = new Intent(Ece42.this, tit12.class);
                startActivity(intent_tit12);
                break;
            case
                    choice_189:
                Intent intent_tit13 = new Intent(Ece42.this, tit13.class);
                startActivity(intent_tit13);
                break;
            case
                    choice_190:
                Intent intent_tit14 = new Intent(Ece42.this, tit14.class);
                startActivity(intent_tit14);
                break;
            case
                    choice_191:
                Intent intent_tit15 = new Intent(Ece42.this, tit15.class);
                startActivity(intent_tit15);
                break;
        }
    }

}