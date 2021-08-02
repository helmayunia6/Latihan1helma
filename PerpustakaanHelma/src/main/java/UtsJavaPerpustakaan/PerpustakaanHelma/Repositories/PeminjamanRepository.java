package UtsJavaPerpustakaan.PerpustakaanHelma.Repositories;


import UtsJavaPerpustakaan.PerpustakaanHelma.Models.PeminjamanModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeminjamanRepository extends JpaRepository<PeminjamanModel, String> {
    //    HQL (Hibernate Query Language)
    @Query("SELECT u FROM PeminjamanModel u WHERE u.kd_pinjam=:kd_pinjam")
    public PeminjamanModel getPeminjamanById(String kd_pinjam);

    @Query("FROM PeminjamanModel ")
    public List<PeminjamanModel> getPinjam();

    @Query(value = "select * from tb_peminjaman", nativeQuery = true)
    public List<PeminjamanModel> getPinjamNative();

}
