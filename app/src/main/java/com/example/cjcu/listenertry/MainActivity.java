package com.example.cjcu.listenertry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEdittext_name1;
    EditText mEdittext_name2;
    EditText mEdittext_oper;
    TextView mTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void click(View view){
        String oper = mEdittext_oper.getText().toString();
        double number_get1 = Double.parseDouble(mEdittext_name1.getText().toString());
        double number_get2 = Double.parseDouble(mEdittext_name2.getText().toString());
        double ans = 0.0;
        AOperator ao = OperatorFactory.create(oper);

        if(ao == null){
            mTextview.setText("輸入錯誤");
        }
        else{
            ao.setNumbers(number_get1,number_get2);
        }

        try{
            mTextview.setText(String.valueOf(ao.getAns()));
        }
        catch (DivisionException e){
            mTextview.setText(e.getMessage());
        }

    }

    public void init(){
        mEdittext_name1 = (EditText) findViewById(R.id.editText);
        mEdittext_name2 = (EditText) findViewById(R.id.editText2);
        mEdittext_oper = (EditText) findViewById(R.id.edittext_Oper);
        mTextview = (TextView) findViewById(R.id.textView);
    }
}
