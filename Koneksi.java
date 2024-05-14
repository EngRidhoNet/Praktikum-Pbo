
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class Koneksi {
    private Connection connect;
    private String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL
    private String jdbc = "jdbc:mysql://";
    private String host = "localhost:"; // Bisa Menggunakan IP Anda, Cnth
                                         // 192.168.100.100
    private String port = "3306/"; // Port ini port MySQL
    private String database = "crud220605110044"; // Ini Database yang akan digunakan
    private String url = jdbc + host + port + database;
    private String username = "root"; // username default mysql
    private String password = "";

    public Connection getKoneksi() throws SQLException {
        if (connect == null) {
            try {
                Class.forName(driverName);
                System.out.println("Class Driver Ditemukan");

                try {
                    connect = DriverManager.getConnection(url, username, password);
                    System.out.println("Koneksi Database Sukses");
                } catch (SQLException se) {
                    System.out.println("Koneksi Database Gagal : " + se);
                }
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada: "
                        + cnfe);
            }
        }
        return connect;
    }

    
}