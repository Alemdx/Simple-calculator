package com.example.m;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public  class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    private EditText editText;//显示输入的数字
    private String opt = "+";//操作符
    private double n1 = 0.0, n2 = 0.0;//两个操作数
    private TextView textView;//显示算式

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1= findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonPLUS = findViewById(R.id.buttonplus);
        Button buttonMIN = findViewById(R.id.buttonmin);
        Button buttonMUL = findViewById(R.id.buttonmul);
        Button buttonDIV = findViewById(R.id.buttonDivide);
        Button buttonAC = findViewById(R.id.buttonAC);
        Button buttonPL = findViewById(R.id.buttonpl);
        Button buttonMOD = findViewById(R.id.buttonmod);
        Button buttonEQUAL = findViewById(R.id.buttonequal);
        Button buttonDOT = findViewById(R.id.button_dot);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonPLUS.setOnClickListener(this);
        buttonMIN.setOnClickListener(this);
        buttonMOD.setOnClickListener(this);
        buttonDIV.setOnClickListener(this);
        buttonDOT.setOnClickListener(this);
        buttonAC.setOnClickListener(this);
        buttonPL.setOnClickListener(this);
        buttonEQUAL.setOnClickListener(this);
        buttonMUL.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView editText = findViewById(R.id.edit1);
        TextView textView = (TextView) findViewById(R.id.textView1);
        String s = editText.getText().toString();
        Button btn =(Button)v;
        try{

            switch(v.getId())
            {
                case R.id.button1:
                {
                    String str = editText.getText().toString();
                    editText.setText(str + 1);
                    str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.buttonplus:
                {
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "+";
                    textView.setText(n1 + opt);
                    editText.setText("");
                    break;
                }
                case R.id.button2:
                {
                    String str = editText.getText().toString();
                    editText.setText(str + 2);
                    str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.buttonequal:
                {
                    if(opt == "+")
                    {
                        String str = editText.getText().toString();
                        n2 = Double.parseDouble(str);
                        textView.setText(n1 + opt + n2 + "=");
                        editText.setText((n1 + n2) + "");
                    }
                    else if(opt == "-")
                    {
                        String str = editText.getText().toString();
                        n2 = Double.parseDouble(str);
                        textView.setText(n1 + opt + n2 + "=");
                        editText.setText((n1 - n2) + "");
                    }
                    else if(opt == "*")
                    {
                        String str = editText.getText().toString();
                        n2 = Double.parseDouble(str);
                        textView.setText(n1 + opt + n2 + "=");
                        editText.setText((n1 * n2) + "");
                    }
                    else if(opt == "%")
                    {
                        String str = editText.getText().toString();
                        n2 = Double.parseDouble(str);
                        textView.setText(n1 + opt + n2 + "=");
                        editText.setText((n1 % n2) + "");
                    }
                    else if(opt == "/")
                    {
                        String str = editText.getText().toString();
                        n2 = Double.parseDouble(str);
                        if(n2 == 0)
                        {
                            editText.setText("");
                            textView.setText("除数不能为0");
                            break;
                        }
                        else
                        {
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 / n2) + "");
                        }
                    }

                    break;
                }
                case R.id.button3:
                {
                    editText.setText(editText.getText().toString() + 3);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.button4:
                {
                    editText.setText(editText.getText().toString() + 4);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.button5:
                {
                    editText.setText(editText.getText().toString() + 5);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.button6:
                {
                    editText.setText(editText.getText().toString() + 6);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.button7:
                {
                    editText.setText(editText.getText().toString() + 7);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.button8:
                {
                    editText.setText(editText.getText().toString() + 8);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.button9:
                {
                    editText.setText(editText.getText().toString() + 9);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.button0:
                {
                    textView.setText(n1 + opt + 10);
                    editText.setText(editText.getText().toString() + 0);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.button_dot:
                {
                    String str = editText.getText().toString();
                    if(str.indexOf(".") != -1)
                    {

                    }
                    else
                    {
                        if(str.equals("0"))
                            editText.setText(("0" + ".").toString());
                        else if(str.equals(""))
                        {

                        }
                        else
                            editText.setText(str + ".");
                    }
                    break;
                }
                case R.id.buttonDivide:
                {
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "/";
                    editText.setText("");
                    textView.setText(n1 + opt);
                    break;
                }
                case R.id.buttonmul:
                {
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "*";
                    editText.setText("");
                    textView.setText(n1 + opt);
                    break;
                }
                case R.id.buttonmin:
                {
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "-";
                    editText.setText("");
                    textView.setText(n1 + opt);
                    break;
                }
                case R.id.buttonmod:
                {
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "%";
                    editText.setText("");
                    textView.setText(n1 + opt);
                    break;
                }
                case R.id.buttonpl:
                {
                    String str =editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    if(str.length() > 0)
                        editText.setText(-n1 + "");
                    textView.setText(-n1 + "");
                    break;
                }
                case R.id.buttonAC:
                {
                    String str =editText.getText().toString();
                    if(str.length() > 0) {
                        textView.setText("");
                        editText.setText("");
                    }
                    break;
                }

            }
        }catch(Exception e){}

    }

}