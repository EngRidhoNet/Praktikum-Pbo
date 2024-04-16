public class ZakatPertanian extends Zakat {
    public ZakatPertanian(double panen){
        super(0, panen);
    }

    @Override
    public void hitungZakatPertanian() {
        super.hitungZakatPertanian();
        System.out.println("Zakat Pertanian: Kg" + getZakatPertanian());
    }
    
}
