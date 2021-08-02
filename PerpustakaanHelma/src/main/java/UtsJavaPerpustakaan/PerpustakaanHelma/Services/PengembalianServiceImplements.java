package UtsJavaPerpustakaan.PerpustakaanHelma.Services;

import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.PengembalianDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.PengembalianModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.PengembalianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PengembalianServiceImplements implements PengembalianService{

    @Autowired
    PengembalianRepository pengembalianRepository;


    @Override
    public PengembalianModel saveKembali(PengembalianDTO kembali) {
        PengembalianModel model = new PengembalianModel();
        PengembalianModel result = new PengembalianModel();
        try {
            model.setKd_pinjam(kembali.getKd_pinjam());
            model.setId_anggota(kembali.getId_anggota());
            model.setKd_buku(kembali.getKd_buku());
            model.setTgl_pinjam(kembali.getTgl_pinjam());
            model.setTgl_pengembalian(kembali.getTgl_pengembalian());
            model.setDenda(kembali.getDenda());

        }catch (Exception e){

        }
        return result;
    }

    @Override
    public List<PengembalianModel> getKembaliNative() {
        return pengembalianRepository.getKembaliNative();
    }

    @Override
    public PengembalianDTO getKembaliById(String kd_kembali) {
        PengembalianModel model = pengembalianRepository.getPengembalianById(kd_kembali);
        PengembalianDTO dto = new PengembalianDTO();
        dto.setKd_kembali(kd_kembali);
        dto.setKd_pinjam(model.getKd_pinjam());
        dto.setId_anggota(model.getId_anggota());
        dto.setKd_buku(model.getKd_buku());
        dto.setTgl_pinjam(model.getTgl_pinjam());
        dto.setTgl_pengembalian(model.getTgl_pengembalian());
        dto.setDenda(model.getDenda());
        return dto;
    }
}
