package UtsJavaPerpustakaan.PerpustakaanHelma.Services;

import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.PengembalianDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.PengembalianModel;

import java.util.List;
public interface PengembalianService {
    public PengembalianModel saveKembali(PengembalianDTO kembali);
    public List<PengembalianModel> getKembaliNative();
    public PengembalianDTO getKembaliById(String kd_kembali);
}
