
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan penghasilan Anda (dalam Rp): ");
        double penghasilan = scanner.nextDouble();
        System.out.print("Masukkan hasil panen Anda (dalam Kg): ");
        double panen = scanner.nextDouble();
        ZakatPenghasilan zakatPenghasilan = new ZakatPenghasilan(penghasilan);
        zakatPenghasilan.hitungZakatPenghasilan();
        ZakatPertanian zakatPertanian = new ZakatPertanian(panen);
        zakatPertanian.hitungZakatPertanian();
    }
}
