package com.example.dzemil.erbeinenevevije;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    ArrayList<String> hadiths;

    public MainAdapter(ArrayList<String> hadiths) {
        this.hadiths = hadiths;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder viewHolder, int i) {
        viewHolder.bosHadith.setText(hadiths.get(i));
    }

    @Override
    public int getItemCount() {
        return hadiths.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView bosHadith;

        public ViewHolder(View itemView) {
            super(itemView);

            bosHadith = itemView.findViewById(R.id.bos_hadith);
        }
    }
}
