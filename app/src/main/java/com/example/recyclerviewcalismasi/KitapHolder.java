package com.example.recyclerviewcalismasi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class KitapHolder extends RecyclerView.ViewHolder {

    /* satır layout'taki nesnelerin tanımlanması*/
    protected TextView tvKitapAdi, tvYazarAdi;
    protected ImageView imgKitap;

    public KitapHolder(@NonNull View itemView) {
        super(itemView);

        tvKitapAdi=itemView.findViewById(R.id.tvKitapAdi);
        tvYazarAdi=itemView.findViewById(R.id.tvYazarAdi);
        imgKitap=itemView.findViewById(R.id.imgKitap);

    }
}
