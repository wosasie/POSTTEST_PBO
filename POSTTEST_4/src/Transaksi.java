class Transaksi {
    private String namaBarang;
    private int jumlah;
    private int total;

    public Transaksi(String namaBarang, int jumlah, int total) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.total = total;
    }

    public int hitungTotal(int harga, int jumlah) {
        double pajak = 0.1;
        int subtotal = harga * jumlah;
        return (int) (subtotal + (subtotal * pajak));
    }

    public int hitungTotal(int harga, int jumlah, boolean member) {
        double pajak = 0.1;
        int subtotal = harga * jumlah;
        if (member) {
            subtotal = subtotal - 5000;
        }
        return (int) (subtotal + (subtotal * pajak));
    }

    public void tampilTransaksi() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Total Harga : " + total);
    }
}
