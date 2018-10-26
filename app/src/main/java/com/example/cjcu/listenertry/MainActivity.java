package com.example.cjcu.listenertry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.cjcu.listenertry.Calculator.AOperator;
import com.example.cjcu.listenertry.Calculator.DivisionException;
import com.example.cjcu.listenertry.Calculator.OperatorFactory;

public class MainActivity extends AppCompatActivity {

    EditText mEdittext_name1;
    EditText mEdittext_name2;
    TextView mTextview;
    Spinner operList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        ArrayAdapter<OperatorFactory.Operator> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, OperatorFactory.Operator.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        operList.setAdapter(adapter);
    }

    public void click(View view){
        OperatorFactory.Operator operator = (OperatorFactory.Operator)operList.getSelectedItem();
        double number_get1 = Double.parseDouble(mEdittext_name1.getText().toString());
        double number_get2 = Double.parseDouble(mEdittext_name2.getText().toString());
        AOperator ao = OperatorFactory.create(operator);

        if(ao == null){
            mTextview.setText("輸入錯誤");
        }
        else{
            ao.setNumbers(number_get1,number_get2);
            try{
                mTextview.setText(String.valueOf(ao.getAns()));
            }
            catch (DivisionException e){
                mTextview.setText(e.getMessage());
            }
            catch (Exception e){
                mTextview.setText("Exception");
            }
        }

    }

    public void init(){
        mEdittext_name1 = (EditText) findViewById(R.id.editText);
        mEdittext_name2 = (EditText) findViewById(R.id.editText2);
        mTextview = (TextView) findViewById(R.id.textView);
        operList = (Spinner) findViewById(R.id.OperList);
    }

    public void NextPage(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,activity_sub2.class);
        startActivity(intent);
    }
}
