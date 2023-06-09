package penjualan;

import java.io.PrintStream;

public class TransaksiPenjualan extends Transaksi {

    @Override
    public void tampilkanTransaksi(PrintStream out) {
        out.println("Daftar Barang dalam Transaksi:");
        for (Barang barang : daftarBarang) {
            out.println("- " + barang.getProduk().getNama() + " (x" + barang.getJumlah() +
                    ", Rp " + barang.getTotalHarga() + ")");
        }
        out.println("Total Pendapatan: Rp " + getTotalPendapatan());
    }
}
