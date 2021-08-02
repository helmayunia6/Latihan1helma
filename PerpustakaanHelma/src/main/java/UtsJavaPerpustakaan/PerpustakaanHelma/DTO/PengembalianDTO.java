package UtsJavaPerpustakaan.PerpustakaanHelma.DTO;

public class PengembalianDTO {
    String kd_kembali, kd_pinjam, id_anggota, kd_buku, tgl_pinjam, tgl_pengembalian;
    int denda;

    public String getKd_kembali() {
        return kd_kembali;
    }

    public void setKd_kembali(String kd_kembali) {
        this.kd_kembali = kd_kembali;
    }

    public String getKd_pinjam() {
        return kd_pinjam;
    }

    public void setKd_pinjam(String kd_pinjam) {
        this.kd_pinjam = kd_pinjam;
    }

    public String getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(String id_anggota) {
        this.id_anggota = id_anggota;
    }

    public String getKd_buku() {
        return kd_buku;
    }

    public void setKd_buku(String kd_buku) {
        this.kd_buku = kd_buku;
    }

    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public String getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    public void setTgl_pengembalian(String tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }
}
