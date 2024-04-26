package com.example.medocpro2app.activity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medocpro2app.R;

import java.util.ArrayList;

public class RecycleItemAdapter extends RecyclerView.Adapter<RecycleItemAdapter.ViewHolder> {
    Context context;
    ArrayList<CartModel> arrItems;
//    private OnNoteListener onNoteListener;
    public RecycleItemAdapter(Context context, ArrayList<CartModel> arrItems){
        this.context = context;
        this.arrItems = arrItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view =  LayoutInflater.from(context).inflate(R.layout.item_cart,parent,false);
       ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.productImg.setImageResource(arrItems.get(position).productImg);
        holder.title.setText(arrItems.get(position).title);
        holder.price.setText(arrItems.get(position).price);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext = new Intent(v.getContext(), ProductDetail.class);
                context.startActivity(iNext);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title,price;
        ImageView productImg;
//        OnNoteListener onNoteListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.productTitle);
            price = itemView.findViewById(R.id.price);
            productImg = itemView.findViewById(R.id.productImage);
        }

//        @Override
//        public void onClick(View v) {
//            this.onNoteListener.onNoteClick(getAdapterPosition());
//        }
    }

//    public interface OnNoteListener{
//        void onNoteClick(int position);
//    }
}


