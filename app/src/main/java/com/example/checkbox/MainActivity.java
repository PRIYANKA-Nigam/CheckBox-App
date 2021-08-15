package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t;
CheckBox c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox)findViewById(R.id.checkBox6);
        c2=(CheckBox)findViewById(R.id.checkBox7);
        c3=(CheckBox)findViewById(R.id.checkBox8);
        c4=(CheckBox)findViewById(R.id.checkBox9);
        c5=(CheckBox)findViewById(R.id.checkBox10);
        t=(TextView) findViewById(R.id.textView2);

    }
    public void onclick(View view){
        Boolean check=((CheckBox )view).isChecked();
        switch (view.getId()){
            case R.id.checkBox6:
                if(check)
                    t.setText("Frugal & laborious person");break;
            case R.id.checkBox7:
                if(check)
                    t.setText("Pretty & hard working");break;
            case R.id.checkBox8:
                if(check)
                    t.setText("good natured & ambivert");break;
            case R.id.checkBox9:
                if(check)
                    t.setText("smart & combative");break;
            case R.id.checkBox10:
                if(check)
                    t.setText("quiet & introvert");break;
        }
    }
}