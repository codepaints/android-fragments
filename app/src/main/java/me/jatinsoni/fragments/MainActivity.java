package me.jatinsoni.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LeftFragment leftFragment = LeftFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.left_container, leftFragment).commit();

        RightFragment rightFragment = RightFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.right_container, rightFragment).commit();

    }

}
