package com.cardisty.catalog;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import com.cardisty.catalog.placeholder.Content.Item;
import com.cardisty.catalog.databinding.FragmentHomeListBinding;

import java.util.List;

public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<Item> mValues;

    public MyItemRecyclerViewAdapter(List<Item> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentHomeListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.videoURI.setVideoPath("http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4");
        holder.videoURI.start();
        holder.mContentView.setText(mValues.get(position).content);
        holder.mDetails.setText(mValues.get(position).details);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final VideoView videoURI;
        public final TextView mContentView;
        public final TextView mDetails;
        public Item mItem;

        public ViewHolder(FragmentHomeListBinding binding) {
            super(binding.getRoot());
            videoURI = binding.videoView;
            mContentView = binding.content;
            mDetails = binding.details;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}