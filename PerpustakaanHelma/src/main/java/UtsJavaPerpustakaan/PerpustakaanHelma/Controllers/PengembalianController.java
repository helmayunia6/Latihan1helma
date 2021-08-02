package UtsJavaPerpustakaan.PerpustakaanHelma.Controllers;

import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.PengembalianDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.PeminjamanModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.PengembalianModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.PeminjamanRepository;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.PengembalianRepository;
import UtsJavaPerpustakaan.PerpustakaanHelma.Services.PengembalianServiceImplements;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Controller
public class PengembalianController {

    @Autowired
    PengembalianRepository pengembalianRepository;

    @Autowired
    PengembalianServiceImplements pengembalianService;

    @Autowired
    PeminjamanRepository peminjamanRepository;

    @GetMapping("/pengembalian")
    public String pengembalian(Model model){
        List<PeminjamanModel> pinjam = peminjamanRepository.getPinjam();
        model.addAttribute("pinjam", pinjam);
        model.addAttribute("title","Project Perpustakaan");

        return "pengembalian";
    }

    @GetMapping("/datapengembalian")
    public String Pengembalian(Model model){
        List<PengembalianModel> kembali = pengembalianRepository.getKembali();
        model.addAttribute("kembali", kembali);
        model.addAttribute("title","Project Perpustakaan");
        return "datapengembalian";
    }

    @RequestMapping(value = "/doInsertPengembalian", method = RequestMethod.GET)
    public String doInsertData(ModelMap model) throws Exception{
        PengembalianDTO dto = new PengembalianDTO();
        List<Map> listAddress = new ArrayList<>();
        try {
            model.addAttribute("PengembalianDTO", dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "datapengembalian";
    }

    @RequestMapping(value = "/savePengembalian", method = RequestMethod.POST)
    public String saveData(PengembalianDTO pengembalianDTO, ModelMap model) throws Exception{
        PengembalianModel result = pengembalianService.saveKembali(pengembalianDTO);
        System.out.println("=================="+result.getKd_kembali());
        return "redirect:datapengembalian";
    }
}
