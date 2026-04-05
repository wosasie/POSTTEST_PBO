class Outerwear extends Merchandise {
    private String ukuran;
    private String tipe;

    public Outerwear(int id, String nama, int harga, int stok, String ukuran, String tipe) {
        super(id, nama, harga, stok);
        this.ukuran = ukuran;
        this.tipe = tipe;
    }

    public void tampilData() {
        System.out.println("=== OUTERWEAR ===");
        super.tampilData();
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Tipe   : " + tipe);
        System.out.println("-------------------");
    }
}
