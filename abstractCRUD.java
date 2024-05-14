public abstract class abstractCRUD {
    protected String id, nama, alamat;

    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }
}
