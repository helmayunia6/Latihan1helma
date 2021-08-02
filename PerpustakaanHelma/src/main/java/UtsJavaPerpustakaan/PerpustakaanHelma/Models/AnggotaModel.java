package UtsJavaPerpustakaan.PerpustakaanHelma.Models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//From JPA / Java Persistance
@Entity
@Table(name = "tb_anggota")

//From Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AnggotaModel implements Serializable{
    @Id
    @Column(name = "id_anggota",nullable = false, unique = true)
    private String id_anggota;

    @Column(name = "nama_anggota")
    private String nama_anggota;

    @Column(name = "jenis_kelamin")
    private String jenis_kelamin;

    @Column(name = "tempat_lahir")
    private String tempat_lahir;

    @Column(name = "tanggal_lahir")
    private String tanggal_lahir;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "jurusan")
    private String jurusan;

    @Column(name = "foto")
    private String foto;


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

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getTempat_lahir() { return tempat_lahir; }

    public void setTempat_lahir(String tempat_lahir) { this.tempat_lahir = tempat_lahir; }

    public String getTanggal_lahir() { return tanggal_lahir; }

    public void setTanggal_lahir(String tanggal_lahir) { this.tanggal_lahir = tanggal_lahir; }


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }


    public String getFoto() { return foto; }

    public void setFoto(String foto) { this.foto = foto; }
}
