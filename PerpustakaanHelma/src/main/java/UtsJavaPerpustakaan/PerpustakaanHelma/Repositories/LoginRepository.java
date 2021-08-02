package UtsJavaPerpustakaan.PerpustakaanHelma.Repositories;

import UtsJavaPerpustakaan.PerpustakaanHelma.Models.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel, String> {
    //    HQL (Hibernate Query Language)
    @Query("SELECT u FROM LoginModel u WHERE u.username=:username")
    public LoginModel getLoginById(String username);

}
