package com.example.admin.trainningandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 09/01/2018.
 */

public class RecyAdapter extends RecyclerView.Adapter<RecyAdapter.RecyclerViewHolder>{

    private List<bean_Recy> data = new ArrayList<>();
    private Context context;

    public RecyAdapter(List<bean_Recy> data) {
        this.data = data;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_item_recy, parent, false);
        context = parent.getContext();
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.txtUserName.setText(data.get(position).getTieuDe());
        Picasso.with(context).load(data.get(position).getUrlHinhAnh()).into( holder.imageView);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtUserName;
        ImageView imageView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            txtUserName = (TextView) itemView.findViewById(R.id.txtItemRecy);
            imageView =(ImageView) itemView.findViewById(R.id.itemImage);
        }
    }
}