package com.example.lenovo.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton r1,r2;
    Button btn;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1=findViewById(R.id.radio1);
        r2=findViewById(R.id.radio2);
        btn=findViewById(R.id.button);
        et=findViewById(R.id.edit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=et.getText().toString();

                if(r1.isChecked())
                    Toast.makeText(MainActivity.this, "Welcome Mr."+name, Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Welcome Miss."+name, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
