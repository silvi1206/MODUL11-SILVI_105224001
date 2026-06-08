import java.util.ArrayList;

public class SistemReservasi {

    private ArrayList<KeretaApi> daftarKereta;

    public SistemReservasi() {

        daftarKereta = new ArrayList<>();

        daftarKereta.add(new KeretaApi( "K01", "Argo Bromo", "JKT - SBY",50));

        daftarKereta.add(new KeretaApi( "K02","Parahyangan","JKT - BDG",15));
    }

    public void tampilkanJadwal() {

        System.out.println("\n===== JADWAL KERETA =====");

        for (KeretaApi kereta : daftarKereta) {
            System.out.println(kereta);
        }
    }

    public void pesanTiket(String kodeKereta,String nik,String namaPenumpang,int jumlahTiket)

        throws RuteTidakDitemukanException,TiketHabisException {

        // Validasi NIK
       if (nik.length() != 16) {

            throw new DataPenumpangTidakValidException("NIK harus 16 digit.");
        }

        // Validasi NIK harus angka
        for (int i = 0; i < nik.length(); i++) {

            char c = nik.charAt(i); // Ambil karakter per karakter

            if (c < '0' || c > '9') {

                throw new DataPenumpangTidakValidException("NIK hanya boleh berisi angka.");
            }
        }

        // Validasi jumlah tiket
        if (jumlahTiket <= 0) {

            throw new IllegalArgumentException("Jumlah tiket harus lebih dari 0.");
        }

        KeretaApi keretaDitemukan = null;

        for (KeretaApi kereta : daftarKereta) {

            if (kereta.getKode().equalsIgnoreCase(kodeKereta)) {

                keretaDitemukan = kereta;
                break;
            }
        }

        if (keretaDitemukan == null) {

            throw new RuteTidakDitemukanException( "Kode kereta tidak ditemukan.");
        }

        if (jumlahTiket > keretaDitemukan.getSisaKursi()) {

            throw new TiketHabisException(keretaDitemukan.getNama(),keretaDitemukan.getSisaKursi());
        }

        keretaDitemukan.kurangiKursi(jumlahTiket);

        System.out.println("\n===== PEMESANAN BERHASIL =====");
        System.out.println("Nama Penumpang : "+ namaPenumpang);
        System.out.println("NIK: "+ nik);
        System.out.println("Kereta: "+ keretaDitemukan.getNama());
        System.out.println("Jumlah Tiket: "+ jumlahTiket);
        System.out.println("Sisa Kursi: "+ keretaDitemukan.getSisaKursi());
    }
}
