package com.example.testprojekflashdelivery.Model;

public class DataPengiriman {

    // Pengirim
    private String nama_pengirim, kota_pengirim, alamat_pengirim, no_hp_pengirim;

    // Penerima
    private String nama_penerima, kota_penerima, alamat_penerima, no_hp_penerima;

    private String service_pengiriman, berat_barang, harga_pengiriman;

    private String kode_pengiriman, status_pengiriman;

    public String getNama_pengirim() {
        return nama_pengirim;
    }

    public void setNama_pengirim(String nama_pengirim) {
        this.nama_pengirim = nama_pengirim;
    }

    public String getKota_pengirim() {
        return kota_pengirim;
    }

    public void setKota_pengirim(String kota_pengirim) {
        this.kota_pengirim = kota_pengirim;
    }

    public String getAlamat_pengirim() {
        return alamat_pengirim;
    }

    public void setAlamat_pengirim(String alamat_pengirim) {
        this.alamat_pengirim = alamat_pengirim;
    }

    public String getNo_hp_pengirim() {
        return no_hp_pengirim;
    }

    public void setNo_hp_pengirim(String no_hp_pengirim) {
        this.no_hp_pengirim = no_hp_pengirim;
    }

    public String getNama_penerima() {
        return nama_penerima;
    }

    public void setNama_penerima(String nama_penerima) {
        this.nama_penerima = nama_penerima;
    }

    public String getKota_penerima() {
        return kota_penerima;
    }

    public void setKota_penerima(String kota_penerima) {
        this.kota_penerima = kota_penerima;
    }

    public String getAlamat_penerima() {
        return alamat_penerima;
    }

    public void setAlamat_penerima(String alamat_penerima) {
        this.alamat_penerima = alamat_penerima;
    }

    public String getNo_hp_penerima() {
        return no_hp_penerima;
    }

    public void setNo_hp_penerima(String no_hp_penerima) {
        this.no_hp_penerima = no_hp_penerima;
    }

    public String getService_pengiriman() {
        return service_pengiriman;
    }

    public void setService_pengiriman(String service_pengiriman) {
        this.service_pengiriman = service_pengiriman;
    }

    public String getBerat_barang() {
        return berat_barang;
    }

    public void setBerat_barang(String berat_barang) {
        this.berat_barang = berat_barang;
    }

    public String getHarga_pengiriman() {
        return harga_pengiriman;
    }

    public void setHarga_pengiriman(String harga_pengiriman) {
        this.harga_pengiriman = harga_pengiriman;
    }

    public String getKode_pengiriman() {
        return kode_pengiriman;
    }

    public void setKode_pengiriman(String kode_pengiriman) {
        this.kode_pengiriman = kode_pengiriman;
    }

    public String getStatus_pengiriman() {
        return status_pengiriman;
    }

    public void setStatus_pengiriman(String status_Pengiriman) {
        this.status_pengiriman = status_Pengiriman;
    }

    public DataPengiriman() {

    }

    public DataPengiriman(String kode_pengiriman, String nama_pengirim, String kota_pengirim, String alamat_pengirim, String no_hp_pengirim, String nama_penerima, String kota_penerima, String alamat_penerima, String no_hp_penerima, String service_pengiriman, String berat_barang, String harga_pengiriman, String status_pengiriman) {

        this.kode_pengiriman = kode_pengiriman;

        this.nama_pengirim = nama_pengirim;
        this.kota_pengirim = kota_pengirim;
        this.alamat_pengirim = alamat_pengirim;
        this.no_hp_pengirim = no_hp_pengirim;

        this.nama_penerima = nama_penerima;
        this.kota_penerima = kota_penerima;
        this.alamat_penerima = alamat_penerima;
        this.no_hp_penerima = no_hp_penerima;

        this.service_pengiriman = service_pengiriman;
        this.berat_barang = berat_barang;

        this.harga_pengiriman = harga_pengiriman;
        this.status_pengiriman = status_pengiriman;
    }

}
