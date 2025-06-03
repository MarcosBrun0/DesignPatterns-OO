package lista5.exe2;

public class FabricaFaseFacil implements FabricaDeInimigos {

    public Inimigo criarInimigo() {
        return new Lacaio();
    }
}