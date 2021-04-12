package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String[] phoneTypes, mailTypes;
    private Spinner phoneList, mailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
        ((ImageButton) findViewById(R.id.imageButton2)).setOnClickListener(this);

        phoneTypes = getResources().getStringArray(R.array.phone);
        phoneList = (Spinner) findViewById(R.id.spinner1);

        mailTypes = getResources().getStringArray(R.array.email);
        mailList = (Spinner) findViewById(R.id.spinner2);
    }

    @Override
    public void onClick(View v) {
        ImageButton imgBtn = (ImageButton) findViewById(R.id.imageButton2);
        if (v == imgBtn) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            EditText name = (EditText) findViewById(R.id.name);
            EditText company = (EditText) findViewById(R.id.company);
            EditText job = (EditText) findViewById(R.id.job);
            int idx1 = phoneList.getSelectedItemPosition();
            String phoneType = phoneTypes[idx1];
            EditText phone = (EditText)findViewById(R.id.phone);
            int idx2 = mailList.getSelectedItemPosition();
            String mailType = mailTypes[idx2];
            EditText mail = (EditText)findViewById(R.id.mail);
            EditText more = (EditText) findViewById(R.id.more);
            EditText groupIn = (EditText) findViewById(R.id.groupIn);
            intent.putExtra("name", name.getText().toString());
            intent.putExtra("company", company.getText().toString());
            intent.putExtra("job", job.getText().toString());
            intent.putExtra("phoneType", phoneType);
            intent.putExtra("phone", phone.getText().toString());
            intent.putExtra("mailType", mailType);
            intent.putExtra("mail", mail.getText().toString());
            intent.putExtra("more", more.getText().toString());
            intent.putExtra("groupIn", groupIn.getText().toString());
            startActivity(intent);
        }
    }
}