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
        String namaperpus, alamatperpus;
        String namaRak, jenisRak;
        String nama, pengarang;
        int jumlahRak, jumlahBuku, tahunTerbit;
        float harga;
        
        try{
            System.out.println("*** Input Data Perpus ***");
            System.out.println("Nama perpus     : ");namaperpus=br.readLine();
            System.out.println("Alamat Perpus   : ");alamatperpus=br.readLine();
            System.out.println("Jumlah Rak Buku : ");jumlahRak = Integer.parseInt(br.readLine());
            Perpus perpus = new perpus(namaPerpus, alamatPerpus, jumlahRak);
            
            for(int i=0; i<jumlahRak; i++){
                System.out.println("\n\t*** Input Data Rak Buku ***");
                System.out.println("\tNama rak Buku     : ");namaRak = br.readLine();
                System.out.println("\tJenis Rak Buku    : ");jenisRak=br.readLine();
                System.out.println("\tJumlah Buku       : ");jumlahBuku=Integer.parseInt(br.readLine());
                
                for(int j=0; j<jumlahBuku; j++){
                    System.out.println("\n\t*** Input Rak Buku ***");
                    System.out.println("Nama Buku       : ");nama=br.readLine();
                    System.out.println("Pengarang Buku  : ");pengarang=br.readLine();
                    System.out.println("Tahun Terbit    : ");tahunTerbit=Integer.parseInt(br.readLine());
                    System.out.println("Harga Buku      : ");harga=Float.parseFloat(br.readLine());
                }
            }
            perpus.showPerpus();
        }catch(Exception e){}
    }

}
