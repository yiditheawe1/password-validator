package com.example.afinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    //for input receiving
    private EditText et;
    //for text displaying
    private TextView tv;
    //for the button
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find components by id
        et = (EditText) findViewById(R.id.pwdtxt);
        tv = (TextView) findViewById(R.id.fdbk);
        b = (Button) findViewById(R.id.btn);

        /*click response for button
            need to 1st click on the password field util a red dot shows up
            then click on the green check mark on the bottom right corner of
            the keyboard to hide the keyboard.
         */
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                //get input from textPassword
                String pwdcpy = et.getText().toString();
                HashMap hm = new HashMap();
                hm = Validator.validation(pwdcpy);
                //out put result to textView
                tv.setText(hm.get("message").toString());
                et.setText("");
            }
        });
    }
}
