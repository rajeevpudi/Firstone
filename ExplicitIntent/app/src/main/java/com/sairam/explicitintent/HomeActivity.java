package com.sairam.explicitintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView tvname, tvsalary;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //append xml
        setContentView(R.layout.activity_home);

        tvname = findViewById(R.id.tv_name);
//        String recName = getIntent().getExtras().getString("name");
//        tvname.setText(recName);
        tvname.setText(getIntent().getExtras().getString("name"));

        tvsalary = findViewById(R.id.tv_salary);
//        String recsalary = getIntent().getExtras().getString("salary");
//        tvsalary.setText(recsalary);
        tvsalary.setText(getIntent().getExtras().getString("salary"));
    }
}
