package com.example.pracexam2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void writeData(View view) throws IOException {
        String activities = "data.txt";
        FileOutputStream fosWriter;
        fosWriter = openFileOutput(activities, Context.MODE_PRIVATE);
        if(((CheckBox)(findViewById(R.id.A1))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.A1)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.A2))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.A2)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.A3))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.A3)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.A4))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.A4)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.A5))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.A5)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.A6))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.A6)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.A7))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.A7)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.A8))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.A8)).getText().toString()).getBytes());
        }
        fosWriter.write(("_" + ((EditText)(findViewById(R.id.comment))).getText().toString()).getBytes());
        Toast.makeText(this,"Data saved...", Toast.LENGTH_LONG).show();
    }

    public void showData(View view) {
        Intent intent = new Intent(this, com.example.pracexam2.SecondActivity.class);
        startActivity(intent);
    }
}