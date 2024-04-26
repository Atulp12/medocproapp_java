package com.example.medocpro2app.adapter;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.faithosys.faithosysoutlet.R;
import com.faithosys.faithosysoutlet.model.ListModel;

import java.util.List;


public class AllPaymentListAdapter extends RecyclerView.Adapter<AllPaymentListAdapter.MyViewHolder> {
    Context context;
    private List<ListModel> getDetails;
    OnItemClickListener listener;
    String demo;

    public AllPaymentListAdapter(Context context, List<ListModel> getDetails, OnItemClickListener listener) {
        this.context = context;
        this.getDetails = getDetails;
        this.listener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_req_payment, parent, false);
        return new MyViewHolder(view);
    }


    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final ListModel getData = getDetails.get(position);

        holder.tvName.setText(getData.getOutlet_name());
        holder.tvBillNo.setText(getData.getVoucher_no());
        holder.tvDate.setText(getData.getPayment_date());
        holder.tvTotAmt.setText(getData.getTotal_amount());
        holder.tvPayStatus.setText(getData.getPaid_amount());
        holder.tvStatus.setText(getData.getBalance_amount());
        //holder.tvTotAmt.setText(getData.getMobile());

        holder.bind(getData, listener, String.valueOf(position));

      /*  if (position % 2 == 1) {
            holder.viewOne.setVisibility(View.VISIBLE);
            holder.viewTwo.setVisibility(View.GONE);
            //  holder.imageView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        } else {
            holder.viewOne.setVisibility(View.GONE);
            holder.viewTwo.setVisibility(View.VISIBLE);
        }*/
    }


    @Override
    public int getItemCount() {
        if (getDetails == null) {
            return 0;
        } else {
            return getDetails.size();
        }
    }


    public interface OnItemClickListener {
        void onItemClick(ListModel getData, TextView textViewName, String pos);

        void onViewButtonClick(ListModel getData, ImageButton imageButton, String pos);
        void onEditButtonClick(ListModel getData, ImageButton imageButton, String pos);

        void onDeleteButtonClick(ListModel getData, ImageButton imageButton, String pos);


    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName, tvBillNo, tvTotAmt, tvDate, tvStatus, tvPayStatus;
        CardView cardView;
        ImageButton btnView, btnEdit, btnDelete;
        Button btnStatus, btnBill;
        CheckBox ckApprove;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.name);
            tvBillNo = itemView.findViewById(R.id.no);
            tvTotAmt = itemView.findViewById(R.id.amt);
            tvDate = itemView.findViewById(R.id.date);
            tvStatus = itemView.findViewById(R.id.balAmt);
            tvPayStatus = itemView.findViewById(R.id.paidAmt);
            cardView = itemView.findViewById(R.id.cardView);
            btnDelete = itemView.findViewById(R.id.delete);
            btnView = itemView.findViewById(R.id.view);
            btnEdit = itemView.findViewById(R.id.edit);


            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
            }
        }

        public void bind(final ListModel getData, final OnItemClickListener listener, final String s) {
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(getData, tvName, s);
                }
            });
            btnView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onViewButtonClick(getData, btnView, s);
                }
            });

            btnEdit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onEditButtonClick(getData, btnEdit, s);
                }
            });

            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onDeleteButtonClick(getData, btnDelete, s);
                }
            });

            /*btnBill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onUpdateBillClick(getData, btnBill, s);
                }
            });

            ckApprove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onApproveClick(getData, ckApprove, s);
                }
            });
*/
        }

    }


}