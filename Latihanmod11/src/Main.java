public class Main {
    public static void main(String[] args) {

        //umur
        try {
            pelanggans pelanggan1 = new pelanggans();
            pelanggan1.daftarMember(10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Simulasi pemesanan kopi
        try{
            pelanggans pelanggan1 = new pelanggans();
            pelanggan1.pesanKopi(10);
        } catch (KopiHabisException e) {
            System.out.println(e.getMessage());
        }

        //uang kurang
        try {
            MesinKasir kasir = new MesinKasir();
            kasir.bayar(50000, 30000);
        } catch (UangKurangException e) {
            System.out.println(e.getMessage());
        }
        //kasir
        try {
            MesinKasir kasir = new MesinKasir();
            kasir.cetakStruk(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" ===== Terima kasih telah berkunjung ke Cafe Java Bean. Program kasir ditutup =====");
        }

    }
    
}
