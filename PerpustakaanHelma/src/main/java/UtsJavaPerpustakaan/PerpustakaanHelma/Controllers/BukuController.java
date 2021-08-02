package UtsJavaPerpustakaan.PerpustakaanHelma.Controllers;
import UtsJavaPerpustakaan.PerpustakaanHelma.DTO.BukuDTO;
import UtsJavaPerpustakaan.PerpustakaanHelma.Models.BukuModel;
import UtsJavaPerpustakaan.PerpustakaanHelma.Repositories.BukuRepository;
import UtsJavaPerpustakaan.PerpustakaanHelma.Services.BukuService;
import UtsJavaPerpustakaan.PerpustakaanHelma.Services.BukuServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BukuController {

    @Autowired
    BukuRepository bukuRepository;

    @Autowired
    BukuServiceImplements bukuService;

    @GetMapping("/databuku")
    public String buku(Model model){
        List<BukuModel> buku = bukuRepository.getBuku();
        model.addAttribute("buku", buku);
        model.addAttribute("title","Project Perpustakaan");
        return "databuku";
    }

    @GetMapping("deletedatabuku")
    public String delete(String kd_buku){
        bukuService.deleteBuku(kd_buku);
        return "redirect:databuku";
    }

    @RequestMapping(value = "/doInsertBuku", method = RequestMethod.GET)
    public String doInsertData(ModelMap model) throws Exception{
        BukuDTO dto = new BukuDTO();
        try {
            model.addAttribute("BukuDTO", dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Tambahbuku";
    }

    @RequestMapping(value = "/saveBuku", method = RequestMethod.POST)
    public String saveData(BukuDTO bukuDTO, ModelMap model) throws Exception{
        BukuModel result = bukuService.saveBuku(bukuDTO);
        System.out.println("==============="+bukuDTO.getKd_buku());
        System.out.println("=================="+bukuDTO.getJudul_buku());
        System.out.println("=================="+result.getKd_buku());
        return "redirect:databuku";
    }

    @RequestMapping(value = "/doUpdateDataBuku", method = RequestMethod.GET)
    public String doUpdateDataBuku(ModelMap model, String kd_buku) throws Exception{
        BukuDTO dto = bukuService.getBukuById(kd_buku);
        List<Map> listAddress = new ArrayList<>();
        try {
            model.addAttribute("bukuDTO", dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "updatebuku";
    }

    @RequestMapping(value = "/updateBuku", method = RequestMethod.POST)
    public String updateData(BukuDTO bukuDTO, ModelMap model) throws Exception{
        BukuModel result = bukuService.updateBuku(bukuDTO);
        System.out.println("UPDATE =================="+bukuDTO.getKd_buku());

        System.out.println("UPDATE =================="+result.getKd_buku());
        return "redirect:databuku";
    }

}
