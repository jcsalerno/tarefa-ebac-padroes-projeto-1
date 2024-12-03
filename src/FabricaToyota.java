public class FabricaToyota implements FabricaDeCarros {
    public CarroSedan criarCarroSedan() {
        return new Corolla();
    }

    public CarroSUV criarCarroSUV() {
        return new RAV4();
    }
}
