/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd6_c_5;

/**
 *
 * @author VICTUS
 */
public class Perpus {
    private String namaPerpus,alamatPerpus;
    private int jumlahRak;
    private RakBuku rakBuku[];
    private int counter=0;

    public Perpus(String namaPerpus, String alamatPerpus, int jumlahRak) {
        this.namaPerpus = namaPerpus;
        this.alamatPerpus = alamatPerpus;
        this.jumlahRak = jumlahRak;
        this.rakBuku = new RakBuku[jumlahRak];
    }
    
    public RakBuku addRakBuku(String namaRak, String jenisRak, int jumlahBuku){
        RakBuku rb = new RakBuku(namaRak, jenisRak, jumlahBuku);
        rakBuku[counter] = rb;
        counter++;
        return rb;
    }
    
    public void showPerpus(){
        System.out.println("\n*** Tampil Data Perpus ***");
        System.out.println("Nama Perpus\t: "+namaPerpus);
        System.out.println("Alamat Perpus\t: "+alamatPerpus);
        System.out.println("Jumlah Rak Buku: "+jumlahRak);
        for(int i=0;i<rakBuku.length;i++){
            System.out.println("\t*** Tampil Rak Buku ***");
            System.out.println("\tData Rak Buku ke "+(i+1));
            rakBuku[i].showRakBuku();
        }
    }
}
