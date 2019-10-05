package com.example.pracexam2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SecondActivity extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        FileInputStream eventC;
        try {
            eventC = openFileInput("data.txt");
            int token;
            String temp = "";
            while ((token = eventC.read()) != -1){
                temp = temp + ((char)token);
            }
            try {
                String[] list = temp.split("_");
                try {
                    ((TextView) (findViewById(R.id.content))).setText(list[0]);
                    ((TextView) (findViewById(R.id.content))).setText(list[1]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                eventC.close();
            } catch (FileNotFoundException e) {
                Log.d("error", "File Not Found Exception :(");
            } catch (IOException e) {
                Log.d("error", "IO Exception :(");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void submit(View view) {
        Toast.makeText(this, "registration sent...", Toast.LENGTH_SHORT).show();
    }

    public void previous(View view) {
        Intent intent = new Intent(this, com.example.pracexam2.MainActivity.class);
        startActivity(intent);
    }
}