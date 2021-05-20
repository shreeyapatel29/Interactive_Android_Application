package com.example.icecreamorder;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import android.text.Editable;
import android.text.TextWatcher;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button b1,b2;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        et1=(EditText)findViewById(R.id.editText2);
        tv1=(TextView)findViewById(R.id.textView4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String a=et1.getText().toString();
                int a1=Integer.parseInt(a);
                a1=a1+1;
                et1.setText(String.valueOf(a1));
                double price=a1*3.99;
                DecimalFormat numberFormat = new DecimalFormat("#.##");
                 String price1 = numberFormat.format(price);
                tv1.setText(String.valueOf(price1));

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et1.getText().toString();
                int a1=Integer.parseInt(a);
                if(a1<=0){
                    Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();

                }
                else {
                    a1=a1-1;
                    et1.setText(String.valueOf(a1));
                    double price=a1*3.99;
                    DecimalFormat numberFormat = new DecimalFormat("#.##");
                     String price1 = numberFormat.format(price);
                    tv1.setText(String.valueOf(price1));
                }

            }


        });
        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                    String a=et1.getText().toString();
                    if(!a.equals("")){
                    int a1=Integer.parseInt(a);
                    Double price=a1*3.99;
                    DecimalFormat numberFormat = new DecimalFormat("#.##");
                    String price1 = numberFormat.format(price);
                    tv1.setText(String.valueOf(price1));}
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
