package UtsJavaPerpustakaan.PerpustakaanHelma.Services;


import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.AnggotaDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.PeminjamanDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.AnggotaModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.PeminjamanModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.AnggotaRepository;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.PeminjamanRepository;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.HashMap;

@Service
public class PeminjamanServiceImplements implements PeminjamanService{

    @Autowired
    PeminjamanRepository peminjamanRepository;

    @Autowired
    AnggotaRepository anggotaRepository;

    @Override
    public PeminjamanModel savePinjam(PeminjamanDTO pinjam) {
        PeminjamanModel model = new PeminjamanModel();
        PeminjamanModel result = new PeminjamanModel();
        try {

            model.setId_anggota(pinjam.getId_anggota());
            model.setNama_anggota(pinjam.getNama_anggota());
            model.setKd_buku(pinjam.getKd_buku());
            model.setJudul_buku(pinjam.getJudul_buku());
            model.setTgl_pinjam(pinjam.getTgl_pinjam());
            model.setTgl_pengembalian(pinjam.getTgl_pengembalian());
        }catch (Exception e){

        }
        return result;
    }

    @Override
    public List<PeminjamanModel> getPinjamNative() {
        return peminjamanRepository.getPinjamNative();
    }

    @Override
    public PeminjamanDTO getPinjamById(String kd_pinjam) {
        PeminjamanModel model = peminjamanRepository.getPeminjamanById(kd_pinjam);
        PeminjamanDTO dto = new PeminjamanDTO();
        dto.setKd_pinjam(kd_pinjam);
        dto.setId_anggota(model.getId_anggota());
        dto.setNama_anggota(model.getNama_anggota());
        dto.setKd_buku(model.getKd_buku());
        dto.setJudul_buku(model.getJudul_buku());
        dto.setTgl_pinjam(model.getTgl_pinjam());
        dto.setTgl_pengembalian(model.getTgl_pengembalian());

        return dto;
    }

//    @Override
//    public Map getAnggotaById(AnggotaDTO anggotaDTO) {
//        Map result = new HashMap();
//        try {
//            AnggotaModel anggota = anggotaRepository.getAnggotaById(anggotaDTO.getId_anggota());
//            System.out.println("nilai dari implement : " + anggota);
//            if (anggota != null){
//                result.put("responseCode","00");
//                result.put("message","Data Berhasil Diambil");
//                result.put("nama_anggota",anggota);
//
//            }else{
//                //gagal
//                result.put("responseCode","99");
//                result.put("message","Data Gagal Diambil");
//
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//            result.put("responseCode","99");
//            result.put("message","Terjadi Kesalahan");
//        }
//        return result;
//    }
}
