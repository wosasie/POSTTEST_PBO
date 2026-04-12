package kategori;

public class TShirt extends Merchandise {
    private String ukuran;

    public TShirt(int id, String nama, int harga, int stok, String ukuran) {
        super(id, nama, harga, stok);
        this.ukuran = ukuran;
    }

    @Override
    public void tampilData() {
        System.out.println("=== TSHIRT ===");
        super.tampilData();
        System.out.println("Ukuran : " + ukuran);
        System.out.println("-------------------");
    }
}
