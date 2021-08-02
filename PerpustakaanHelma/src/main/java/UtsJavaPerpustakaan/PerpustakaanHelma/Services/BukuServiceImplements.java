package UtsJavaPerpustakaan.PerpustakaanHelma.Services;

import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.BukuDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.BukuModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BukuServiceImplements implements BukuService{
    @Autowired
    BukuRepository bukuRepository;

    @Override
    public boolean deleteBuku(String kd_buku) {
        BukuModel model = bukuRepository.getBukuById(kd_buku);
        bukuRepository.delete(model);
        return true;
    }

    @Override
    public BukuModel saveBuku(BukuDTO buku) {
        BukuModel model = new BukuModel();
        BukuModel result = new BukuModel();
        try {
            model.setKd_buku(buku.getKd_buku());
            model.setJudul_buku(buku.getJudul_buku());
            model.setPenerbit_buku(buku.getPenerbit_buku());
            model.setTahun_terbit(buku.getTahun_terbit());
            model.setKategori_buku(buku.getKategori_buku());
            model.setJumlah(buku.getJumlah());
            result = bukuRepository.save(model);
        }catch (Exception e){

        }
        return result;
    }

    @Override
    public List<BukuModel> getBukuNative() {
        return bukuRepository.getBukuNative();
    }

    @Override
    public BukuDTO getBukuById(String kd_buku) {
        BukuModel model = bukuRepository.getBukuById(kd_buku);
        BukuDTO dto = new BukuDTO();
        dto.setKd_buku(kd_buku);
        dto.setJudul_buku(model.getJudul_buku());
        dto.setPenerbit_buku(model.getPenerbit_buku());
        dto.setTahun_terbit(model.getTahun_terbit());
        dto.setKategori_buku(model.getKategori_buku());
        dto.setJumlah(model.getJumlah());
        return dto;
    }

    @Override
    public BukuModel updateBuku(BukuDTO buku) {
        BukuModel model = new BukuModel();
        BukuModel result = new BukuModel();
        try {
            model.setKd_buku(buku.getKd_buku());
            model.setJudul_buku(buku.getJudul_buku());
            model.setPenerbit_buku(buku.getPenerbit_buku());
            model.setTahun_terbit(buku.getTahun_terbit());
            model.setKategori_buku(buku.getKategori_buku());
            model.setJumlah(buku.getJumlah());
            result = bukuRepository.save(model);
        }catch (Exception e){

        }
        return result;
    }


}
