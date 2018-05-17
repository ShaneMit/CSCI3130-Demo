package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* My understanding of how to implement text submit buttons
   was by Joseph Kulandai's tutorial:
   https://javapapers.com/android/get-user-input-in-android/
   specifically step #6. published 05/09/2012
 *
   CSCI 3130, B00697137, Shane Mitravitz
   github: smitravitz

 */
public class MainActivity extends AppCompatActivity {

    TextView message;
    EditText editText;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                editText = findViewById(R.id.textInput);
                message = findViewById(R.id.textDisplay);
                String temp = editText.getText().toString();
                message.setText("" + temp);
            }
        });
    }



}
