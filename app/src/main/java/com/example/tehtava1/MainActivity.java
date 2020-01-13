package com.example.tehtava1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button button_save;
    private Button button_done;
    private TextView teksti;
    private EditText teksti2;
    private ArrayList lista = new ArrayList<String>();
    private String data;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        this.button_done = findViewById(R.id.button2);
        this.button_save = findViewById(R.id.button);
        this.teksti = findViewById(R.id.teksti1);
        this.teksti2 = findViewById(R.id.edittext);


        this.button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (teksti2.length() > 3 && teksti2.length() < 15) {
                    lista.add(teksti2.getText().toString());




                    teksti2.setText("");
                }
                else
                    Toast.makeText(MainActivity.this, "Min 4 max 14!!", Toast.LENGTH_SHORT).show();








            }
        });

        this.button_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putStringArrayListExtra("omg",lista);
                startActivity(i);


            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
