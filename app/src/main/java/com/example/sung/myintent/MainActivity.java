package com.example.sung.myintent;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final int ACTIVITY_MENU = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {
//        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-0000-0000"));
//        startActivity(intent);

//        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
//        startActivityForResult(intent, ACTIVITY_MENU);

        Intent intent = new Intent();
        ComponentName name = new ComponentName("com.example.sung.myintent",
                                                "com.example.sung.myintent.MenuActivity");
        intent.setComponent(name);
        intent.putExtra("title", "소녀시대");
        intent.putExtra("age", 20);

        Person person01 = new Person(" 걸스데이", 21);
        intent.putExtra("person", person01);

        startActivityForResult(intent, ACTIVITY_MENU);
    }
}
