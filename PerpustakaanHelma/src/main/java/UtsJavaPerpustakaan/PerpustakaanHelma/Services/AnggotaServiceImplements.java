package UtsJavaPerpustakaan.PerpustakaanHelma.Services;

import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.AnggotaDTO;

import UtsJavaPerpustakaan.PerpustakaanHelma.Models.AnggotaModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnggotaServiceImplements implements AnggotaService{
    @Autowired
    AnggotaRepository anggotaRepository;

    @Override
    public boolean deleteAnggota(String id_anggota) {
        AnggotaModel model = anggotaRepository.getAnggotaById(id_anggota);
        anggotaRepository.delete(model);
        return true;
    }

    @Override
    public AnggotaModel saveAnggota(AnggotaDTO anggota) {
        AnggotaModel model = new AnggotaModel();
        AnggotaModel result = new AnggotaModel();
        try {
            model.setId_anggota(anggota.getId_anggota());
            model.setNama_anggota(anggota.getNama_anggota());
            model.setJenis_kelamin(anggota.getJenis_kelamin());
            model.setTempat_lahir(anggota.getTempat_lahir());
            model.setTanggal_lahir(anggota.getTanggal_lahir());
            model.setAlamat(anggota.getAlamat());
            model.setJurusan(anggota.getJurusan());
            model.setFoto(anggota.getFoto());
            result = anggotaRepository.save(model);
        }catch (Exception e){

        }
        return result;
    }

    @Override
    public List<AnggotaModel> getAnggotaNative() {
        return anggotaRepository.getAnggotaNative();
    }

    @Override
    public AnggotaDTO getAnggotaById(String id_anggota) {
        AnggotaModel model = anggotaRepository.getAnggotaById(id_anggota);
        AnggotaDTO dto = new AnggotaDTO();
        dto.setId_anggota(id_anggota);
        dto.setNama_anggota(model.getNama_anggota());
        dto.setJenis_kelamin(model.getJenis_kelamin());
        dto.setTempat_lahir(model.getTempat_lahir());
        dto.setTanggal_lahir(model.getTanggal_lahir());
        dto.setAlamat(model.getAlamat());
        dto.setJurusan(model.getJurusan());
        dto.setFoto(model.getFoto());

        return dto;
    }

    @Override
    public AnggotaModel updateAnggota(AnggotaDTO anggota) {
        AnggotaModel model = new AnggotaModel();
        AnggotaModel result = new AnggotaModel();
        try {
            model.setId_anggota(anggota.getId_anggota());
            model.setNama_anggota(anggota.getNama_anggota());
            model.setJenis_kelamin(anggota.getJenis_kelamin());
            model.setTempat_lahir(anggota.getTempat_lahir());
            model.setTanggal_lahir(anggota.getTanggal_lahir());
            model.setAlamat(anggota.getAlamat());
            model.setJurusan(anggota.getJurusan());
            model.setFoto(anggota.getFoto());
            result = anggotaRepository.save(model);
        }catch (Exception e){

        }
        return result;
    }
}
