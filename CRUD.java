import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD extends abstractCRUD implements interfaceCRUD {
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpstmt;
    private Statement CRUDstat;
    private ResultSet CRUDhasil;
    private String CRUDquery;

    public CRUD() {
        try {
            Koneksi connection = new Koneksi();
            CRUDkoneksi = connection.getKoneksi();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public ResultSet tampilData() {
        CRUDquery = "select * from siswa";
        try {
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        } catch (Exception e) {
            System.out.println(e);
        }
        return CRUDhasil;
    }

    @Override
    public String simpanData(String id, String nama, String alamat) {
        CRUDquery = "insert into siswa values(?,?,?)";
        try {
            CRUDpstmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpstmt.setString(1, id);
            CRUDpstmt.setString(2, nama);
            CRUDpstmt.setString(3, alamat);
            CRUDpstmt.executeUpdate();
            CRUDpstmt.close();
            return "Data berhasil disimpan.";
        } catch (Exception e) {
            return "Data gagal disimpan: " + e.getMessage();
        }
    }

    @Override
    public String ubahData(String id, String nama, String alamat) {
        CRUDquery = "update siswa set nama=?, alamat=? where id=?";
        try {
            CRUDpstmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpstmt.setString(1, nama);
            CRUDpstmt.setString(2, alamat);
            CRUDpstmt.setString(3, id);
            CRUDpstmt.executeUpdate();
            CRUDpstmt.close();
            return "Data berhasil diubah.";
        } catch (Exception e) {
            return "Data gagal diubah: " + e.getMessage();
        }
    }

    @Override
    public String hapusData(String id) {
        CRUDquery = "delete from siswa where id=?";
        try {
            CRUDpstmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpstmt.setString(1, id);
            CRUDpstmt.executeUpdate();
            CRUDpstmt.close();
            return "Data berhasil dihapus.";
        } catch (Exception e) {
            return "Data gagal dihapus: " + e.getMessage();
        }
    }
}
