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

import org.w3c.dom.Text;

public class siddhu extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siddhu);
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

        for (Siddhu_List enum_of_siddhu : Siddhu_List.values()) {
            adapter_of_titles.add(getString(enum_of_siddhu.title));
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
        Siddhu_List item_of_list = Siddhu_List.values()[position];
        switch (item_of_list) {
            case
                    choice_35:
                Intent intent_english = new Intent(siddhu.this, english.class);
                startActivity(intent_english);
                break;
            case
                    choice_36:
                Intent intent_Mone1 = new Intent(siddhu.this, Mone1.class);
                startActivity(intent_Mone1);
                break;

            case
                    choice_37:
                Intent intent_mtwo2 = new Intent(siddhu.this, mtwo2.class);
                startActivity(intent_mtwo2);
                break;
            case
                    choice_38:
                Intent intent_physics = new Intent(siddhu.this, physics.class);
                startActivity(intent_physics);
                break;
            case
                    choice_39:
                Intent intent_CseChemistry = new Intent(siddhu.this, Csechemistry.class);
                startActivity(intent_CseChemistry);

                break;
            case
                    choice_40:
                Intent intent_programming = new Intent(siddhu.this, programming.class);
                startActivity(intent_programming);
                break;
            case
                    choice_41:
                Intent intent_CseEnglish = new Intent(siddhu.this, CseEnglish.class);
                startActivity(intent_CseEnglish);
                break;
            case
                    choice_42:
                Intent intent_Engmech = new Intent(siddhu.this, Engmech.class);
                startActivity(intent_Engmech);
                break;
            case
                    choice_43:
                Intent intent_PhyLab = new Intent(siddhu.this, PhyLab.class);
                startActivity(intent_PhyLab);
                break;
            case
                    choice_44:
                Intent intent_Chemlab = new Intent(siddhu.this, Chemlab.class);
                startActivity(intent_Chemlab);
                break;
            case
                    choice_45:
                Intent intent_workshop1 = new Intent(siddhu.this, workshop1.class);
                startActivity(intent_workshop1);
                break;
            case
                    choice_46:
                Intent intent_programlab = new Intent(siddhu.this, programlab.class);
                startActivity(intent_programlab);
                break;
            case
                    choice_47:
                Intent intent_Englab = new Intent(siddhu.this, Englab.class);
                startActivity(intent_Englab);
                break;
        }
    }


}
