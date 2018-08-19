package com.ricardogwill.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView();
    }

    private ListView nameListView;
    private String[] names = new String[] {"Ally", "Betty", "Catherine", "Darcy", "Emily", "Franklin", "Geert", "Haley", "Iris", "Jacqueline", "Kelly", "Leonard", "Mary", "Ned", "Ophelia", "Paul", "Quaoar", "Robert", "Stephanie", "Tyler", "Ulysses", "Violet", "Wilson", "Xavier", "Yanny", "Zoroaster"};

    public void listView() {
        nameListView = findViewById(R.id.name_listView);
        ArrayAdapter<String> nameListAdapter = new ArrayAdapter<>(this, R.layout.name_list, names);
        nameListView.setAdapter(nameListAdapter);

        nameListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemName = (String) nameListView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Position: " + (position+1) + ", Name: " + itemName, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
