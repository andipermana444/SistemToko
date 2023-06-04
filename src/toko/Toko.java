package toko;

import penjualan.TransaksiPenjualan;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Toko {
    private String nama;
    private List<TransaksiPenjualan> daftarTransaksi;

    public Toko(String nama) {
        this.nama = nama;
        daftarTransaksi = new ArrayList<>();
    }

    public void tambahTransaksi(TransaksiPenjualan transaksi) {
        daftarTransaksi.add(transaksi);
    }

    public void hapusTransaksi(TransaksiPenjualan transaksi) {
        daftarTransaksi.remove(transaksi);
    }

    public double getTotalPendapatan() {
        double total = 0;
        for (TransaksiPenjualan transaksi : daftarTransaksi) {
            total += transaksi.getTotalPendapatan();
        }
        return total;
    }

    public void tampilkanLaporan(PrintStream out) {
        out.println("Laporan Penjualan di Toko " + nama + ":");
        for (TransaksiPenjualan transaksi : daftarTransaksi) {
            transaksi.tampilkanTransaksi(out);
            out.println("-----------------------");
        }
        out.println("Total Pendapatan Toko: Rp " + getTotalPendapatan());
    }
    
}
