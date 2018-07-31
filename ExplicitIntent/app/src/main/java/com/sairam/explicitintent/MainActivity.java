package com.sairam.explicitintent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context = MainActivity.this;

    private EditText etname, etsalary;

    private Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.et_name);

        etsalary = findViewById(R.id.et_salary);

        btNext = findViewById(R.id.bt_next);
        btNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(etname.getText().length() == 0){
            showToast("Enter name..?");
            return;
        }

        if(etsalary.getText().length() == 0){
            showToast("Enter Salary..?");
            return;
        }

        Intent intent = new Intent(context, HomeActivity.class);
        intent.putExtra("name",etname.getText().toString());
        intent.putExtra("salary", etsalary.getText().toString());
        startActivity(intent);
    }

    private void showToast(String message){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();
    }
}
