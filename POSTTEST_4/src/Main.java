import kategori.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Merchandise> data = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Transaksi");
            System.out.println("6. Exit");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) tambahData();
            else if (pilihan == 2) lihatData();
            else if (pilihan == 3) updateData();
            else if (pilihan == 4) hapusData();
            else if (pilihan == 5) transaksi();

        } while (pilihan != 6);
    }

    static void tambahData() {

        System.out.println("Kategori:");
        System.out.println("1. T-Shirt");
        System.out.println("2. Outerwear");
        System.out.println("3. Headwear");
        System.out.println("4. Accessories");
        System.out.print("Pilihan Kategori: ");
        int kategori = input.nextInt();
        input.nextLine();

        System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();

        System.out.print("Stok: ");
        int stok = input.nextInt();
        input.nextLine();


        if (kategori == 1) {
            System.out.print("Ukuran: ");
            String ukuran = input.nextLine();
            data.add(new TShirt(id, nama, harga, stok, ukuran));

        } else if (kategori == 2) {
            System.out.print("Ukuran: ");
            String ukuran = input.nextLine();
            System.out.print("Tipe (Padding/Hoodie/Jacket): ");
            String tipe = input.nextLine();
            data.add(new Outerwear(id, nama, harga, stok, ukuran, tipe));

        } else if (kategori == 3) {
            System.out.print("Jenis (Cap/Beanie): ");
            String j = input.nextLine();
            data.add(new Headwear(id, nama, harga, stok, j));

        } else if (kategori == 4) {
            System.out.print("Jenis (Keychain/Poster/Kacamata/dll): ");
            String j = input.nextLine();
            data.add(new Accessories(id, nama, harga, stok, j));
        }
    }

    static void lihatData() {
        if (data.size() == 0) {
            System.out.println("Data kosong");
        } else {
            for (int i = 0; i < data.size(); i++) {
                data.get(i).tampilData();
            }
        }
    }

    static void updateData() {
        System.out.print("ID yang diupdate: ");
        int id = input.nextInt();

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {

                input.nextLine();
                System.out.print("Nama baru: ");
                data.get(i).setNama(input.nextLine());

                System.out.print("Harga baru: ");
                data.get(i).setHarga(input.nextInt());

                System.out.print("Stok baru: ");
                data.get(i).setStok(input.nextInt());

                System.out.println("Data berhasil diupdate");
                break;
            }
        }
    }

    static void hapusData() {
        System.out.print("ID yang dihapus: ");
        int id = input.nextInt();

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {
                data.remove(i);
                System.out.println("Data berhasil dihapus");
                break;
            }
        }
    }

    static void transaksi() {
        System.out.print("ID barang: ");
        int id = input.nextInt();

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {
                System.out.print("Jumlah beli: ");
                int jumlah = input.nextInt();
                if (jumlah <= data.get(i).getStok()) {
                    Transaksi t = new Transaksi(data.get(i).getNama(), jumlah, 0);
                    System.out.print("Apakah anda merupakan member?? (y/n): ");
                    input.nextLine();
                    String pilih = input.nextLine();

                    int total;
                    if (pilih.equalsIgnoreCase("y")) {
                        total = t.hitungTotal(data.get(i).getHarga(), jumlah, true);
                    } else {
                        total = t.hitungTotal(data.get(i).getHarga(), jumlah);
                    }
                    data.get(i).setStok((data.get(i).getStok() - jumlah));

                    Transaksi trx = new Transaksi(data.get(i).getNama(), jumlah, total);
                    trx.tampilTransaksi();
                } else {
                    System.out.println("Stok tidak cukupp !!");
                }
                break;
            }
        }
    }
}
