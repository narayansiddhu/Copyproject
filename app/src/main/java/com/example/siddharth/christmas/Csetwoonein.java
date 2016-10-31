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

public class Csetwoonein extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csetwoonein);
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

        for (Csetwoonein_List enum_of_csetwoonein : Csetwoonein_List.values()) {
            adapter_of_titles.add(getString(enum_of_csetwoonein.title));
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
        Csetwoonein_List item_of_list = Csetwoonein_List.values()[position];
        switch (item_of_list) {
            case
                    choice_49:
                Intent intent_enrique1 = new Intent(Csetwoonein.this, enrique1.class);
                startActivity(intent_enrique1);
                break;
            case
                    choice_50:
                Intent intent_enrique2 = new Intent(Csetwoonein.this, enrique2.class);
                startActivity(intent_enrique2);
                break;

            case
                    choice_51:
                Intent intent_enrique3 = new Intent(Csetwoonein.this, enrique3.class);
                startActivity(intent_enrique3);
                break;
            case
                    choice_52:
                Intent intent_enrique4 = new Intent(Csetwoonein.this, enrique4.class);
                startActivity(intent_enrique4);
                break;
            case
                    choice_53:
                Intent intent_enrique5 = new Intent(Csetwoonein.this, enrique5.class);
                startActivity(intent_enrique5);
                break;
            case
                    choice_54:
                Intent intent_enrique6 = new Intent(Csetwoonein.this, enrique6.class);
                startActivity(intent_enrique6);
                break;
            case
                    choice_55:
                Intent intent_enrique7 = new Intent(Csetwoonein.this, enrique7.class);
                startActivity(intent_enrique7);
                break;
            case
                    choice_56:
                Intent intent_enrique8 = new Intent(Csetwoonein.this, enrique8.class);
                startActivity(intent_enrique8);
                break;

        }
    }

}

