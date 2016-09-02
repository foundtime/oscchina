package com.iyoker.oscchinaclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<10;i++)
        {
            System.out.println(i);

        }
        test();
        System.out.println("end");
    }

    private void test() {
        int i;
        i=5;
        System.out.println(i);
        int j=10;
    }
}
