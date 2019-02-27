package me.jatinsoni.fragments;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {

    TextView rightColorLabel;
    ConstraintLayout rightBackgroundColor;

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
        View rootView = inflater.inflate(R.layout.fragment_right, container, false);
        rightColorLabel = rootView.findViewById(R.id.right_color_text);
        rightBackgroundColor = rootView.findViewById(R.id.right_color_block);

        return rootView;

    }

    public void setColor(Color color) {
        rightColorLabel.setText(color.getmLabel());
        rightBackgroundColor.setBackgroundColor(color.getmColor());
    }

}
