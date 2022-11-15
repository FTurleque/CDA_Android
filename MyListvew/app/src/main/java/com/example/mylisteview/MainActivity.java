package com.example.mylisteview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        btnAdd = findViewById(R.id.btn_addPerson);

        btnAdd.setOnClickListener(this::onClick_add);

        String[] tab = new String[]{"membre1","membre2","membre3","membre4","membre5"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tab);
        listView.setAdapter(arrayAdapter);
    }

    public void onClick_add(View v) {
        Intent addPerson = new Intent(this, AddPerson.class);
        startActivity(addPerson);
    }
}