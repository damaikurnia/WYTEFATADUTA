/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

/**
 *
 * @author damaikurnia
 */
public class Pasien {
    private String idPasien;
    private String namaPasien;
    private String alamat;
    private String jk;
    private String telp;
    private int umur;

    public Pasien(String idp, String nama, String alamat, String jk, String telp, int umur){
        this.idPasien = idp;
        this.namaPasien = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.telp = telp;
        this.umur = umur;
    }
    /**
     * @return the idPasien
     */
    public String getIdPasien() {
        return idPasien;
    }

    /**
     * @param idPasien the idPasien to set
     */
    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    /**
     * @return the namaPasien
     */
    public String getNamaPasien() {
        return namaPasien;
    }

    /**
     * @param namaPasien the namaPasien to set
     */
    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the jk
     */
    public String getJk() {
        return jk;
    }

    /**
     * @param jk the jk to set
     */
    public void setJk(String jk) {
        this.jk = jk;
    }

    /**
     * @return the telp
     */
    public String getTelp() {
        return telp;
    }

    /**
     * @param telp the telp to set
     */
    public void setTelp(String telp) {
        this.telp = telp;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
}
