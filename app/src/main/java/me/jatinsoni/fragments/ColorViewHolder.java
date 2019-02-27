package me.jatinsoni.fragments;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ColorViewHolder extends RecyclerView.ViewHolder {

    public TextView itemColorText;

    public ColorViewHolder(@NonNull final View itemView) {
        super(itemView);

        this.itemColorText = itemView.findViewById(R.id.color_text);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Holder:", "Item clicked from Holder : " + getAdapterPosition());
            }
        });

    }

    public void setItemColorText(String label) {
        this.itemColorText.setText(label);
    }

    public void setItemColorID(int colorID) {
        this.itemColorText.setBackgroundColor(colorID);
    }

    public void setItemColorWithObject(Color color) {
        this.itemColorText.setBackgroundColor(color.getmColor());
    }

    public void setItemTextWithObject(Color label) {
        this.itemColorText.setText(label.getmLabel());
    }

    public interface OnColorClickListener {
        void onColorClicked(Color position);
    }
}
