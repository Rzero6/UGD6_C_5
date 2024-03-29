/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ugd6_c_5;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.ArrayList;
/**
  
 *
 * @author VICTUS
    Reynold Kunarto             210711015   C
    Febiola Ika Putri Wibowo    210711023   C
 */
public class UGD6_C_5 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner scan = new Scanner (System.in);
        // TODO code application logic here
        String namaPerpus, alamatPerpus;
        String namaRak, jenisRak;
        String nama, pengarang;
        String namaOrang;
        int jumlahRak, jumlahBuku, tahunTerbit, jumlahOrang, lama_hari;
        float harga;
        
        try{
            System.out.println("*** Input Data Perpus ***");
            System.out.print("Nama perpus     : ");namaPerpus=br.readLine();
            System.out.print("Alamat Perpus   : ");alamatPerpus=br.readLine();
            System.out.print("Jumlah Rak Buku : ");jumlahRak = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Orang    : ");jumlahOrang=Integer.parseInt(br.readLine());
            Perpus perpus = new Perpus(namaPerpus, alamatPerpus, jumlahRak, jumlahOrang);
            
            for(int i=0; i<jumlahRak; i++){
                System.out.println("\n\t*** Input Data Rak Buku ***");
                System.out.print("\tNama rak Buku     : ");namaRak = br.readLine();
                System.out.print("\tJenis Rak Buku    : ");jenisRak=br.readLine();
                System.out.print("\tJumlah Buku       : ");jumlahBuku=Integer.parseInt(br.readLine());
                RakBuku rakBuku = perpus.addRakBuku(namaRak, jenisRak, jumlahBuku);
                for(int j=0; j<jumlahBuku; j++){
                    System.out.println("\n\t\t*** Input Data Buku ***");
                    System.out.print("\t\tNama Buku       : ");nama=br.readLine();
                    System.out.print("\t\tPengarang Buku  : ");pengarang=br.readLine();
                    System.out.print("\t\tTahun Terbit    : ");tahunTerbit=Integer.parseInt(br.readLine());
                    System.out.print("\t\tHarga Buku      : ");harga=Float.parseFloat(br.readLine());
                    rakBuku.addBuku(nama, pengarang, tahunTerbit, harga);
                }
            }
            for(int i=0; i<jumlahOrang; i++){
                System.out.println("\n\t*** Input Data Denda ***");
                System.out.print("\tNama Orang          : ");namaOrang = br.readLine();
                System.out.print("\tTotal Hari Telat    : "); lama_hari = Integer.parseInt(br.readLine());
                Denda denda = new Denda(namaOrang, lama_hari);
                perpus.addDenda(denda);
            }
            perpus.showPerpus();
        }catch(Exception e){}
    }

}
