package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);
        textView=findViewById(R.id.textView);

        ArrayList<String>spinnerList=new ArrayList<>();
        spinnerList.add("-------");

        for(int i=1;i<=10;i++){
            spinnerList.add("Nombre "+i);
        }

        ArrayAdapter<CharSequence>adaptador=new ArrayAdapter(this,android.R.layout.simple_spinner_item,spinnerList);

        spinner.setAdapter(adaptador);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(parent.getContext(),"Seleccionado : "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();

                textView.setText("Seleccionado : "+parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
