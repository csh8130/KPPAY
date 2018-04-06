package com.coders.crud.kppay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SellerMenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_menu);
    }

    public void onAddBtClicked(View v){
        startActivity(new Intent(SellerMenuActivity.this, AddItemActivity.class));
    }
    public void onSellerWalletBtClicked(View v){

    }
    public void onStatsBtClicked(View v){

    }
    public void onSettingBtClicked(View v){

    }

}
