package Inheritence;

public class karyawan {

    private final String nama;
    private final String kotaAsal;
    private final int masaTugas;
    private final int jumlahAnak;

    public karyawan(String nama, String kotaAsal, int masaTugas, int jumlahAnak) {
        this.nama = nama;
        this.kotaAsal = kotaAsal;
        this.masaTugas = masaTugas;
        this.jumlahAnak = jumlahAnak;
    }

    protected  String getNama() {
        return nama;
    }

    protected String getKotaAsal() {
        return kotaAsal;
    }

    protected int getMasaTugas() {
        return masaTugas;
    }
    
    protected int getJumlahAnak (){
        return jumlahAnak;
    }
    

    public void tampilData() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Kota Asal: " + kotaAsal);
        System.out.println("Masa Tugas: " + masaTugas + " bulan");
        System.out.println("Jumlah Anak : " + jumlahAnak);
    }
}
