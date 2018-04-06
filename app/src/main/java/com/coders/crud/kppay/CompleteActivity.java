package com.coders.crud.kppay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);
    }

    public void onConfirmBtnClick(View v){
        Intent i = new Intent(this, ConfirmActivity.class);
        startActivity(i);
    }

}
