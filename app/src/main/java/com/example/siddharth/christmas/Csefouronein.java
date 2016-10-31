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

public class Csefouronein extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csefouronein);
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

        for (Csefouronein_List enum_of_csefouronein : Csefouronein_List.values()) {
            adapter_of_titles.add(getString(enum_of_csefouronein.title));
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
        Csefouronein_List item_of_list = Csefouronein_List.values()[position];
        switch (item_of_list) {
            case
                    choice_83:
                Intent intent_ash1 = new Intent(Csefouronein.this, ash1.class);
                startActivity(intent_ash1);
                break;
            case
                    choice_84:
                Intent intent_ash2 = new Intent(Csefouronein.this, ash2.class);
                startActivity(intent_ash2);
                break;

            case
                    choice_85:
                Intent intent_ash3 = new Intent(Csefouronein.this, ash3.class);
                startActivity(intent_ash3);
                break;
            case
                    choice_86:
                Intent intent_ash4 = new Intent(Csefouronein.this, ash4.class);
                startActivity(intent_ash4);
                break;
            case
                    choice_87:
                break;
            case
                    choice_88:
                Intent intent_ash6 = new Intent(Csefouronein.this, ash6.class);
                startActivity(intent_ash6);
                break;
            case
                    choice_89:
                Intent intent_ash7 = new Intent(Csefouronein.this, ash7.class);
                startActivity(intent_ash7);
                break;
            case
                    choice_90:
                Intent intent_ash8 = new Intent(Csefouronein.this, ash8.class);
                startActivity(intent_ash8);
                break;
            case
                    choice_91:
                Intent intent_ash9 = new Intent(Csefouronein.this, ash9.class);
                startActivity(intent_ash9);
                break;
            case
                    choice_92:
                Intent intent_ash10 = new Intent(Csefouronein.this, ash10.class);
                startActivity(intent_ash10);
                break;
            case
                    choice_93:
                Intent intent_ash11 = new Intent(Csefouronein.this, ash11.class);
                startActivity(intent_ash11);
                break;
            case
                    choice_94:
                Intent intent_ash12 = new Intent(Csefouronein.this, ash12.class);
                startActivity(intent_ash12);
                break;
            case
                    choice_95:
                Intent intent_ash13 = new Intent(Csefouronein.this, ash13.class);
                startActivity(intent_ash13);
                break;

        case
                choice_256:
            Intent intent_ash14 = new Intent(Csefouronein.this, ash14.class);
            startActivity(intent_ash14);
            break;
        case
                choice_257:
            Intent intent_ash15 = new Intent(Csefouronein.this, ash15.class);
            startActivity(intent_ash15);
            break;

        }

    }

}
