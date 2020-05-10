package com.example.calculaterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.calculaterapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding _binding;
    private StringBuffer textStringBuffer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textStringBuffer = new StringBuffer();
        _binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(_binding.getRoot());
        setNumberButtonsClickListeners();
        setProcessButtonsClickListeners();
        otherButtonSetOnClickListeners();
    }

    private void setNumberButtonsClickListeners(){
        _binding.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("0");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("1");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("2");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("3");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("4");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("5");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("6");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("7");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());

            }
        });
        _binding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("8");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("9");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
    }
    private void setProcessButtonsClickListeners(){

        _binding.btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("%");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("+");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btnExtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("-");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("/");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append("X");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
    }
    private void otherButtonSetOnClickListeners(){
        _binding.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textStringBuffer.length()==0){
                    return;
                }
                textStringBuffer.delete(0, textStringBuffer.length());
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textStringBuffer.length()==0){
                    return;
                }
                textStringBuffer.deleteCharAt(textStringBuffer.length()-1);
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
        _binding.btnEquel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        _binding.btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textStringBuffer.append(".");
                _binding.textviewDisplayscreen.setText(textStringBuffer.toString());
            }
        });
    }
}
