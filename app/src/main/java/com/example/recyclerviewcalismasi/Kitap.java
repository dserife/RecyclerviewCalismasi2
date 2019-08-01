package com.example.recyclerviewcalismasi;

public class Kitap {

    /* satir_layout dosyasındaki
    nesnelere eşdeğer değişkenler tanımlanır*/
    String kitapAdi;
    String kitapYazari;
    int kitapResim;

    public Kitap() {
    }
    /*boş ve dolu constructor tanımlanması.. */
    public Kitap(String kitapAdi, String kitapYazari, int kitapResim) {
        this.kitapAdi = kitapAdi;
        this.kitapYazari = kitapYazari;
        this.kitapResim = kitapResim;
    }

    /*get-set metotların tanımlanması*/
    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getKitapYazari() {
        return kitapYazari;
    }

    public void setKitapYazari(String kitapYazari) {
        this.kitapYazari = kitapYazari;
    }

    public int getKitapResim() {
        return kitapResim;
    }

    public void setKitapResim(int kitapResim) {
        this.kitapResim = kitapResim;
    }
}
