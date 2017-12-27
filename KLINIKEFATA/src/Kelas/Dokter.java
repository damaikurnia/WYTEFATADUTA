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
public class Dokter {

    private String idDokter;
    private String namaDokter;
    private String noHP;
    private String password;

    public Dokter(){}
    
    public Dokter(String idd, String nama, String hp, String pasw) {
        this.idDokter = idd;
        this.namaDokter = nama;
        this.noHP = hp;
        this.password = pasw;
    }

    /**
     * @return the idDokter
     */
    public String getIdDokter() {
        return idDokter;
    }

    /**
     * @param idDokter the idDokter to set
     */
    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    /**
     * @return the namaDokter
     */
    public String getNamaDokter() {
        return namaDokter;
    }

    /**
     * @param namaDokter the namaDokter to set
     */
    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    /**
     * @return the noHP
     */
    public String getNoHP() {
        return noHP;
    }

    /**
     * @param noHP the noHP to set
     */
    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
