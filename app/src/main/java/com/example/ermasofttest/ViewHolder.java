//package com.example.ermasofttest;
//
//import android.view.TextureView;
//import android.view.View;
//import android.widget.AdapterView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//public class ViewHolder extends RecyclerView.ViewHolder {
//    public TextureView manufacturerText;
//    public TextureView modelText;
//    public TextureView detailsText;
//    public TextureView priceText;
//
//
//    public ViewHolder(@NonNull View itemView, final AdapterView.OnItemClickListener listener) {
//        super(itemView);
//        manufacturerText = itemView.findViewById(R.id.manufacturer_text_view);
//        modelText = itemView.findViewById(R.id.model_text_view);
//        detailsText = itemView.findViewById(R.id.details_text_view);
//        priceText = itemView.findViewById(R.id.price_text_view);
//
//        itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (listener != null) {
//                    int position = getAdapterPosition();
//                    if (position != RecyclerView.NO_POSITION) {
//                        listener.onItemClick(position);
//                    }
//                }
//            }
//        });
//    }
//}
