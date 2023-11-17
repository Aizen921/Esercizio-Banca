public class Main {

    public static void main(String[] args) {
        ContoBancario contoBancario1 = new ContoBancario("IT012345678910111213", 100.0);
        ContoBancario contoBancario2 = new ContoBancario("IT131211109876543210", 500.0);
        Banca banca = new Banca("Intesa Sanpaolo", 10);
        System.out.println(banca.getNomeBanca());
        banca.aggiungiConto(contoBancario1);
        banca.aggiungiConto(contoBancario2);
        System.out.println("Numero Attuale Conti: "+ banca.getNumConti());
        banca.visualizzaInformazioni();
        System.out.println("Saldo Totale: " + banca.saldoTotale());
    }
}

