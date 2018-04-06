package com.coders.crud.kppay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QRcodeResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode_result);


    }

    public void onCartQRBtnClick(View v){
        Intent i1 = new Intent(this, CartActivity.class);
        startActivity(i1);
    }

    public void onPaymentQRBtnClick(View v){
        Intent i2 = new Intent(this, CompleteActivity.class);
        startActivity(i2);
    }
}
