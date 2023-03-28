package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed;
    TextView result,label;
    RadioButton m,cm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed=findViewById(R.id.input);
        result=findViewById(R.id.result);
        label=findViewById(R.id.changelabel);
        m=findViewById(R.id.meter);
        cm=findViewById(R.id.centimeter);





    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();


        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.centimeter:
                if (checked){
                    cm.setBackgroundColor(Color.WHITE);
                    cm.setTextColor(Color.BLACK);
                    m.setBackgroundColor(Color.rgb(66,66,66));
                    m.setTextColor(Color.WHITE);
                    label.setText("METER");
                    ed.setText("");
                    result.setText("");
                    break;

                }



            case R.id.meter:
                if (checked){
                    m.setBackgroundResource(R.color.white);
                    m.setTextColor(Color.BLACK);
                    cm.setBackgroundColor(Color.rgb(66,66,66));
                    cm.setTextColor(Color.WHITE);
                    label.setText("CENTIMETER");
                    ed.setText("");
                    result.setText("");
                    break;
                }

        }
    }

    @SuppressLint("SetTextI18n")
    public void clickhere(View view) {
        if(label.getText().toString()=="CENTIMETER"){
            double n3=Double.parseDouble(ed.getText().toString());
            double n2=n3*100;
            result.setText(""+n2+"  cm");

        }
        if(label.getText().toString()=="METER"){
            double n1 = Double.parseDouble(ed.getText().toString());
            result.setText("" + n1 * 0.01+"  m");

        }
    }
}