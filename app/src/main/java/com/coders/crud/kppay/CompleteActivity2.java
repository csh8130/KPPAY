package com.coders.crud.kppay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CompleteActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete2);
    }

    public void onConfirmBtnClick(View v){
        Intent i = new Intent(this, ConfirmActivity.class);
        startActivity(i);
    }

}
