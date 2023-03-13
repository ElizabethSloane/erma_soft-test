package com.example.ermasofttest;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    private List<Car> carList;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView manufacturerText;
        public TextView modelText;
        public TextView detailsText;
        public TextView priceText;



        public ViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            manufacturerText = itemView.findViewById(R.id.manufacturer_text_view);
            modelText = itemView.findViewById(R.id.model_text_view);
            detailsText = itemView.findViewById(R.id.details_text_view);
            priceText = itemView.findViewById(R.id.price_text_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public CarAdapter (List<Car> carList) {
        this.carList = carList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v, listener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Car car = carList.get(position);
        holder.manufacturerText.setText(car.getManufacturer().getName().toString());
        holder.modelText.setText(car.getModel().getName());
        holder.detailsText.setText(car.getStringDetails().toString());
        holder.priceText.setText(String.valueOf(car.getPrice()));

    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}
