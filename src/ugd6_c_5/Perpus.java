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
    private int jumlahRak, jumlahOrang;
    private RakBuku rakBuku[];
    private int counter=0;
    private int counter2 = 0;
    private Denda denda[];

    public Perpus(String namaPerpus, String alamatPerpus, int jumlahRak, int jumlahOrang) {
        this.namaPerpus = namaPerpus;
        this.alamatPerpus = alamatPerpus;
        this.jumlahRak = jumlahRak;
        this.jumlahOrang = jumlahOrang;
        this.denda = new Denda[jumlahOrang];
        this.rakBuku = new RakBuku[jumlahRak];
    }
    
    public RakBuku addRakBuku(String namaRak, String jenisRak, int jumlahBuku){
        RakBuku rb = new RakBuku(namaRak, jenisRak, jumlahBuku);
        rakBuku[counter] = rb;
        counter++;
        return rb;
    }
    
    public void addDenda(Denda denda){
        this.denda[counter2] = denda;
        counter2++;
    }
    
    
    
    public float hitungTotalDenda(){
        float bantu=0;
        for (int i=0; i<denda.length; i++){
            bantu = bantu + denda[i].hitungDenda();
        }
        return bantu;
    }
    
    public void showPerpus(){
        System.out.println("\n*** Tampil Data Perpus ***");
        System.out.println("Nama Perpus\t: "+namaPerpus);
        System.out.println("Alamat Perpus\t: "+alamatPerpus);
        System.out.println("Jumlah Rak Buku: "+jumlahRak);
        System.out.println("Total Denda     : "+hitungTotalDenda());
        for(int i=0;i<rakBuku.length;i++){
            System.out.println("\t*** Tampil Rak Buku ***");
            System.out.println("\tData Rak Buku ke "+(i+1));
            rakBuku[i].showRakBuku();
        }
        for(int j=0; j<denda.length; j++){
            System.out.println("\n\t*** Tampil List Denda ***");
            System.out.println("\tData Denda ke   : "+(j+1));
            denda[j].showDenda();
        }
        
    }
}
