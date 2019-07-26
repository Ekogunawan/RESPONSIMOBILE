package com.gmail.akakom16.eko.responsimobile;

public class Mahasiswa {

    private String nama;
    private String npm;
    private String nohp;
    //TODO 1 java: Yaitu program di atas adalah membuat class mahasiswa dan mendeklarasikan variabel dan sifatnya private dan class ini di buat utnuk lisview yang akan di tampilkan

    public Mahasiswa(String nama, String npm, String nohp) {
        this.nama = nama;
        this.npm = npm;
        this.nohp = nohp;
        //TODO 2 java: Yaitu program di atas adalah memngisikan nilai dari variabel yang akan di buat dari class mahasiswa

    }

    public String getNama() {
        return nama;
        //TODO 3 java: Yaitu program diatas mendeklarasikan method untuk get nama dan nilainya mengambil dari variabel nama
    }

    public void setNama(String nama) {
        this.nama = nama;
        //TODO 4 java: Yaitu program diatas mendeklarasikan method untuk set nama dan nilainya mengambil dari variabel nama

    }

    public String getNpm() {
        return npm;
        //TODO 5 java: Yaitu program diatas mendeklarasikan method untuk get npm dan nilainya mengambil dari variabel npm

    }

    public void setNpm(String npm) {
        this.npm = npm;
        //TODO 6 java: Yaitu program diatas mendeklarasikan method untuk setnpm dan nilainya mengambil dari variabel npm

    }

    public String getNohp() {
        return nohp;
        //TODO 7 java: Yaitu program diatas mendeklarasikan method untuk get nohp dan nilainya mengambil dari variabel no hp

    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
        //TODO 8 java: Yaitu program diatas mendeklarasikan method untuk setnohp dan nilainya mengambil dari variabel no hop

    }
}