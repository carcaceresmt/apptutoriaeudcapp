package com.udc.apptutoriados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.udc.apptutoriados.modelo.CalculoImc;

public class MainActivity extends AppCompatActivity {

    private EditText pesotext;
    private EditText alturatext;
    private TextView imctext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pesotext=findViewById(R.id.pesotext);
        alturatext=findViewById(R.id.alturatext);
        imctext=findViewById(R.id.imctext);
    }

    public void calcularIMC(View view){
        CalculoImc calc=new CalculoImc(pesotext.getText().toString(),
                  alturatext.getText().toString());
        imctext.setText(calc.salidaIMC());
    }
}