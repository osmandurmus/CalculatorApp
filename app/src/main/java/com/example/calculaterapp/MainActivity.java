package com.example.calculaterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.calculaterapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding _binding;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        _binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(_binding.getRoot());
        calculator=new Calculator(_binding.textviewDisplayscreen,getApplicationContext());

        setNumberButtonsClickListeners();
        setProcessButtonsClickListeners();
        otherButtonSetOnClickListeners();
    }

    private void setNumberButtonsClickListeners(){
        _binding.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addNumber("0")) calculator.equalClicked = false;
            }
        });
        _binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addNumber("1")) calculator.equalClicked = false;
            }
        });
        _binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addNumber("2")) calculator.equalClicked = false;

            }
        });
        _binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addNumber("3")) calculator.equalClicked = false;

            }
        });
        _binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addNumber("4")) calculator.equalClicked = false;

            }
        });
        _binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addNumber("5")) calculator.equalClicked = false;

            }
        });
        _binding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addNumber("6")) calculator.equalClicked = false;

            }
        });
        _binding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (calculator.addNumber("7")) calculator.equalClicked = false;

            }
        });
        _binding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addNumber("8")) calculator.equalClicked = false;

            }
        });
        _binding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addNumber("9")) calculator.equalClicked = false;
            }
        });
    }
    private void setProcessButtonsClickListeners(){

        _binding.btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addOperand("%")) calculator.equalClicked = false;
            }
        });
        _binding.btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addOperand("+")) calculator.equalClicked = false;
            }
        });
        _binding.btnExtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addOperand("-")) calculator.equalClicked = false;
            }
        });
        _binding.btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addOperand("\u00F7")) calculator.equalClicked = false;
            }
        });
        _binding.btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addOperand("x")) calculator.equalClicked = false;

            }
        });
    }
    private void otherButtonSetOnClickListeners(){
        _binding.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _binding.textviewDisplayscreen.setText("");
                calculator.openParenthesis = 0;
                calculator.dotUsed = false;
                calculator.equalClicked = false;
            }
        });
        _binding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_binding.textviewDisplayscreen.getText().toString().length()==0){
                    return;
                }
                StringBuilder stringBuilder=new StringBuilder( _binding.textviewDisplayscreen.getText().toString());

                stringBuilder.deleteCharAt(stringBuilder.length()-1);
                _binding.textviewDisplayscreen.setText(stringBuilder.toString());
            }
        });
        _binding.btnEquel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_binding.textviewDisplayscreen.getText().toString() != null && !_binding.textviewDisplayscreen.getText().toString().equals(""))
                    calculator.calculate(_binding.textviewDisplayscreen.getText().toString());
            }
        });
        _binding.btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculator.addDot()) calculator.equalClicked = false;
            }
        });
    }

}
