import java.util.Scanner;
import java.util.InputMismatchException; 

class kalkulator {
    public void hitungPembagian(int pembilang, int penyebut) {
        try {
            int hasil = pembilang / penyebut;
            System.out.println("Hasil: "   + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan: Pembagian dengan angka nol tidak diperbolehkan!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        kalkulator kal = new kalkulator();
        
        try {
            System.out.print("Masukkan pembilang: ");
            int pembilang = input.nextInt(); 
            System.out.print("Masukkan penyebut: ");
            int penyebut = input.nextInt(); 
            
            kal.hitungPembagian(pembilang, penyebut);
            
        } catch (InputMismatchException e) { 
            System.out.println("Kesalahan: angka 0 tidak diterima");
        } finally {
            input.close();
            System.out.println("Proses kalkulasi selesai dan resource memori telah dibersihkan.");
        }
    }
}