import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SistemReservasi reservasi =
                new SistemReservasi();

        boolean jalan = true;

        try {

            while (jalan) {

                try {

                    System.out.println("\n=====================");
                    System.out.println("     JAVA EXPRESS");
                    System.out.println("=====================");
                    System.out.println("1. Lihat Jadwal");
                    System.out.println("2. Pesan Tiket");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih Menu : ");

                    int pilihan =input.nextInt();
                    input.nextLine();
                    switch (pilihan) {
                        case 1:
                            reservasi.tampilkanJadwal();
                            break;
                        case 2:
                            System.out.print("Kode Kereta : ");
                            String kode =input.nextLine();
                            System.out.print("NIK : ");
                            String nik =input.nextLine();
                            System.out.print("Nama Penumpang : ");
                            String nama =input.nextLine();
                            System.out.print("Jumlah Tiket : ");
                            int jumlah =input.nextInt();
                            input.nextLine();
                            reservasi.pesanTiket(kode, nik,nama,jumlah);
                            break;
                        case 3:
                            System.out.println( "\nTerima kasih telah menggunakan JAVA EXPRESS.");
                            jalan = false;
                            break;

                        default:
                            System.out.println( "Menu tidak tersedia.");
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka!");

                    input.nextLine();
                }
                catch (DataPenumpangTidakValidException e) {
                    System.out.println("Error Data Penumpang : "+ e.getMessage());
                }
                catch (RuteTidakDitemukanException e) {
                    System.out.println("Error Rute : "+ e.getMessage());
                }
                catch (TiketHabisException e) {
                    System.out.println("Tiket untuk "+ e.getNamaKereta()+ " tidak mencukupi.");
                    System.out.println("Sisa kursi tersedia : " + e.getSisaKursi());
                }
                catch (IllegalArgumentException e) {
                    System.out.println( e.getMessage());
                }
                catch (Exception e) {
                    System.out.println("Terjadi kesalahan : " + e.getMessage());
                }
            }

        } finally {
            input.close();
            System.out.println( "\nScanner berhasil ditutup.");
        }
    }
}