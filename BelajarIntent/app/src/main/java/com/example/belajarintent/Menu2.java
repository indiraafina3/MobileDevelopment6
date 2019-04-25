package com.example.belajarintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
    }
    public  void menu2 (View view) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
