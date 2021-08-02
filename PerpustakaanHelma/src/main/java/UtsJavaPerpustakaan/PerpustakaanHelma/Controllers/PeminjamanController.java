package UtsJavaPerpustakaan.PerpustakaanHelma.Controllers;

import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.AnggotaDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.PeminjamanDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.AnggotaModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.BukuModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.PeminjamanModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.AnggotaRepository;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.BukuRepository;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.PeminjamanRepository;
import UtsJavaPerpustakaan.PerpustakaanHelma.Services.PeminjamanServiceImplements;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller

public class PeminjamanController {
    @Autowired
    PeminjamanRepository peminjamanRepository;

    @Autowired
    AnggotaRepository anggotaRepository;

    @Autowired
    BukuRepository bukuRepository;

    @Autowired
    PeminjamanServiceImplements peminjamanService;

    @GetMapping("/peminjaman")
    public String peminjaman(Model model){
        List<PeminjamanModel> pinjam = peminjamanRepository.getPinjam();
        model.addAttribute("pinjam", pinjam);
        model.addAttribute("title","Project Perpustakaan");

        List<AnggotaModel> anggota = anggotaRepository.getAnggota();
        model.addAttribute("anggota", anggota);
        model.addAttribute("title","Project Perpustakaan");

        List<BukuModel> buku = bukuRepository.getBuku();
        model.addAttribute("buku", buku);
        model.addAttribute("title","Project Perpustakaan");

        return "peminjaman";
    }

    @GetMapping("/datapeminjaman")
    public String Peminjaman(Model model){
        List<PeminjamanModel> pinjam = peminjamanRepository.getPinjam();
        model.addAttribute("pinjam", pinjam);
        model.addAttribute("title","Project Perpustakaan");
        return "datapeminjaman";
    }

    @RequestMapping(value = "/doInsertPeminjaman", method = RequestMethod.GET)
    public String doInsertData(ModelMap model) throws Exception{
        PeminjamanDTO dto = new PeminjamanDTO();
        List<Map> listAddress = new ArrayList<>();
        try {
            model.addAttribute("PeminjamanDTO", dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "peminjaman";
    }

    @RequestMapping(value = "/savePeminjaman", method = RequestMethod.POST)
    public String saveData(PeminjamanDTO peminjamanDTO, ModelMap model) throws Exception{
        PeminjamanModel result = peminjamanService.savePinjam(peminjamanDTO);
        System.out.println("=================="+result.getKd_pinjam());
        return "redirect:dataanggota";
    }

//    @RequestMapping("getanggotarowbyid")
//    public ResponseEntity<java.lang.Object> getAnggotaRowById(AnggotaDTO anggotaDTO){
//        Map result = peminjamanService.getAnggotaById(anggotaDTO);
//        System.out.println(anggotaDTO.getId_anggota());
//        System.out.println(result);
//        if(result.get("responseCode").equals("00")){
//            return ResponseEntity.ok(result);
//        }else {
//            return ResponseEntity.badRequest().body(result);
//        }
//    }

}
