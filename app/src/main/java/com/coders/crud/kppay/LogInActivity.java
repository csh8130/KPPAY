package com.coders.crud.kppay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity {

    Button logInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        logInBtn = (Button)findViewById(R.id.button14);

    }

    public void onLogInBtClicked(View v){
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }
}
