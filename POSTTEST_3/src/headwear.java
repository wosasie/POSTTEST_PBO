class Headwear extends Merchandise {
    private String jenis;

    public Headwear(int id, String nama, int harga, int stok, String jenis) {
        super(id, nama, harga, stok);
        this.jenis = jenis;
    }

    public void tampilData() {
        System.out.println("=== HEADWEAR ===");
        super.tampilData();
        System.out.println("Jenis  : " + jenis);
        System.out.println("-------------------");
    }
}
