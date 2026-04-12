package kategori;

public class Accessories extends Merchandise {
    private String jenis;

    public Accessories(int id, String nama, int harga, int stok, String jenis) {
        super(id, nama, harga, stok);
        this.jenis = jenis;
    }

    @Override
    public void tampilData() {
        System.out.println("=== ACCESSORIES ===");
        super.tampilData();
        System.out.println("Jenis  : " + jenis);
        System.out.println("-------------------");
    }
}
