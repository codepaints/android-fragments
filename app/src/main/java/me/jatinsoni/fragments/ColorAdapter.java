package me.jatinsoni.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorViewHolder> {

    private List<Color> mColor;
    private Context mContext;

    public ColorAdapter(List<Color> mColor, Context mContext) {
        this.mColor = mColor;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

//        return new ColorViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.color_list_item, viewGroup, false));
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.color_list_item, viewGroup, false);
        return new ColorViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder colorViewHolder, @SuppressLint("RecyclerView") final int i) {

        colorViewHolder.setItemColorID(mColor.get(i).getmColor());
        colorViewHolder.setItemColorText(mColor.get(i).getmLabel());

        colorViewHolder.itemColorText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((MainActivity) mContext).onColorClicked(mColor.get(i));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mColor.size();
    }

}
