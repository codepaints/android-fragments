package me.jatinsoni.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ColorViewHolder.OnColorClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LeftFragment leftFragment = LeftFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.left_container, leftFragment).commit();

        RightFragment rightFragment = RightFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.right_container, rightFragment).commit();

    }

    @Override
    public void onColorClicked(int position) {

        Toast.makeText(this, "The clicked item no: " + position, Toast.LENGTH_SHORT).show();

    }
}