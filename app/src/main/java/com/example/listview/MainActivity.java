package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<String> cursosMatriculados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1. Conectamos nuestro listView a lista a través del id
        lista = findViewById(R.id.listView);

        // 2. Instanciamos la Lista y agregamos elementos
        cursosMatriculados = new ArrayList<>();
        cursosMatriculados.add("Desarrollo de Aplicaciones Móviles");
        cursosMatriculados.add("Sistemas Operativos");
        cursosMatriculados.add("Sistemas de Información");
        cursosMatriculados.add("Análisis y Diseño de Sistemas");
        cursosMatriculados.add("Simulación de Sistemas");
        cursosMatriculados.add("Arquitectura de Sistemas");
        cursosMatriculados.add("Big Data");

        // 3. Definir el Adaptador
        ArrayAdapter adaptadorCursos = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                cursosMatriculados
        );

        // 4. Vinculamos el Adaptador con el listView
        lista.setAdapter(adaptadorCursos);

        //Toast
        Button btn = findViewById(R.id.buttonToast);
        btn.setOnClickListener(view -> Toast.makeText(this, "Matrícula Completa", Toast.LENGTH_SHORT).show());

        //Nombre Lista
        setTitle("Lista de Cursos Matriculados");
    }
}