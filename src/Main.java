public class Main {
    public static void main(String[] args) {
        FabricaDeCarros fabricaToyota = new FabricaToyota();
        Concessionaria concessionariaToyota = new Concessionaria(fabricaToyota);
        System.out.println("Concessionária Toyota:");
        concessionariaToyota.exibirCarros();

        FabricaDeCarros fabricaHonda = new FabricaHonda();
        Concessionaria concessionariaHonda = new Concessionaria(fabricaHonda);
        System.out.println("\nConcessionária Honda:");
        concessionariaHonda.exibirCarros();
    }
}
