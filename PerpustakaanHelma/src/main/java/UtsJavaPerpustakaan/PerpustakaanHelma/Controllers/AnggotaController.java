package UtsJavaPerpustakaan.PerpustakaanHelma.Controllers;

import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.AnggotaDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.BukuDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.AnggotaModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.BukuModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.AnggotaRepository;
import UtsJavaPerpustakaan.PerpustakaanHelma.Services.AnggotaServiceImplements;
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
import java.util.Map;

@Controller
public class AnggotaController {
    @Autowired
    AnggotaRepository anggotaRepository;

    @Autowired
    AnggotaServiceImplements anggotaService;

    @GetMapping("/dataanggota")
    public String anggota(Model model){
        List<AnggotaModel> anggota = anggotaRepository.getAnggota();
        model.addAttribute("anggota", anggota);
        model.addAttribute("title","Project Perpustakaan");
        return "dataanggota";
    }

    @GetMapping("deletedataanggota")
    public String delete(String id_anggota){
        anggotaService.deleteAnggota(id_anggota);
        return "redirect:dataanggota";
    }

    @RequestMapping(value = "/doInsertAnggota", method = RequestMethod.GET)
    public String doInsertData(ModelMap model) throws Exception{
        AnggotaDTO dto = new AnggotaDTO();
        List<Map> listAddress = new ArrayList<>();
        try {
            model.addAttribute("AnggotaDTO", dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "tambahanggota";
    }

    @RequestMapping(value = "/saveAnggota", method = RequestMethod.POST)
    public String saveData(AnggotaDTO anggotaDTO, ModelMap model) throws Exception{
        AnggotaModel result = anggotaService.saveAnggota(anggotaDTO);
        System.out.println("=================="+anggotaDTO.getId_anggota());
        System.out.println("=================="+result.getId_anggota());
        return "redirect:dataanggota";
    }

    @RequestMapping(value = "/doUpdateDataAnggota", method = RequestMethod.GET)
    public String doUpdateDataAnggota(ModelMap model, String id_anggota) throws Exception{
        AnggotaDTO dto = anggotaService.getAnggotaById(id_anggota);
        List<Map> listAddress = new ArrayList<>();
        try {
            model.addAttribute("AnggotaDTO", dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "updateanggota";
    }

    @RequestMapping(value = "/updateAnggota", method = RequestMethod.POST)
    public String updateData(AnggotaDTO anggotaDTO, ModelMap model) throws Exception{
        AnggotaModel result = anggotaService.updateAnggota(anggotaDTO);
        System.out.println("UPDATE =================="+anggotaDTO.getId_anggota());

        System.out.println("UPDATE =================="+result.getId_anggota());
        return "redirect:dataanggota";
    }
}
