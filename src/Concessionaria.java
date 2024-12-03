public class Concessionaria {
    private CarroSedan sedan;
    private CarroSUV suv;

    public Concessionaria(FabricaDeCarros fabrica) {
        this.sedan = fabrica.criarCarroSedan();
        this.suv = fabrica.criarCarroSUV();
    }

    public void exibirCarros() {
        sedan.exibirInfoSedan();
        suv.exibirInfoSUV();
    }
}
