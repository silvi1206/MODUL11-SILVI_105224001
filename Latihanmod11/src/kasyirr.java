import java.util.InputMismatchException;
import java.util.Scanner;

public class kasyirr {
    public static void main(String[] args) {
        try {
            int listhrg[] = new int[3];
            Scanner inpt = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                System.out.println("Masukkan harga barang ke-" + (i + 1) + ": ");
                listhrg[i] = inpt.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println(" ERROR : Input harga harus angka! ");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(" ERROR : Jumlah barang yang dimasukkan melebihi kapasitas!");
        }
    }
}

