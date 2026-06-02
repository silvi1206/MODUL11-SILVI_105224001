public class Main {
    public static void main(String[] args) throws Exception {
        AkunBank akun= new AkunBank();
        try {
            akun.tarikTunai(2500000);
            akun.tarikTunai(500000);
            akun.tarikTunai(5500000);
        } catch (SaldoTidakMencukupiException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            akun.transfer(5000000);
            akun.transfer(3000000);
            akun.transfer(2500000);
        } catch (BatasTransferHarianException | SaldoTidakMencukupiException e) {
            System.out.println("Error: " + e.getMessage());
        }

    
    }

}

    
