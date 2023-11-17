import java.util.Arrays;

public class Banca {
    private String nomeBanca;
    private int numConti;

    private ContoBancario[] conti;

    public Banca(String nomeBanca,int maxConti) {
        this.nomeBanca = nomeBanca;
        this.conti=new ContoBancario[maxConti];
        this.numConti=0;

    }

    public String getNomeBanca(){

        return nomeBanca;
    }
    public String setNomeBanca(){
        return nomeBanca;
    }
    public int getNumConti(){
        return numConti;
    }
    public int setNumConti(){
        return numConti;
    }
    public ContoBancario[] getConti(){
        return conti;
    }
    public void setConti (ContoBancario[] conti){
        this.conti=conti;
    }


    public void aggiungiConto(ContoBancario conto){
        if (numConti < conti.length){
            conti[numConti]=conto;
            numConti++;
        }
        else{
            System.out.println("Numero Massimo Conti Raggiunto") ;

        }
    }

    public void visualizzaInformazioni() {
        System.out.println("Informazione Conti: " + nomeBanca + ":");
        for (int i = 0; i < numConti; i++) {
            conti[i].stampaDettagli();
        }
    }
    public double saldoTotale(){
        double saldoTotale=0;
        for(int i = 0; i< numConti; i++){
            saldoTotale+=conti[i].getSaldo();
        }
        return saldoTotale;
    }


    @Override
    public String toString() {
        return "Banca{" +
                "nomeBanca='" + nomeBanca + '\'' +
                ", numConti=" + numConti +
                ", conti=" + Arrays.toString(conti) +
                '}';
    }
}

