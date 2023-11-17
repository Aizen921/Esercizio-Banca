public class ContoBancario {
    private String iban;
    private double saldo;

    public ContoBancario(String iban,double saldo){
        this.iban = iban;
        this.saldo = saldo;
    }
    public String getIban(){
        return iban;
    }
    public String setIban(){
        return iban;
    }
    public double getSaldo(){
        return saldo;
    }
    public double setSaldo(){
        return saldo;
    }

    @Override
    public String toString() {
        return "ContoBancario{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    public void stampaDettagli() {
        System.out.println("iban:" + iban + "----" +" saldo:" + saldo);

    }
}
