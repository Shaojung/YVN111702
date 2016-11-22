package com.example.yvtc.yvn111702;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sp;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = (EditText) findViewById(R.id.editText);
        sp = getSharedPreferences("mydata", MODE_PRIVATE);
    }

    public void click1(View v)
    {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("name", ed.getText().toString());
        editor.commit();
    }
    public void click2(View v)
    {
        String str = sp.getString("name", "Test");
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
    public void clickSettings(View v)
    {
        Intent it = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(it);
    }

    public void clickReadName(View v)
    {
        SharedPreferences sp1 = getSharedPreferences(getPackageName() + "_preferences", MODE_PRIVATE);
        String str = sp1.getString("example_text", "Test");
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
}
