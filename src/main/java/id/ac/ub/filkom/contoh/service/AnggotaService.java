package id.ac.ub.filkom.contoh.service;

import id.ac.ub.filkom.contoh.entity.Anggota;
import id.ac.ub.filkom.contoh.repository.AnggotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnggotaService {

    private final AnggotaRepository anggotaRepository;

    public AnggotaService(AnggotaRepository anggotaRepository) {
        this.anggotaRepository = anggotaRepository;
    }

    public List<Anggota> semuaAnggota() {
        return anggotaRepository.findAll();
    }

    public Anggota tambahAnggota(String idAnggota, String namaAnggota, String alamatAnggota) {
        return anggotaRepository.save(new Anggota(idAnggota, namaAnggota, alamatAnggota));
    }

    public void hapusAnggota(String idAnggota) {
        anggotaRepository.deleteById(idAnggota);
    }
}