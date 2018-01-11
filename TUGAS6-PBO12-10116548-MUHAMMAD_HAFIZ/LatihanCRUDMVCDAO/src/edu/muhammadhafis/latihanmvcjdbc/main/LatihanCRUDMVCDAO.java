 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadhafis.latihanmvcjdbc.main;

import edu.muhammadhafis.latihanmvcjdbc.database.KinBarbershopDatabase;
import edu.muhammadhafis.latihanmvcjdbc.entity.Pelanggan;
import edu.muhammadhafis.latihanmvcjdbc.error.PelangganException;
import edu.muhammadhafis.latihanmvcjdbc.service.PelangganDao;
import edu.muhammadhafis.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 * NIM  : 10116548
 * NAMA : MUHAMMAD HAFIZ
 * KELAS: PBO-12
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan  =  new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    
}
