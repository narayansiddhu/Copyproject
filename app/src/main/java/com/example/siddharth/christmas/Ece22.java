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

public class Ece22 extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece22);
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

        for (Ece22_List enum_of_ece22 : Ece22_List.values()) {
            adapter_of_titles.add(getString(enum_of_ece22.title));
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
        Ece22_List item_of_list = Ece22_List.values()[position];
        switch (item_of_list) {
            case
                    choice_135:
                Intent intent_ana1 = new Intent(Ece22.this, ana1.class);
                startActivity(intent_ana1);
                break;
            case
                    choice_136:
                Intent intent_nan2 = new Intent(Ece22.this, nan2.class);
                startActivity(intent_nan2);
                break;

            case
                    choice_137:
                Intent intent_nan3 = new Intent(Ece22.this, nan3.class);
                startActivity(intent_nan3);
                break;
            case
                    choice_138:
                Intent intent_nan4 = new Intent(Ece22.this, nan4.class);
                startActivity(intent_nan4);
                break;
            case
                    choice_139:
                Intent intent_nan5 = new Intent(Ece22.this, nan5.class);
                startActivity(intent_nan5);
                break;
            case
                    choice_140:
                Intent intent_ana6 = new Intent(Ece22.this, ana6.class);
                startActivity(intent_ana6);
                break;
            case
                    choice_141:
                Intent intent_nan7 = new Intent(Ece22.this, nan7.class);
                startActivity(intent_nan7);
                break;
            case
                    choice_142:
                Intent intent_nan8 = new Intent(Ece22.this, nan8.class);
                startActivity(intent_nan8);
                break;
        }
    }

}
