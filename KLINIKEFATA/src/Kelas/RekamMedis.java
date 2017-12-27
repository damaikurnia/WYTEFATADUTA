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
public class RekamMedis {
    private String idRekam;
    private String tglKunjungan;
    private String anamnesa;
    private String diagnosa;
    private String therapi;
    private String foto;
    private Pasien idPasien;
    private Dokter idDokter;
    private Double tarif;
    
    public RekamMedis(String idr, Dokter idd, Pasien idp, String tgl, String anam, String diag, String ther, Double tarif){
        this.idRekam = idr;
        this.idDokter = idd;
        this.idPasien = idp;
        this.tglKunjungan = tgl;
        this.anamnesa = anam;
        this.diagnosa = diag;
        this.therapi = ther;
        this.tarif = tarif;
    }
    
    /**
     * @return the idRekam
     */
    public String getIdRekam() {
        return idRekam;
    }

    /**
     * @param idRekam the idRekam to set
     */
    public void setIdRekam(String idRekam) {
        this.idRekam = idRekam;
    }

    /**
     * @return the tglKunjungan
     */
    public String getTglKunjungan() {
        return tglKunjungan;
    }

    /**
     * @param tglKunjungan the tglKunjungan to set
     */
    public void setTglKunjungan(String tglKunjungan) {
        this.tglKunjungan = tglKunjungan;
    }

    /**
     * @return the anamnesa
     */
    public String getAnamnesa() {
        return anamnesa;
    }

    /**
     * @param anamnesa the anamnesa to set
     */
    public void setAnamnesa(String anamnesa) {
        this.anamnesa = anamnesa;
    }

    /**
     * @return the diagnosa
     */
    public String getDiagnosa() {
        return diagnosa;
    }

    /**
     * @param diagnosa the diagnosa to set
     */
    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    /**
     * @return the therapi
     */
    public String getTherapi() {
        return therapi;
    }

    /**
     * @param therapi the therapi to set
     */
    public void setTherapi(String therapi) {
        this.therapi = therapi;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @return the idPasien
     */
    public Pasien getIdPasien() {
        return idPasien;
    }

    /**
     * @param idPasien the idPasien to set
     */
    public void setIdPasien(Pasien idPasien) {
        this.idPasien = idPasien;
    }

    /**
     * @return the idDokter
     */
    public Dokter getIdDokter() {
        return idDokter;
    }

    /**
     * @param idDokter the idDokter to set
     */
    public void setIdDokter(Dokter idDokter) {
        this.idDokter = idDokter;
    }

    /**
     * @return the tarif
     */
    public Double getTarif() {
        return tarif;
    }

    /**
     * @param tarif the tarif to set
     */
    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }
    
}
