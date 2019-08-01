package com.example.recyclerviewcalismasi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class KitapAdapter extends RecyclerView.Adapter<KitapHolder> {

    Context context;
    //model sınıfının liste
    List<Kitap> kitapList = new ArrayList<>();

    public KitapAdapter(Context context, List<Kitap> kitapList) {
        this.context = context;
        this.kitapList = kitapList;
    }

    @NonNull
    @Override
    public KitapHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        /*Adapter sınıfının layout görünümüne bağlanması işlemini yürütür.*/
        View view=LayoutInflater.from(context).inflate(R.layout.satir_layout,null);
        KitapHolder kitapHolder = new KitapHolder(view);
        return kitapHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KitapHolder kitapHolder, int i) {
        /*
        Nesnelerin tanımlanması ViewHolder sınıfı içerisinde gerçekleşmişti.
        holder. diyerek, holder sınıfı içerisinde tanımlamış olduğumuz nesneleri
        değişken olarak çağırabiliyoruz.

        - Tanımlanmış nesnelerin doldurulma (gettext,settext,onclicklistener) işlemlerini
        sağlayan metot.
         */

        kitapHolder.tvKitapAdi.setText(kitapList.get(i).getKitapAdi());
        kitapHolder.tvYazarAdi.setText(kitapList.get(i).getKitapYazari());
        kitapHolder.imgKitap.setImageResource(kitapList.get(i).getKitapResim());
    }

    @Override
    public int getItemCount() {
        /*listenin eleman sayısını tutan metot*/
        return kitapList.size();
    }
}
