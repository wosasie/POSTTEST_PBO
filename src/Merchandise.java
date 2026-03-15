class merchandise {
    private int id;
    private String nama;
    private int harga;
    private int stok;

    public merchandise(int id, String nama, int harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int getIdMerch() {
        return id;
    }

    public String getNamaMerch() {
        return nama;
    }

    public int getHargaMerch() {
        return harga;
    }

    public int getStokMerch() {
        return stok;
    }

    public void setNamaMerch(String nama) {
        if (nama.isEmpty()) {
            System.out.println("Beeep ! Nama merchandise tidak boleh kosong !");
        } else {
            this.nama = nama;
        }
    }

    public void setHargaMerch(int harga) {
        if (harga < 0) {
            System.out.println("Beeep ! Harga merchandise tidak boleh minus !");
        } else {
            this.harga = harga;
        }
    }

    public void setStokMerch(int stok) {
        if (stok < 0) {
            System.out.println("Beeep ! Stok merchandise tidak boleh minus !");
        } else {
            this.stok = stok;
        }
    }

    public void tampilData() {
        System.out.println("ID   : " + id);
        System.out.println("Nama  : " + nama);
        System.out.println("Harga  : " + harga);
        System.out.println("Stok  : " + stok);
    }
}

