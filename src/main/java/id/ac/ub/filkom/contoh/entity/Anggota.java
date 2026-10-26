package id.ac.ub.filkom.contoh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "anggota")
public class Anggota {

    @Id
    private String idAnggota;
    private String namaAnggota;
    private String alamatAnggota;

    // Konstruktor kosong wajib untuk JPA
    protected Anggota() {
    }

    public Anggota(String idAnggota, String namaAnggota, String alamatAnggota) {
        this.idAnggota = idAnggota;
        this.namaAnggota = namaAnggota;
        this.alamatAnggota = alamatAnggota;
    }

    public String getIdAnggota() { return idAnggota; }
    public String getNamaAnggota() { return namaAnggota; }
    public String getAlamatAnggota() { return alamatAnggota; }
}