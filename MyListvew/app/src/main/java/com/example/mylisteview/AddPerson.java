package com.example.mylisteview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddPerson extends AppCompatActivity {

    EditText editeNom;
    EditText editePrenom;
    Button valider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);

        editeNom = findViewById(R.id.editTxtName_editor);
        editePrenom = findViewById(R.id.editTxtPrenom_editor);
        valider = findViewById(R.id.btnValider);

        valider.setOnClickListener(this::onClickValider);
    }

    public void onClickValider(View v) {
        if (editeNom != null) {

        }
    }
}