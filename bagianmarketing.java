package Inheritence;

public class bagianmarketing extends karyawan {

    public bagianmarketing(String nama, String kotaAsal, int masaTugas, int jumlahAnak) {
        super(nama, kotaAsal, masaTugas, jumlahAnak);
    }

    public int hitungTunjanganAnak() {
        return super.getJumlahAnak() * 120000;
    }

    public int hitungBonus() {
        return super.getMasaTugas() * 100000;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: Rp" + hitungBonus());
        System.out.println("Tunjangan Anak: Rp" + hitungTunjanganAnak());
    }
}
