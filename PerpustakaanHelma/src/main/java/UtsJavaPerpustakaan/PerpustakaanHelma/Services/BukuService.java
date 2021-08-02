package UtsJavaPerpustakaan.PerpustakaanHelma.Services;

import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.BukuDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.BukuModel;
import java.util.List;

public interface BukuService {
    public boolean deleteBuku(String kd_buku);
    public BukuModel saveBuku(BukuDTO buku);
    public List<BukuModel> getBukuNative();
    public BukuDTO getBukuById(String kd_buku);
    public BukuModel updateBuku(BukuDTO buku);
}
