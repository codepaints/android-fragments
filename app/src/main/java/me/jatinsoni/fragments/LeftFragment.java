package me.jatinsoni.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment {

    public LeftFragment() {
        // Required empty public constructor
    }

    public static LeftFragment newInstance() {
        return new LeftFragment();
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        mOnColorChooseListener = (OnColorChooseListener) context;
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_left, container, false);

        //    private OnColorChooseListener mOnColorChooseListener;
        ArrayList<Color> mColor = new ArrayList<>();

        mColor.add(new Color(getResources().getColor(R.color.colorRed), getResources().getString(R.string.red)));
        mColor.add(new Color(getResources().getColor(R.color.colorOrange), getResources().getString(R.string.orange)));
        mColor.add(new Color(getResources().getColor(R.color.colorYellow), getResources().getString(R.string.yellow)));
        mColor.add(new Color(getResources().getColor(R.color.colorLime), getResources().getString(R.string.lime)));
        mColor.add(new Color(getResources().getColor(R.color.colorGreen), getResources().getString(R.string.green)));
        mColor.add(new Color(getResources().getColor(R.color.colorCyan), getResources().getString(R.string.cyan)));
        mColor.add(new Color(getResources().getColor(R.color.colorBlue), getResources().getString(R.string.blue)));
        mColor.add(new Color(getResources().getColor(R.color.colorIndigo), getResources().getString(R.string.indigo)));
        mColor.add(new Color(getResources().getColor(R.color.colorViolet), getResources().getString(R.string.violet)));

        RecyclerView mRecyclerView = view.findViewById(R.id.color_list_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView.Adapter mAdapter = new ColorAdapter(mColor, getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

//    public interface OnColorChooseListener {
//        void onColorChoosen(int color);
//    }

}
