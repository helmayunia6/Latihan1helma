package UtsJavaPerpustakaan.PerpustakaanHelma.Repositories;


import UtsJavaPerpustakaan.PerpustakaanHelma.Models.PeminjamanModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.PengembalianModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PengembalianRepository extends JpaRepository<PengembalianModel, String> {
    //    HQL (Hibernate Query Language)
    @Query("SELECT u FROM PengembalianModel u WHERE u.kd_kembali=:kd_kembali")
    public PengembalianModel getPengembalianById(String kd_kembali);

    @Query("FROM PengembalianModel ")
    public List<PengembalianModel> getKembali();

    @Query(value = "select * from tb_pengembalian", nativeQuery = true)
    public List<PengembalianModel> getKembaliNative();


}
