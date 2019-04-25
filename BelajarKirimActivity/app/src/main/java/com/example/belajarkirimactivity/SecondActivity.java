package com.example.belajarkirimactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        TextView tvData1 = (TextView) findViewById(R.id.tv_data1);
        TextView tvData2 = (TextView) findViewById(R.id.tv_data2);

        if(getIntent().getExtras() !=null) {

            Bundle bundle = getIntent().getExtras();
            tvData1.setText(bundle.getString("data1"));
            tvData2.setText(bundle.getString("data2"));
        }else {
            tvData1.setText(getIntent().getStringExtra("data1"));
            tvData2.setText(getIntent().getStringExtra("data2"));
        }
    }
}
