package com.example.ca_appbarexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // TODO: set up toolbar

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.NAME);

        TextView name_output = findViewById(R.id.name_output);
        name_output.setText(name);

        initOnclickListener();
    }

    void initOnclickListener() {
        Button button = findViewById(R.id.back_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
