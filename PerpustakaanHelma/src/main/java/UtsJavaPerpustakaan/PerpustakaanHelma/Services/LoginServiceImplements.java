package UtsJavaPerpustakaan.PerpustakaanHelma.Services;


import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.LoginDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.LoginModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImplements implements LoginService{

    @Autowired
    LoginRepository loginRepository;

    @Override
    public Map doLogin(LoginDTO loginDTO) {
        Map result = new HashMap();
        try {
            LoginModel user = loginRepository.getLoginById(loginDTO.getUsername());
            if (user != null){
                if (user.getPassword().equals(loginDTO.getPassword())){
                    //berhasil
                    result.put("responseCode","00");
                    result.put("message","Login Berhasil");

                }else{
                    //gagal
                    result.put("responseCode","99");
                    result.put("message","Password Salah");

                }

            }else  {
                result.put("responseCode","99");
                result.put("message","User Belum Terdaftar");
            }
        }catch (Exception e){
            e.printStackTrace();
            result.put("responseCode","99");
            result.put("message","Terjadi Kesalahan");
        }

        return result;
    }
}
