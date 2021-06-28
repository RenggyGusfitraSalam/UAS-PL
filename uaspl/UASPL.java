package UASPL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class UASPL {
    static Connection UASPL;
    public static Connection getConnection(){
        try{
            UASPL = DriverManager.getConnection("jdbc:mysql://localhost/data_mhs","root","");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Database Gagal");  
        }
     return UASPL;   
    } 
}