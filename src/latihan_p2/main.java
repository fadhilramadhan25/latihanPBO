/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_p2;

/**
 *
 * @author Fadhil Ramadhan
 */
public class main {
    public static void main(String[] args){
        
        //membuat objek dari class manusia
        Manusia manusia = new Manusia();
        
        //mengisi atribut class
        manusia.isivariabel("fadhil", 22);
        
        //memanggil method print manusia
        manusia.printManusia();
        
        
        PesawatTelepon call= new PesawatTelepon();
        
       call.isi("Intercom", 200000);
       call.tampil();
    }
}

