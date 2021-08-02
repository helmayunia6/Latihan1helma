package UtsJavaPerpustakaan.PerpustakaanHelma.Services;

import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.AnggotaDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.AnggotaModel;

import java.util.List;

public interface AnggotaService {
    public boolean deleteAnggota(String id_anggota);
    public AnggotaModel saveAnggota(AnggotaDTO anggota);
    public List<AnggotaModel> getAnggotaNative();
    public AnggotaDTO getAnggotaById(String id_anggota);
    public AnggotaModel updateAnggota(AnggotaDTO anggota);
}
