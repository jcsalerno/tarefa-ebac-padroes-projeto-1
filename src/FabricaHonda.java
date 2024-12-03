public class FabricaHonda implements FabricaDeCarros {
    public CarroSedan criarCarroSedan() {
        return new Civic();
    }

    public CarroSUV criarCarroSUV() {
        return new CRV();
    }
}
