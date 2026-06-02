public class AkunBank {
    private String nomorRekening;
    private double saldo;
    private int totalTransferHarian;

    public AkunBank() {
        this.nomorRekening = "8463725287";
        this.saldo = 2000000;
        this.totalTransferHarian = 0;
    }

    public void tarikTunai(double jumlah) throws SaldoTidakMencukupiException {
        if (jumlah > saldo) {
            
            throw new SaldoTidakMencukupiException("Saldo tidak mencukupi untuk melakukan penarikan.");
        }else{
            saldo -= jumlah;
        }
    }

    public void transfer(double nominal) throws SaldoTidakMencukupiException, BatasTransferHarianException, SaldoTidakMencukupiException {
        if (totalTransferHarian + nominal > 10000000) {
            throw new BatasTransferHarianException("Batas transfer harian sebesar 10 juta telah terlampaui.");
        } else if (nominal > saldo) {
            throw new SaldoTidakMencukupiException("Saldo tidak mencukupi untuk melakukan transfer. " );
        } else {
            saldo -= nominal;
            totalTransferHarian += nominal;
            System.out.println("Transfer sebanyak " + nominal + " berhasil dilakukan !!.  Sisa saldo: " + saldo);
        }
    }
}