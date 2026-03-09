class transaksi {
    String namaMerchandise;
    int jumlah;
    int totalHarga;

    transaksi(String namaMerchandise, int jumlah, int totalHarga) {
        this.namaMerchandise = namaMerchandise;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
    }

    void tampilTransaksi() {
        System.out.println("Merchandise   : " + namaMerchandise);
        System.out.println("Jumlah  : " + jumlah);
        System.out.println("Total Harga  : " + totalHarga);
    }
}
