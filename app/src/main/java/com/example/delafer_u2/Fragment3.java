package com.example.delafer_u2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    private EditText entrada;
    private TextView salida;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment3_layout, container, false);
        entrada = vista.findViewById(R.id.Text);
        salida = vista.findViewById(R.id.salida);

        Button btnRed = vista.findViewById(R.id.button);
        Button btn0 = vista.findViewById(R.id.button0);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                salida.setText(String.valueOf(Float.parseFloat(entrada.getText().toString()) * 2.0));
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                entrada.setText(entrada.getText()+"0");
            }
        });

        return vista;
    }
}