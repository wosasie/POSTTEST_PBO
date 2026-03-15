import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<merchandise> data = new ArrayList<>();
    static ArrayList<transaksi> dataTransaksi = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static void tambahData() {
        System.out.print("ID  : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Nama  : ");
        String nama = input.nextLine();

        System.out.print("Harga  : ");
        int harga = input.nextInt();

        System.out.print("Stok  : ");
        int stok = input.nextInt();

        merchandise m = new merchandise(id, nama, harga, stok);
        data.add(m);

        System.out.println("Data berhasil ditambahkan");
    }

    static void lihatData() {
        if (data.isEmpty()) {
            System.out.println("yah yah data kosong");
        } else {
            for (merchandise m : data) {
                m.tampilData();
            }
        }
    }

    static void updateData() {
        System.out.print("Masukan ID  : ");
        int id = input.nextInt();

        for (merchandise m : data) {
            if (m.getIdMerch() == id) {
                input.nextLine();

                System.out.print("Nama baru  : ");
                m.setNamaMerch(input.nextLine());

                System.out.print("Harga baru  : ");
                m.setHargaMerch(input.nextInt());

                System.out.print("Stok baru  : ");
                m.setStokMerch(input.nextInt());

                System.out.println("Data berhasil diupdate ! Yay !");
                return;
            }
        }
        System.out.println("Data tidak ditemukan T_T");
    }

    static void hapusData() {
        System.out.print("Masukan ID: ");
        int id = input.nextInt();

        for (merchandise m : data) {
            if (m.getIdMerch() == id) {
                data.remove(m);
                System.out.println("Data berhasil dihapus ! Yay !");
                return;
            }
        }
        System.out.println("Data tidak ditemukan T_T");
    }

    static void transaksi() {
        System.out.print("Masukan ID merchandise : ");
        int id = input.nextInt();

        System.out.print("Jumlah beli : ");
        int jumlah = input.nextInt();

        for (merchandise m : data) {
            if (m.getIdMerch() == id) {
                if (jumlah > m.getStokMerch()) {
                    System.out.println("Stok tidak cukup T_T");
                    return;
                }

                int total = jumlah * m.getHargaMerch();
                m.setStokMerch(m.getStokMerch() - jumlah);

                transaksi t = new transaksi(m.getNamaMerch(), jumlah, total);
                dataTransaksi.add(t);

                System.out.println("Transaksi berhasil ! Yay !");
                return;
            }
        }
    }

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("======  Sistem Penjualan Merchandise Mclaren  ======");
            System.out.println("1. Tambah Data Merchandise");
            System.out.println("2. Lihat Data Merchandise");
            System.out.println("3. Update Data Merchandise");
            System.out.println("4. Hapus Data Merchandise");
            System.out.println("5. Transaksi Merchandise");
            System.out.println("6. Exit");
            System.out.println("Pilih menu : ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;

                case 2:
                    lihatData();
                    break;

                case 3:
                    updateData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    transaksi();
                    break;

                case 6:
                    System.out.println("Selesaiii !");
                    break;

                default:
                    System.out.println("Menu tidak tersediaa T_T");
            }
        } while (pilihan !=6);
    }
}

