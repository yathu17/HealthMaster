package com.example.healthmaster.Sign_up;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.healthmaster.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Sign_in extends AppCompatActivity {
    TextInputEditText etRegEmail;
    TextInputEditText etRegPassword;
    TextView tvLoginHere;
    Button btnRegister;
    EditText Name, Phonenumber,age,Weight;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().hide();

        etRegEmail = findViewById(R.id.etRegEmail);
        etRegPassword = findViewById(R.id.etRegPass);
        tvLoginHere = findViewById(R.id.tvLoginHere);
        btnRegister = findViewById(R.id.btnRegister);
        Name=(EditText) findViewById(R.id.Name);
        age=(EditText) findViewById(R.id.age);
        Weight=(EditText) findViewById(R.id.weight);
        Phonenumber=(EditText)findViewById(R.id.phonenumber);

        mAuth = FirebaseAuth.getInstance();

        btnRegister.setOnClickListener(view ->{
            if (TextUtils.isEmpty(Name.getText().toString())) {
                Name.setError("Name Required ");
                return;
            } else if (TextUtils.isEmpty(Phonenumber.getText().toString())){
                Phonenumber.setError("Phone number required");
                return;
            }else if (TextUtils.isEmpty(age.getText().toString())){
                age.setError("Plase enter your age");
                return;
            }else if (TextUtils.isEmpty(Weight.getText().toString())){
                Weight.setError("Plase enter your weight");
                return;
            }
            createUser();

            String Email=etRegEmail.getText().toString().trim();
            String User_name=Name.getText().toString().trim();
            String Phone_number=Phonenumber.getText().toString().trim();
            String Age=age.getText().toString().trim();
            String User_Weight=Weight.getText().toString().trim();

            dataholder obj=new dataholder(Email,User_name,Phone_number,Age,User_Weight);


            FirebaseDatabase db=FirebaseDatabase.getInstance();
            DatabaseReference node=db.getReference("User");

            node.child(Phone_number).setValue(obj);



        });


        tvLoginHere.setOnClickListener(view ->{
            startActivity(new Intent(Sign_in.this, Sign_up.class));
        });
    }

    private void createUser(){
        String email = etRegEmail.getText().toString();
        String password = etRegPassword.getText().toString();

        if (TextUtils.isEmpty(email)){
            etRegEmail.setError("Email cannot be empty");
            etRegEmail.requestFocus();
        }else if (TextUtils.isEmpty(password)){
            etRegPassword.setError("Password cannot be empty");
            etRegPassword.requestFocus();
        }else{
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(Sign_in.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Sign_in.this, Sign_up.class));
                    }else{
                        Toast.makeText(Sign_in.this, "Registration Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

}