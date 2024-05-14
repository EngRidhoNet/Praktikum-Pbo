import java.sql.ResultSet;

public interface interfaceCRUD {
    ResultSet tampilData();
    String simpanData(String id, String nama, String alamat);
    String ubahData(String id, String nama, String alamat);
    String hapusData(String id);
}
