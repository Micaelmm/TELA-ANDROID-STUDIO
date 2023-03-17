package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private EditText nome, idade;
    private RadioButton resultadomasculino, resultadofeminino;
    private TextView resultadonome, resultadoidade, resultadosexo;



    @SuppressWarnings("unused")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.editnome);
        idade = findViewById(R.id.editidade);
        resultadofeminino = findViewById(R.id.radionfeminino);
        resultadomasculino = findViewById(R.id.radionmasculino);
        resultadonome = findViewById(R.id.resultadonome);
        resultadoidade = findViewById(R.id.resultadoidade);
        resultadosexo = findViewById(R.id.resultadosexo);
        Button botaocadastrar = findViewById(R.id.buttoncadastrar);
        botaocadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editnome = nome.getText().toString();
                String editidade = idade.getText().toString();
                if (editnome.isEmpty() || editidade.isEmpty()){
                    Snackbar.make(v, "preencha o nome e a idade", Snackbar.LENGTH_SHORT).show();

                }
                else {
                    RadioButtonSelection(v);
                }
            }

            private void RadioButtonSelection(View view) {
                String editnome = nome.getText().toString();
                String editidade = idade.getText().toString();
                if (resultadofeminino.isChecked()){
                    resultadonome.setText(editnome);
                    resultadoidade.setText(editidade);
                    resultadosexo.setText("o sexo e feminino");
                }
                else if(resultadomasculino.isChecked()){
                    resultadonome.setText(editnome);
                    resultadoidade.setText(editidade);
                    resultadosexo.setText("o sexo e Masculino");

                }
                else {
                    Snackbar.make(view, "coloque o seu sexo", Snackbar.LENGTH_SHORT).show();
                }
            }

        });

    }


}



