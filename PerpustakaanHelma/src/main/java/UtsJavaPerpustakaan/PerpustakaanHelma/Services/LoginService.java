package UtsJavaPerpustakaan.PerpustakaanHelma.Services;

import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.LoginDTO;

import java.util.Map;

public interface LoginService {
    Map doLogin(LoginDTO loginDTO);
}
