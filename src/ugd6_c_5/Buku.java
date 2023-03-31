/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd6_c_5;

/**
 *
 * @author VICTUS
 */
public class Buku {
    private String nama,pengarang;
    private float harga;
    private int tahunTerbit;

    public Buku(String nama, String pengarang, float harga, int tahunTerbit) {
        this.nama = nama;
        this.pengarang = pengarang;
        this.harga = harga;
        this.tahunTerbit = tahunTerbit;
    }

    public float getHarga() {
        return harga;
    }
    
    public void showBuku(){
        System.out.println("");
    }
    
}
