package com.example.ca_appbarexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NAME = "com.example.CA_AppbarExample.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: set up toolbar

        initOnclickListener();
    }

    void initOnclickListener() {
        Button button = findViewById(R.id.next_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                EditText name_input = findViewById(R.id.name_input);
                String name = name_input.getText().toString();
                intent.putExtra(NAME, name);

                startActivity(intent);
            }
        });
    }
}
