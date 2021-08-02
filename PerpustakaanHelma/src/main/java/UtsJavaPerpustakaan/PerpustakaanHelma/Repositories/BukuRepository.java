package UtsJavaPerpustakaan.PerpustakaanHelma.Repositories;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.BukuModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BukuRepository extends JpaRepository<BukuModel, String> {
    //    HQL (Hibernate Query Language)
    @Query("SELECT u FROM BukuModel u WHERE u.kd_buku=:kd_buku")
    public BukuModel getBukuById(String kd_buku);

    @Query("FROM BukuModel ")
    public List<BukuModel> getBuku();

    @Query(value = "select * from tb_buku", nativeQuery = true)
    public List<BukuModel> getBukuNative();
}
