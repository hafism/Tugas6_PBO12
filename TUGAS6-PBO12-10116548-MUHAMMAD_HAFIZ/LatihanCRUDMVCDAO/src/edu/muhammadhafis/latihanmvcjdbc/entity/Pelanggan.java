/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadhafis.latihanmvcjdbc.entity;

/**
 *
 * @author LENOVO
 * NIM  : 10116548
 * NAMA : MUHAMMAD HAFIZ
 * KELAS: PBO-12
 */
public class Pelanggan {
    
    private Integer id;
    private  String nama;
    private  String alamat;
    private  String telepon;
    private  String email;
    
    public Pelanggan(){
        
    }

    public Pelanggan(String nama, String alamat, String telepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}