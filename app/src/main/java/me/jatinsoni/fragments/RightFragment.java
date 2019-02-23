package me.jatinsoni.fragments;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {

    ColorAdapter     colorAdapter;
    ArrayList<Color> color;

    public RightFragment() {
        // Required empty public constructor
    }

    public static RightFragment newInstance() {
        return new RightFragment();
    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_right, container, false);

        final ConstraintLayout constraintLayout = view.findViewById(R.id.right_color_block);
        final TextView         textView         = view.findViewById(R.id.right_color_text);

        colorAdapter.SetItemClickListener(new ColorAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                constraintLayout.setBackgroundColor(color.get(position).getmColor());
                textView.setText(color.get(position).getmLabel());
            }
        });

        return view;
    }

}
