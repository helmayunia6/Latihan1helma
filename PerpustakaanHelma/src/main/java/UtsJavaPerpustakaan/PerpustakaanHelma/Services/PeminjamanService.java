package UtsJavaPerpustakaan.PerpustakaanHelma.Services;



import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.AnggotaDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.PeminjamanDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.PeminjamanModel;
import org.hibernate.mapping.Map;

import java.util.List;

public interface PeminjamanService {
    public PeminjamanModel savePinjam(PeminjamanDTO pinjam);
    public List<PeminjamanModel> getPinjamNative();
    public PeminjamanDTO getPinjamById(String kd_pinjam);
    //Map getAnggotaById(AnggotaDTO anggotaDTO);
}
