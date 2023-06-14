package toko;

import penjualan.Transaksi;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Toko implements Laporan {
    private String nama;
    private List<Transaksi> daftarTransaksi;

    public Toko(String nama) {
        this.nama = nama;
        daftarTransaksi = new ArrayList<>();
    }

    public void tambahTransaksi(Transaksi transaksi) {
        daftarTransaksi.add(transaksi);
    }

    public void hapusTransaksi(Transaksi transaksi) {
        daftarTransaksi.remove(transaksi);
    }

    public double getTotalPendapatan() {
        double total = 0;
        for (Transaksi transaksi : daftarTransaksi) {
            total += transaksi.getTotalPendapatan();
        }
        return total;
    }

    @Override
    public void tampilkanLaporan(PrintStream out) {
        out.println("Laporan Penjualan di Toko " + nama + ":");
        for (Transaksi transaksi : daftarTransaksi) {
            transaksi.tampilkanTransaksi(out);
            out.println("-----------------------");
        }
        out.println("Total Pendapatan Toko: Rp " + getTotalPendapatan());
    }
}
