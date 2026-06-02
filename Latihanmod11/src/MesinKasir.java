public class MesinKasir {
    public void bayar (int totalBelanja, int uangDiberikan) throws UangKurangException{
    if (uangDiberikan < totalBelanja) {
        throw new UangKurangException("KESALAHAN : Uang yang Anda masukkan kurang! ");
    }
    }

    public void cetakStruk(boolean statusPrinter) throws Exception {
        if (!statusPrinter) {
            throw new Exception(
                "Printer error: Kertas struk habis! "
            );
        }
        System.out.println(" Struk berhasil dicetak. ");
    }
}
