package pbo2.pkg10116374.latihan27.hurufbesarkecil;
import java.util.Scanner;
/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBOIF2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menampilkan formatting
 *
 */
public class PBO210116374Latihan27HurufBesarKecil {

     public static String convertHurufBesar(String kalimat){
        String kalimatUpper = kalimat.toUpperCase();
        return kalimatUpper;
    }
    
    public static String convertHurufKecil(String kalimat){
        String kalimatlower = kalimat.toLowerCase();
        return kalimatlower;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = keyboard.nextLine();
        
        System.out.println("");
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Huruf Besar : " + convertHurufBesar(kalimat));
        System.out.println("Huruf Besar : " + convertHurufKecil(kalimat));
    }
    
}
