package com.example.yvtc.yvn111702;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = getSharedPreferences("mydata", MODE_PRIVATE);
    }

    public void click1(View v)
    {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("name", "Teacher");
        editor.commit();
    }
    public void click2(View v)
    {
        String str = sp.getString("name", "Test");
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
}
