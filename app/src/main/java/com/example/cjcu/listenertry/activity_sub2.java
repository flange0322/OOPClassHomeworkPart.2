package com.example.cjcu.listenertry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cjcu.listenertry.R;
import com.example.cjcu.listenertry.priceCalculator.CashContext;
import com.example.cjcu.listenertry.priceCalculator.CashRandom;
import com.example.cjcu.listenertry.priceCalculator.CashRebate;
import com.example.cjcu.listenertry.priceCalculator.CashReturn;
import com.example.cjcu.listenertry.priceCalculator.CashSuper;

public class activity_sub2 extends AppCompatActivity {

    EditText money_text;
    EditText quantity_text;
    Button Cal_btn;
    TextView show_sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        init();
    }

    public void init(){
        money_text = (EditText) findViewById(R.id.money_Text);
        quantity_text = (EditText) findViewById(R.id.quantity_Text);
        Cal_btn = (Button) findViewById(R.id.Cal_btn);
        show_sum = (TextView) findViewById(R.id.show_SumMoney);
    }

    public void CalClick(View view) {
        double money = Integer.parseInt(money_text.getText().toString());
        double quantity = Integer.parseInt(quantity_text.getText().toString());

        CashSuper cs = new CashRebate(0.8); //純折扣
        cs = new CashReturn(1000,100); //滿X給Y
        cs = new CashRandom();
        CashContext cc = new CashContext(cs);
        show_sum.setText(String.valueOf(cc.getResult(money*quantity)));
    }

    public void PreviousPage(View view) {
        finish();
    }
}
