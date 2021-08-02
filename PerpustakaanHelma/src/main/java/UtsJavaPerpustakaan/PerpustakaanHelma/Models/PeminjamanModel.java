package UtsJavaPerpustakaan.PerpustakaanHelma.Models;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//From JPA / Java Persistance
@Entity
@Table(name = "tb_peminjaman")

//From Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeminjamanModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kd_pinjam",nullable = false, unique = true)
    private String kd_pinjam;

    @Column(name = "id_anggota")
    private String id_anggota;

    @Column(name = "nama_anggota")
    private String nama_anggota;

    @Column(name = "kd_buku")
    private String kd_buku;

    @Column(name = "judul_buku")
    private String judul_buku;

    @Column(name = "tgl_pinjam")
    private String tgl_pinjam;

    @Column(name = "tgl_pengembalian")
    private String tgl_pengembalian;

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

    public String getNama_anggota() {
        return nama_anggota;
    }

    public void setNama_anggota(String nama_anggota) {
        this.nama_anggota = nama_anggota;
    }

    public String getKd_buku() {
        return kd_buku;
    }

    public void setKd_buku(String kd_buku) {
        this.kd_buku = kd_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
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
}
