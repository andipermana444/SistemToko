package penjualan;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class TransaksiPenjualan {
    private List<Barang> daftarBarang;

    public TransaksiPenjualan() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void hapusBarang(Barang barang) {
        daftarBarang.remove(barang);
    }

    public double getTotalPendapatan() {
        double total = 0;
        for (Barang barang : daftarBarang) {
            total += barang.getTotalHarga();
        }
        return total;
    }

    public void tampilkanTransaksi(PrintStream out) {
        out.println("Daftar Barang dalam Transaksi:");
        for (Barang barang : daftarBarang) {
            out.println("- " + barang.getProduk().getNama() + " (x" + barang.getJumlah() +
                    ", Rp " + barang.getTotalHarga() + ")");
        }
        out.println("Total Pendapatan: Rp " + getTotalPendapatan());
    }
}
