/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadhafis.latihanmvcjdbc.model;

import edu.muhammadhafis.latihanmvcjdbc.database.KinBarbershopDatabase;
import edu.muhammadhafis.latihanmvcjdbc.entity.Pelanggan;
import edu.muhammadhafis.latihanmvcjdbc.error.PelangganException;
import edu.muhammadhafis.latihanmvcjdbc.event.PelangganListener;
import edu.muhammadhafis.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 * NIM  : 10116548
 * NAMA : MUHAMMAD HAFIZ
 * KELAS: PBO-12
 */
public class PelangganModel {
    
    private int id;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
    
    private PelangganListener Listener;

    public PelangganListener getListener() {
        return Listener;
    }

    public void setListener(PelangganListener Listener) {
        this.Listener = Listener;
    }
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        fireonChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireonChange();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireonChange();
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
        fireonChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireonChange();
    }
    
    protected void fireonChange(){
        if (Listener !=null) {
            Listener.onChange(this);
        }
    }
    protected void fireonInsert(Pelanggan pelanggan){
        if (Listener !=null) {
            Listener.onInsert(pelanggan);
        }
    }
    protected void fireonUpdate(Pelanggan pelanggan){
        if (Listener !=null) {
            Listener.onUpdate(this);
        }
    }
    protected void fireonDelete(){
        if (Listener !=null) {
            Listener.onDelete();
        }
    }
    public void insertPelanggan() throws SQLException, PelangganException{
        
        PelangganDao dao = KinBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelepon(telepon);
        pelanggan.setEmail(email);
        
        dao.insertPelanggan(pelanggan);
        fireonInsert(pelanggan);
        
        
    } 
    public void updatePelanggan() throws SQLException, PelangganException{
        
        PelangganDao dao = KinBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelepon(telepon);
        pelanggan.setEmail(email);
        pelanggan.setId(id);
        
        dao.updatePelanggan(pelanggan);
        fireonUpdate(pelanggan);
    }

    public void deletePelanggan() throws SQLException, PelangganException{
        
        PelangganDao dao = KinBarbershopDatabase.getPelangganDao();
        dao.deletePelanggan(id);
        fireonDelete();
    }    
    
    public void resetPelanggan(){
        setId(0);
        setNama("");
        setAlamat("");
        setTelepon("");
        setEmail("");
        
    }
}
