package com.massuperescupas.postobon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //ATRUBUTOS
    EditText numHoras,nombre;
    TextView resultado;
    Button Btn;

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numHoras=findViewById(R.id.numHoras);
        nombre=findViewById(R.id.nombreColaborador);
        resultado=findViewById(R.id.resultado);
        Btn = findViewById(R.id.Btn);

        Btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String Numstr= numHoras.getText().toString();
                String name = nombre.getText().toString();
                if(name.isEmpty() || Numstr.isEmpty())
                {
                    resultado.setText("Rellene todos los campos");
                }
                else
                {
                    int Num = Integer.parseInt(numHoras.getText().toString());
                    if (Num <= 40)
                    {
                        int Salario = Num * 20000;
                        resultado.setText("Empleado: " + name + " Salario: $" + String.valueOf(Salario));
                    }
                    else
                    {
                        int sBase = 800000;
                        int HorasExtras = Num - 40;
                        int Salarioo = (HorasExtras * 25000) + sBase;
                        resultado.setText("Empleado: " + name + " Salario: $" + String.valueOf(Salarioo));
                    }
                }
            }
        });
    }
}