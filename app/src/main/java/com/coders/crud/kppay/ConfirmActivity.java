package com.coders.crud.kppay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
    }

    public void onOKBtnClick(View v){
        Toast.makeText(this,"수치확인이 완료되었습니다.", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, MainMenuActivity.class);
        startActivity(i);
    }
}
