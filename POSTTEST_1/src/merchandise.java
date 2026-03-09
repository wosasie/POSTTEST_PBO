class merchandise {
    int id;
    String nama;
    int harga;
    int stok;

    merchandise(int id, String nama, int harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void tampilData() {
        System.out.println("ID   : " + id);
        System.out.println("Nama  : " + nama);
        System.out.println("Harga  : " + harga);
        System.out.println("Stok  : " + stok);
    }
}
