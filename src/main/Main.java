package main;

import penjualan.*;
import toko.Toko;
import produk.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Membuat objek produk
        Produk produk1 = new Produk("Sabun Mandi", 5000);
        Produk produk2 = new Produk("Shampoo", 10000);
        Produk produk3 = new Produk("Pasta Gigi", 7000);

        // Membuat objek barang dalam penjualan
        Barang barang1 = new Barang(produk1, 5);
        Barang barang2 = new Barang(produk2, 4);
        Barang barang3 = new Barang(produk3, 2);

        // Membuat objek transaksi penjualan dan menambahkan barang
        TransaksiPenjualan transaksi1 = new TransaksiPenjualan();
        transaksi1.tambahBarang(barang1);
        transaksi1.tambahBarang(barang2);

        TransaksiPenjualan transaksi2 = new TransaksiPenjualan();
        transaksi2.tambahBarang(barang2);
        transaksi2.tambahBarang(barang3);

        TransaksiPenjualan transaksi3 = new TransaksiPenjualan();
        transaksi3.tambahBarang(barang1);
        transaksi3.tambahBarang(barang2);
        transaksi3.tambahBarang(barang3);

        // Membuat objek toko dan menambahkan transaksi
        Toko toko = new Toko("Minimarket");
        toko.tambahTransaksi(transaksi1);
        toko.tambahTransaksi(transaksi2);
        toko.tambahTransaksi(transaksi3);

        // Menyimpan laporan penjualan toko ke file output_10.txt
        PrintStream out = new PrintStream(new File("testcases/output_3.txt"));
        toko.tampilkanLaporan(out);
    }
}
