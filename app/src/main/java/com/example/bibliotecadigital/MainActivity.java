package com.example.bibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private ImageButton imgbtn;
    private ProgressBar probar;

    @Override //ciclo work
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btnLogin);
        imgbtn = (ImageButton)findViewById(R.id.imgBtn);
        probar = (ProgressBar)findViewById(R.id.pb);

        imgbtn.setVisibility(View.INVISIBLE);
        probar.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override //constructor
            public void onClick(View view) {
                new Task().execute();
            }
        });
    }

    //1ra prueba para github 1er commit agregue los primeros 3 libros

    //OnClick para el boton de GitHub
    public void GitHub(View v){
        Intent i = new Intent(this, Github_act.class);
        startActivity(i);
    }

/*---------------------------------------------------------------------------------*/
    //Creo la tarea asyncrona, para asociar a mi boton Login
    //implementar Asynctask
    class Task extends AsyncTask<String, Void, String> {

        @Override // N-1 - configura el proceso inicial de mi tarea.
        protected void onPreExecute() {
            probar.setVisibility(View.VISIBLE); //a la hora de presionar hare visible el ProgressBar
        }

        @Override  // N-2 - emplea la tarea pesada.
        protected String doInBackground(String... strings) {

            for (int i = 1; i<10; i++){
                try {
                    Thread.sleep(300);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override  // N-3 - finaliza mi tarea asyncrona. y ahora abrira mi activity_Github.class
        protected void onPostExecute(String s) {
            probar.setVisibility(View.INVISIBLE); //Aquí
            imgbtn.setVisibility(View.VISIBLE); //
        }
    }

}