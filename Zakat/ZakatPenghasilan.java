public class ZakatPenghasilan extends Zakat{
    public ZakatPenghasilan(double penghasilan) {
        super(penghasilan, 0);
    }
    @Override
    public void hitungZakatPenghasilan() {
        super.hitungZakatPenghasilan();
        System.out.println("Zakat Penghasilan: Rp" + getZakatPenghasilan());
    }
}
