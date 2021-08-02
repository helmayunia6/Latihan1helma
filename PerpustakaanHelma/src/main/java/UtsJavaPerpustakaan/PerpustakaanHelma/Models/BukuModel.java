package UtsJavaPerpustakaan.PerpustakaanHelma.Models;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//From JPA / Java Persistance
@Entity
@Table(name = "tb_buku")

//From Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BukuModel implements Serializable{

    @Id
    @Column(name = "kd_buku",nullable = false, unique = true)
    private String kd_buku;

    @Column(name = "judul_buku")
    private String judul_buku;

    @Column(name = "penerbit_buku")
    private String penerbit_buku;

    @Column(name = "tahun_terbit")
    private String tahun_terbit;

    @Column(name = "kategori_buku")
    private String kategori_buku;

    @Column(name = "jumlah")
    private Integer jumlah;

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

    public String getPenerbit_buku() {
        return penerbit_buku;
    }

    public void setPenerbit_buku(String penerbit_buku) {
        this.penerbit_buku = penerbit_buku;
    }

    public String getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(String tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public String getKategori_buku() {
        return kategori_buku;
    }

    public void setKategori_buku(String kategori_buku) {
        this.kategori_buku = kategori_buku;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
}
