package com.basiccalculator.rajibmitra.basiccal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdd, btnSubtract, btnDivide, btnMultiply ;

    private TextView tvResult ;
    private EditText etfirst, etsecond ;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       init();
    }

    private void init() {
        btnAdd= (Button)findViewById(R.id.btnAdd);
        btnSubtract = (Button)findViewById(R.id.btnSubtract);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnMultiply = (Button)findViewById(R.id.btnMultiply);
        etfirst = (EditText)findViewById(R.id.etFirstNumber);
        etsecond =(EditText)findViewById(R.id.etSecondNumber);
        tvResult = (TextView)findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        String num1 = etfirst.getText().toString();
        String num2 = etsecond.getText().toString();


        switch(view.getId()){
            case R.id.btnAdd :
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                tvResult.setText(String.valueOf(addition));
                break ;
            case R.id.btnSubtract :
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                tvResult.setText(String.valueOf(subtraction));
                break ;
            case R.id.btnDivide :
                try {
                    int divide = Integer.parseInt(num1) / Integer.parseInt(num2);
                    tvResult.setText(String.valueOf(divide));
                }catch (Exception e){
                    tvResult.setText("CAN NOT DIVIDE !");
                }

                break;
            case R.id.btnMultiply :
                int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                tvResult.setText(String.valueOf(multiplication));

                break ;


        }

    }
}
