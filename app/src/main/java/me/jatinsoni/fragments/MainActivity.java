package me.jatinsoni.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ColorViewHolder.OnColorClickListener {

    LeftFragment leftFragment;
    RightFragment rightFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftFragment = LeftFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.left_container, leftFragment).commit();

        rightFragment = RightFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.right_container, rightFragment).commit();

    }


    @Override
    public void onColorClicked(Color color) {
        rightFragment.setColor(color);
    }
}