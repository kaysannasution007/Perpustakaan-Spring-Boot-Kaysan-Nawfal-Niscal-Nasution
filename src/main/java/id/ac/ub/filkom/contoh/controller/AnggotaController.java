package id.ac.ub.filkom.contoh.controller;

import id.ac.ub.filkom.contoh.service.AnggotaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnggotaController {

    private final AnggotaService anggotaService;

    public AnggotaController(AnggotaService anggotaService) {
        this.anggotaService = anggotaService;
    }

    // GET http://localhost:8080/anggota
    @GetMapping("/anggota")
    public String daftarAnggota(Model model) {
        model.addAttribute("daftarAnggota", anggotaService.semuaAnggota());
        return "anggota";            // -> templates/anggota.html
    }

    @PostMapping("/anggota")
    public String tambahAnggota(@RequestParam String idAnggota,
                                @RequestParam String namaAnggota,
                                @RequestParam String alamatAnggota) {
        anggotaService.tambahAnggota(idAnggota, namaAnggota, alamatAnggota);
        return "redirect:/anggota";
    }

    @PostMapping("/anggota/hapus")
    public String hapusAnggota(@RequestParam String idAnggota) {
        anggotaService.hapusAnggota(idAnggota);
        return "redirect:/anggota";
    }
}