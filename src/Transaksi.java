class transaksi {
    private String namaMerchandise;
    private int jumlah;
    private int totalHarga;

    public transaksi(String namaMerchandise, int jumlah, int totalHarga) {
        this.namaMerchandise = namaMerchandise;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
    }

    public String getNamaMerchandise() {
        return namaMerchandise;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

   public void tampilTransaksi() {
        System.out.println("Merchandise   : " + namaMerchandise);
        System.out.println("Jumlah  : " + jumlah);
        System.out.println("Total Harga  : " + totalHarga);
    }
}

