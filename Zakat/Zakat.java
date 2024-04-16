public class Zakat {
    private double penghasilan;
    private double panen;
    private double zakatPenghasilan;
    private double zakatPertanian;

    public Zakat(double penghasilan, double panen) {
        this.penghasilan = penghasilan;
        this.panen = panen;
    }
    

    public void hitungZakatPenghasilan() {
        double nisabZakatPenghasilan = 81945667;
        if (penghasilan >= nisabZakatPenghasilan) {
            zakatPenghasilan = 0.025 * penghasilan;
        } else {
            zakatPenghasilan = 0;
        }
    }

    public void hitungZakatPertanian() {
        double nisabZakatPertanian = 750;
        if (panen >= nisabZakatPertanian) {
            zakatPertanian = 0.05 * panen;
        } else {
            zakatPertanian = 0;
        }
    }

    public double getZakatPenghasilan() {
        return zakatPenghasilan;
    }

    public double getZakatPertanian() {
        return zakatPertanian;
    }

    
}