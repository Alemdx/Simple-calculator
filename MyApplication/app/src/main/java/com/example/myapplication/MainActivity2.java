package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        TextView name = findViewById(R.id.name);
        TextView company = findViewById(R.id.company);
        TextView job = findViewById(R.id.job);
        TextView phoneType = findViewById(R.id.phoneType);
        TextView phone = findViewById(R.id.phone);
        TextView mailType = findViewById(R.id.mailType);
        TextView mail = findViewById(R.id.mail);
        TextView more = findViewById(R.id.more);
        TextView groupIn = findViewById(R.id.groupIn);
        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        company.setText(intent.getStringExtra("company"));
        job.setText(intent.getStringExtra("job"));
        phoneType.setText(intent.getStringExtra("phoneType"));
        phone.setText(intent.getStringExtra("phone"));
        mailType.setText(intent.getStringExtra("mailType"));
        mail.setText(intent.getStringExtra("mail"));
        more.setText(intent.getStringExtra("more"));
        groupIn.setText(intent.getStringExtra("groupIn"));
    }
}