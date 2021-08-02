package UtsJavaPerpustakaan.PerpustakaanHelma.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.io.Serializable;

//From JPA / Java Persistance
@Entity
@Table(name = "tb_login")

//From Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoginModel implements Serializable {
    @Id
    @Column(name = "username",nullable = false, unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
