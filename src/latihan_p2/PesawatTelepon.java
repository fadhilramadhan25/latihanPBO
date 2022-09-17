/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_p2;

/**
 *
 * @author Fadhil Ramadhan
 */
public class PesawatTelepon {
    String jenis;
    int harga;
    
    void isi(String jenisPesawatTelepon, int hargaPesawatTelepon){
        jenis=jenisPesawatTelepon;
        harga=hargaPesawatTelepon;
    }
    
    void tampil(){
        System.out.println("Jenis Pesawat Telepon: " + jenis);
        System.out.println("Harga Pesawat Telepon: "+ harga);
    }
}
