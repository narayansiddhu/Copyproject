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

public class Eee32 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee32);
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

        for (Eee32_List enum_of_eee32 : Eee32_List.values()) {
            adapter_of_titles.add(getString(enum_of_eee32.title));
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
        Eee32_List item_of_list = Eee32_List.values()[position];
        switch (item_of_list) {
            case
                    choice_216:
                Intent intent_you1 = new Intent(Eee32.this, you1.class);
                startActivity(intent_you1);
                break;
            case
                    choice_217:
                Intent intent_you2 = new Intent(Eee32.this, you2.class);
                startActivity(intent_you2);
                break;

            case
                    choice_218:
                Intent intent_you3 = new Intent(Eee32.this, you3.class);
                startActivity(intent_you3);
                break;
            case
                    choice_219:
                Intent intent_you4 = new Intent(Eee32.this, you4.class);
                startActivity(intent_you4);
                break;
            case
                    choice_220:
                Intent intent_you5 = new Intent(Eee32.this, you5.class);
                startActivity(intent_you5);
                break;
            case
                    choice_221:
                Intent intent_you6 = new Intent(Eee32.this, you6.class);
                startActivity(intent_you6);
                break;
            case
                    choice_222:
                Intent intent_you7 = new Intent(Eee32.this, you7.class);
                startActivity(intent_you7);
                break;
            case
                    choice_223:
                Intent intent_you8 = new Intent(Eee32.this, you8.class);
                startActivity(intent_you8);
                break;
            case
                    choice_224:
                Intent intent_you9 = new Intent(Eee32.this, you9.class);
                startActivity(intent_you9);
                break;
        }
    }

}