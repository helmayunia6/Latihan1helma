package UtsJavaPerpustakaan.PerpustakaanHelma.Repositories;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.AnggotaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnggotaRepository extends JpaRepository<AnggotaModel, String> {
    //    HQL (Hibernate Query Language)
    @Query("SELECT u FROM AnggotaModel u WHERE u.id_anggota=:id_anggota")
    public AnggotaModel getAnggotaById(String id_anggota);

    @Query("FROM AnggotaModel")
    public List<AnggotaModel> getAnggota();

    @Query(value = "select * from tb_anggota", nativeQuery = true)
    public List<AnggotaModel> getAnggotaNative();
}
