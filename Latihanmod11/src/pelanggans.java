
public class pelanggans {
    private String Namaaaa;
    private Integer Umurrrr;
    private int stokkopi;

    pelanggans(){
        this.stokkopi = 5;
    }

    Integer getUmurrrr() {
        return Umurrrr;
    }

    void setUmurrrr(Integer Umurrrr) {
        this.Umurrrr = Umurrrr;
    }

    public void daftarMember(int Umurrrr) {
        if (Umurrrr < 17) {
        throw new IllegalArgumentException("ERROR : Maaf, umur belum cukup untuk mendaftar sebagai member.");
        } else {
        System.out.println(" Selamat datang, " +"! Anda berhasil mendaftar sebagai member VIP .");
        }
    }

    public void pesanKopi(int jumlahPesanan)  {
        if (jumlahPesanan > stokkopi){
            throw new KopiHabisException( "ERROR : Stok kopi tidak mencukupi. Stok tersedia:  " + stokkopi);
        } else {
            stokkopi -= jumlahPesanan;
            System.out.println("Pesanan kopi berhasil. Sisa stok kopi: " + stokkopi);
        }

        
    }
}

    


