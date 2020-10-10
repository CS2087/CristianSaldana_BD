package com.example.bibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;

import PrecioLibros.Precio;

public class Github_act extends AppCompatActivity {

    private Spinner spin;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spin = (Spinner)findViewById(R.id.spbooks);
        text = (TextView)findViewById(R.id.tv);
        final Precio Prec = new Precio();
                                                        //agrgeo los dos libros que faltaban poder y despertar
        String[] books = {"Farenheith", "Revival", "El Alquimista", "El Poder", "Despertar"};

        spin.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, books));

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spin.getSelectedItem().toString().equals("Farenheith")){
                    text.setText("El precio de " + spin.getSelectedItem().toString() + " es: " + Prec.getFarenheith());
                }
                if (spin.getSelectedItem().toString().equals("Revival")){
                    text.setText("El precio de " + spin.getSelectedItem().toString() + " es: " + Prec.getRevival());
                }
                if (spin.getSelectedItem().toString().equals("El Alquimista")){
                    text.setText("El precio de " + spin.getSelectedItem().toString() + " es: " + Prec.getElAlquimista());
                }

                //Libros agregados
                if (spin.getSelectedItem().toString().equals("El Poder")){
                    text.setText("El precio de " + spin.getSelectedItem().toString() + " es: " + Prec.getElPoder());
                }
                if (spin.getSelectedItem().toString().equals("Despertar")){
                    text.setText("El precio de " + spin.getSelectedItem().toString() + " es: " + Prec.getDespertar());
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}