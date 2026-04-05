class Transaksi {
    private String namaBarang;
    private int jumlah;
    private int total;

    public Transaksi(String namaBarang, int jumlah, int total) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.total = total;
    }

    public void tampilTransaksi() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Total Harga : " + total);
    }
}

