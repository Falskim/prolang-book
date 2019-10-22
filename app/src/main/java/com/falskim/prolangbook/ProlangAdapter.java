package com.falskim.prolangbook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ProlangAdapter extends RecyclerView.Adapter<ProlangAdapter.ListViewHolder> {
    private ArrayList<Prolang> listProlang;
    private OnItemClickCallback onItemClickCallback;

    ProlangAdapter(ArrayList<Prolang> list) {
        this.listProlang = list;
    }

    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_content, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Prolang prolang = listProlang.get(position);

        Glide.with(holder.itemView.getContext())
                .load(prolang.getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(prolang.getName());

        holder.btDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listProlang.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listProlang.size();
    }


    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        Button btDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.list_images);
            tvName = itemView.findViewById(R.id.list_name);
            btDetail = itemView.findViewById(R.id.list_button);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Prolang data);
    }
}