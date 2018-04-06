package com.coders.crud.kppay;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BalanceCustomerActivity extends AppCompatActivity implements View.OnClickListener{

    Button searchButton;
    EditText searchText;
    TextView totalBalance;
    Button backArrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_customer);

        searchButton = (Button)findViewById(R.id.button11);
        searchText = (EditText)findViewById(R.id.textView7);
        totalBalance = (TextView)findViewById(R.id.textView8);
        backArrow = (Button)findViewById(R.id.button12);

        backArrow.setOnClickListener(this);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.button12:
                Intent intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);
                break;
        }
    }


}
