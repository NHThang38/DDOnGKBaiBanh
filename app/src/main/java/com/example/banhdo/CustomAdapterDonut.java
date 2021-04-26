package com.example.banhdo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapterDonut extends RecyclerView.Adapter<CustomAdapterDonut.ViewHolder> {
        ArrayList<Donut> mDonuts;
        OnclickListener listener;

    public CustomAdapterDonut(ArrayList<Donut> mDonuts, OnclickListener listener) {
        this.mDonuts = mDonuts;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CustomAdapterDonut.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_donut, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public int getItemCount() {
        return mDonuts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //Tạo đôi tượng Donut mdount để xl click
        Donut mDonut;

        ImageView imgDonut;
        TextView tvName, tvDes, tvPrice;
        ImageButton imgbtn_plus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //ánh xạ
            imgDonut = itemView.findViewById(R.id.imgDonut);
            tvName = itemView.findViewById(R.id.tvName);
            tvDes = itemView.findViewById(R.id.tvDes);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            imgbtn_plus = itemView.findViewById(R.id.imgbtn_plus);

            //bắt sự kiện click
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.itemClick(mDonut);
                }
            });

        }
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapterDonut.ViewHolder holder, int position) {

        Donut donut = mDonuts.get(position);
        //tạo cái ... cho sự kiện click
        holder.mDonut = donut;
        //
        holder.imgDonut.setImageResource(donut.getAnh());
        holder.tvName.setText(donut.getName());
        holder.tvDes.setText(donut.getDes());
        holder.tvPrice.setText(donut.getPrice() + ""); //Chỗ hay sai
//        holder.tvPrice.setText(String.valueOf(donut.getPrice())); //Chỗ hay sai
    }
}
