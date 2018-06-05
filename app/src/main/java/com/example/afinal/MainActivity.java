package com.example.afinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void clickResponse(View v){
        EditText edit =(EditText) findViewById(R.id.PasswordView);
        TextView fd= (TextView) findViewById(R.id.FeedbackView);
        fd.setText(edit.getText().toString());
    }
}
