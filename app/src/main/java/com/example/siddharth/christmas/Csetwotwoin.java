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

public class Csetwotwoin extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csetwotwoin);
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

        for (Csetwotwoin_List enum_of_csetwotwoin : Csetwotwoin_List.values()) {
            adapter_of_titles.add(getString(enum_of_csetwotwoin.title));
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
        Csetwotwoin_List item_of_list = Csetwotwoin_List.values()[position];
        switch (item_of_list) {
            case
                    choice_57:
                Intent intent_ana1 = new Intent(Csetwotwoin.this, ana1.class);
                startActivity(intent_ana1);
                break;
            case
                    choice_58:
                Intent intent_ana2 = new Intent(Csetwotwoin.this, ana2.class);
                startActivity(intent_ana2);
                break;

            case
                    choice_59:
                Intent intent_ana3 = new Intent(Csetwotwoin.this, ana3.class);
                startActivity(intent_ana3);
                break;
            case
                    choice_60:
                Intent intent_ana4 = new Intent(Csetwotwoin.this, ana4.class);
                startActivity(intent_ana4);
                break;
            case
                    choice_61:
                Intent intent_ana5= new Intent(Csetwotwoin.this, ana5.class);
                startActivity(intent_ana5);
                break;
            case
                    choice_62:
                Intent intent_ana6 = new Intent(Csetwotwoin.this, ana6.class);
                startActivity(intent_ana6);
                break;
            case
                    choice_63:
                Intent intent_ana7 = new Intent(Csetwotwoin.this, ana7.class);
                startActivity(intent_ana7);
                break;
            case
                    choice_64:
                Intent intent_ana8 = new Intent(Csetwotwoin.this, ana8.class);
                startActivity(intent_ana8);
                break;

        }
    }

}


