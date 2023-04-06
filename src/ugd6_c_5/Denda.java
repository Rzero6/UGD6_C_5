/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd6_c_5;

/**
 *
 * @author Msi Modern 14
 */
public class Denda {
    private String nama_orang;
    private int lama_hari;
    private float denda;

    public Denda(String nama_orang, int lama_hari) {
        this.nama_orang = nama_orang;
        this.lama_hari = lama_hari;
        this.denda = hitungDenda();
    }
    
    public void showDenda(){
        System.out.println("\tNama Yang Kena Denda    : "+nama_orang);
        System.out.println("\tLama                    : "+lama_hari);
        System.out.println("\tTotal Denda             : "+hitungDenda());
    }
    
    public float hitungDenda(){
        return lama_hari*5000;
    }
    
}
