package penjualan;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public abstract class Transaksi {
    protected List<Barang> daftarBarang;

    public Transaksi() {
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

    public abstract void tampilkanTransaksi(PrintStream out);
}
