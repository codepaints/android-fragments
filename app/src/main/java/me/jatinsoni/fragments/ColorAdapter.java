package me.jatinsoni.fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {

    private List<Color>         mColor;
    private Context             mContext;
    private OnItemClickListener mOnItemClickListener;

    public ColorAdapter(List<Color> mColor, Context mContext) {
        this.mColor = mColor;
        this.mContext = mContext;
    }

    public void SetItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.color_list_item, viewGroup, false);
        return new ColorViewHolder(view, mOnItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull final ColorViewHolder colorViewHolder, final int i) {

        final Color color = mColor.get(i);

        colorViewHolder.itemColorText.setText(color.getmLabel());
        colorViewHolder.itemColorText.setBackgroundColor(color.getmColor());

        colorViewHolder.itemColorText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Item clicked: " + i, Toast.LENGTH_SHORT).show();
//                colorViewHolder.feedbackBlock.setBackgroundColor(color.getmColor());
                colorViewHolder.feedbackText.setText(color.getmLabel());
            }
        });

    }

    @Override
    public int getItemCount() {
        return mColor.size();
    }

    public interface OnItemClickListener {
        void OnItemClick(int position);
    }

    class ColorViewHolder extends RecyclerView.ViewHolder {

        public ConstraintLayout itemColorBlock;
        public TextView         itemColorText;
        public ConstraintLayout feedbackBlock;
        public TextView         feedbackText;

        public ColorViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);

            itemColorBlock = itemView.findViewById(R.id.color_block);
            itemColorText = itemView.findViewById(R.id.color_text);
            feedbackBlock = itemView.findViewById(R.id.right_color_block);
            feedbackText = itemView.findViewById(R.id.right_color_text);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        int position = getAdapterPosition();

                        if (position != RecyclerView.NO_POSITION) {
                            listener.OnItemClick(position);
                        }
                    }
                }
            });

        }
    }

}
