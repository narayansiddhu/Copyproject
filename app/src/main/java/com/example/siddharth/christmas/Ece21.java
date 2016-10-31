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

public class Ece21 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece21);
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

        for (Ece21_List enum_of_ece21 : Ece21_List.values()) {
            adapter_of_titles.add(getString(enum_of_ece21.title));
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
        Ece21_List item_of_list = Ece21_List.values()[position];
        switch (item_of_list) {
            case
                    choice_127:
                Intent intent_enrique1 = new Intent(Ece21.this, enrique1.class);
                startActivity(intent_enrique1);
                break;
            case
                    choice_128:
                Intent intent_vid2 = new Intent(Ece21.this, vid2.class);
                startActivity(intent_vid2);
                break;

            case
                    choice_129:
                Intent intent_vid3 = new Intent(Ece21.this, vid3.class);
                startActivity(intent_vid3);
                break;
            case
                    choice_130:
                Intent intent_vid4 = new Intent(Ece21.this, vid4.class);
                startActivity(intent_vid4);
                break;
            case
                    choice_131:
                Intent intent_vid5 = new Intent(Ece21.this, vid5.class);
                startActivity(intent_vid5);
                break;
            case
                    choice_132:
                Intent intent_vid6 = new Intent(Ece21.this, vid6.class);
                startActivity(intent_vid6);
                break;
            case
                    choice_133:
                Intent intent_vid7 = new Intent(Ece21.this, vid7.class);
                startActivity(intent_vid7);
                break;
            case
                    choice_134:
                Intent intent_vid8 = new Intent(Ece21.this, vid8.class);
                startActivity(intent_vid8);
                break;
                    }
    }

}