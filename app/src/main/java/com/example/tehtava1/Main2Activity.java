package com.example.tehtava1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    private TextView teksti3;
    private Button button_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        this.teksti3 = findViewById(R.id.teksti3);
        this.button_back = findViewById(R.id.button_back);
        if (intent != null) {

            ArrayList<String> array = intent.getStringArrayListExtra("omg");

            if (array.size() != 0)
                teksti3.setText(array.toString());

            else
                teksti3.setText("tyhjaaa");


        }

        this.button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i  = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
