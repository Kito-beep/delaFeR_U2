package com.example.delafer_u2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment4 extends Fragment {

    private EditText res;
    private double number = 0;
    private boolean operType = false;
    private double count = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment4_layout, container, false);

        res = vista.findViewById(R.id.entrada);
        res.setText(null);

        Button btnCero = vista.findViewById(R.id.buttonCero);
        Button btn1 = vista.findViewById(R.id.button1);
        Button btn2 = vista.findViewById(R.id.button2);
        Button btn3 = vista.findViewById(R.id.button3);
        Button btn4 = vista.findViewById(R.id.button4);
        Button btn5 = vista.findViewById(R.id.button5);
        Button btn6 = vista.findViewById(R.id.button6);
        Button btn7 = vista.findViewById(R.id.button7);
        Button btn8 = vista.findViewById(R.id.button8);
        Button btn9 = vista.findViewById(R.id.button9);
        Button btnC = vista.findViewById(R.id.buttonC);
        Button btnMas = vista.findViewById(R.id.buttonMas);
        Button btnMenos = vista.findViewById(R.id.buttonMenos);
        Button btnIgual = vista.findViewById(R.id.buttonIg);
        Button btnPst = vista.findViewById(R.id.buttonPST);


        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (res.getText() != null) res.setText(res.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText(res.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText(res.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText(res.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText(res.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText(res.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText(res.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText(res.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText(res.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText(res.getText()+"9");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res.setText(null);
            }
        });

        btnPst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Float.parseFloat(res.getText().toString()) == 0) {

                    res.setText("Introduce algún valor");
                    res.setTextSize(38);
                } else {

                    res.setText(String.valueOf(Float.parseFloat(res.getText().toString()) * 166.3860));
                }
            }
        });

        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = Float.parseFloat(res.getText().toString());
                res.setText(null);
                operType = true;
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = Float.parseFloat(res.getText().toString());
                res.setText(null);
                operType = false;
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = Double.parseDouble(res.getText().toString());

                if(operType == false) {

                    count -= number;
                    res.setText(String.valueOf(-count));
                } else{

                    count += number;
                    res.setText(String.valueOf(count));
                }
            }
        });

        return vista;
    }
}