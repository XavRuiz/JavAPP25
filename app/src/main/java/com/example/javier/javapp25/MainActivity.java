package com.example.javier.javapp25;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2,et3, et4;
    private Button bt1,bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
    }

        public void login (View view){

            String nombre = et1.getText().toString();
            String apellido = et2.getText().toString();
            String pasuno = et3.getText().toString();
            String pasdos = et4.getText().toString();

            if(et3.getText().toString().equals(et4.getText().toString()))
            {
                Intent i = new Intent(this, Main2Activity.class);
                startActivity(i);
                //Toast notification = Toast.makeText(this,"Bienvenido catedratico",Toast.LENGTH_SHORT);
                //notification.show();
            }
            else {

                Toast notification = Toast.makeText(this,"Contraseña no coinciden",Toast.LENGTH_SHORT);
                notification.show();
            }

        }
}
