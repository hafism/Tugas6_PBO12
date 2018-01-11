/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadhafis.latihanmvcjdbc.event;

import edu.muhammadhafis.latihanmvcjdbc.entity.Pelanggan;
import edu.muhammadhafis.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author LENOVO
 * NIM  : 10116548
 * NAMA : MUHAMMAD HAFIZ
 * KELAS: PBO-12
 */
public interface PelangganListener {
    
    public void onChange (PelangganModel model );  
    public void onInsert (PelangganModel pelanggan );  
    public void onDelete ();  
    public void onUpdate (PelangganModel pelanggan );  

    public void onInsert(Pelanggan pelanggan);
}
