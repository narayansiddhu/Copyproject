package com.example.siddharth.christmas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    // intializing webview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final Toolbar toolbar = (Toolbar)findViewById(R.id.Mytool);
        setSupportActionBar(toolbar);


        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsebar);
        collapsingToolbarLayout.setTitle("MGU SYLLABUS");



        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context, R.color.colorAccent));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "E-Mail to narayansiddhu@gmail.com , for any comments", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        ListView view_of_list = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter_of_titles = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1);

        for (Traditions_List enum_of_traditions: Traditions_List.values())  {
            adapter_of_titles.add(getString(enum_of_traditions.title));
        }

view_of_list.setAdapter(adapter_of_titles);


view_of_list.setOnItemClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_option1:
                Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           Traditions_List item_of_list = Traditions_List.values()[position];
        switch (item_of_list) {
            case choice_1:
                Intent intent_contemplate = new Intent(MainActivity.this, contemplate.class);
                startActivity(intent_contemplate);
                break;
            case choice_2:
                Intent intent_Ece = new Intent(MainActivity.this, Ece.class);
                startActivity(intent_Ece);
                break;
            case choice_3:
                Intent intent_Eee = new Intent(MainActivity.this, Eee.class);
                startActivity(intent_Eee);
                break;
            case choice_777:
                Intent intent_result = new Intent(MainActivity.this, result.class);
                startActivity(intent_result);
                break;

        }


    }
}
