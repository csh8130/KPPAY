package com.coders.crud.kppay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainMenuActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void onWalletBtClicked(View v){
        Intent intent = new Intent(MainMenuActivity2.this, BalanceCustomerActivity.class);
        startActivity(intent);

    }
    public void onSearchBtClicked(View v){
        Intent intent = new Intent(MainMenuActivity2.this, CustomerSearchActivity.class);
        startActivity(intent);

    }
    public void onCartBtClicked(View v){

        Intent intent = new Intent(MainMenuActivity2.this, CartActivity.class);
        startActivity(intent);
    }
    public void onScanBtClicked(View v){
        new IntentIntegrator(this).initiateScan();

    }
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        //  com.google.zxing.integration.android.IntentIntegrator.REQUEST_CODE
        //  = 0x0000c0de; // Only use bottom 16 bits
        if (requestCode == IntentIntegrator.REQUEST_CODE) {
            IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
            if (result == null) {
                // 취소됨
                //Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            } else {
                // 스캔된 QRCode --> result.getContents()
                //Toast.makeText(this, "Scanned: " + result.getContents(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, QRcodeResultActivity.class);
                startActivity(intent);
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

}
