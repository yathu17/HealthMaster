package com.example.healthmaster.Menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.healthmaster.R;

public class Home_BMI extends AppCompatActivity {
    EditText etheight, etweight, etage;
    TextView result, comment;
    Button btncal, startbt;
    float E1 = 0;
    float E2 = 0;
    float E3 = 0;
    float total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_bmi);
        getSupportActionBar().hide();


        etage = (EditText) findViewById(R.id.etAge);
        etheight = (EditText) findViewById(R.id.etHeight);
        etweight = (EditText) findViewById(R.id.etWeight);
        result = (TextView) findViewById(R.id.Result);
        comment = (TextView) findViewById(R.id.comment);
        btncal = (Button) findViewById(R.id.btncal);
        startbt = findViewById(R.id.start);


        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etheight.getText().toString())) {
                    etheight.setError("Please enter your Height ");
                    return;
                } else if (TextUtils.isEmpty(etweight.getText().toString())) {
                    etweight.setError("Please Enter your Weight");
                    return;
                } else if (TextUtils.isEmpty(etage.getText().toString())) {
                    etage.setError("Please enter your Age ");
                }
                float ETW = Integer.parseInt(etweight.getText().toString());
                float ETH = Integer.parseInt(etheight.getText().toString());
                E1 = (ETW / ETH);
                E2 = (E1 / ETH);
                E3 = (E2 * 10000);
                result.setText(String.valueOf("Your BMI IS - " + E3));

                if (E3 < 18) {
                    comment.setText(String.valueOf("LOW BMI"));
                    return;
                } else if (E3 <= 24) {
                    comment.setText(String.valueOf(" NORMAL BMI"));
                    return;
                } else if (E3 <= 27) {
                    comment.setText(String.valueOf("OVER WEIGHT BMI"));
                    return;
                } else if (E3 > 27) {
                    comment.setText(String.valueOf("OBESE"));
                    return;
                }
            }

        });

        startbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etheight.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "You should check your BMI everyday", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    Toast.makeText(getApplicationContext(), "BMI Saved", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Home_BMI.this, Workout_type.class);
                    startActivity(intent);
                }
            }
        });

    }
}
