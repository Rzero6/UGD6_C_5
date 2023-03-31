/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd6_c_5;

/**
 *
 * @author VICTUS
 */
public class RakBuku {
    private String namaRak,jenisRak;
    private int jumlahBuku;
    private Buku buku[];
    private int counter=0;

    public RakBuku(String namaRak, String jenisRak, int jumlahBuku) {
        this.namaRak = namaRak;
        this.jenisRak = jenisRak;
        this.jumlahBuku = jumlahBuku;
        this.buku = new Buku[jumlahBuku];
    }
    
    public void addBuku(String namaBuku, String pengarang, int tahunTerbit,float harga){
        buku[counter] = new Buku(namaRak, pengarang, harga, tahunTerbit);
        counter++;
    }
    
    public void showRakBuku(){
        System.out.println("Nama Rak Buku       : "+namaRak);
        System.out.println("Jenis Rak Buku      : "+jenisRak);
        System.out.println("Total Semua harga   : "+hitungTotalHargaBuku());
        System.out.println("Jumlah Buku         : "+jumlahBuku);
        
        for(int i = 0;i<buku.length;i++){
            System.out.println("\n\t*** Tampil Data Buku ***");
            System.out.println("Data Buku Ke    : "+(i+1));
            buku[i].showBuku();
        }
    }
    
    public float hitungTotalHargaBuku(){
        float total=0;
        for(int i=0;i<buku.length;i++){
            total+=buku[i].getHarga();
        }
        return total;
    }
    
    
    
}
