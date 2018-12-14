package com.example.liat.chatapplication;
import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent(this,seccondActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onStart()
    {
        super.onStart();

    }
}
