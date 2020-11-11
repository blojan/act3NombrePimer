package com.example.act3nombrepimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView resul = findViewById(R.id.resultado);

                EditText numero = findViewById(R.id.edit1);
                String n1= numero.getText().toString();

                int v1 = Integer.parseInt(n1);

                int array[] = new int[v1];
                int posicion=0;

                int divisibles;
                for(int i=0;posicion<v1;i++){
                    divisibles=0;
                    for(int j=1;j<=i;j++){
                        if(i%j==0){
                            divisibles++;
                        }
                    }
                    if(divisibles==2){
                        array[posicion]=i;
                        posicion++;
                    }
                }

                int ultimo=0;
                for(int i=0;i<array.length;i++) {
                    if(array[i]> ultimo){
                        ultimo = array[i];}
                }
                String ult = String.valueOf(ultimo);
                resul.setText(ult);

            }
        });
    }
}