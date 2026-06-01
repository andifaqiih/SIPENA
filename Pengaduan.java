package com.akademik;

public class Pengaduan {

    private String nama;
    private String nim;
    private String kategori;
    private String laporan;
    private String status;

    public Pengaduan(String nama,
                     String nim,
                     String kategori,
                     String laporan,
                     String status) {

        this.nama = nama;
        this.nim = nim;
        this.kategori = kategori;
        this.laporan = laporan;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getKategori() {
        return kategori;
    }

    public String getLaporan() {
        return laporan;
    }

    public String getStatus() {
        return status;
    }
}