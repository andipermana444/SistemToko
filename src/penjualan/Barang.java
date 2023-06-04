package penjualan;

import produk.Produk;

public class Barang {
    private Produk produk;
    private int jumlah;

    public Barang(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public Produk getProduk() {
        return produk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getTotalHarga() {
        return produk.getHarga() * jumlah;
    }
}
