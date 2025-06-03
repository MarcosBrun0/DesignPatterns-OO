package lista5.exe2;

public class FabricaFaseDificil implements FabricaDeInimigos{
    @Override
    public Inimigo criarInimigo() {
        return new Chefe();
    }
}
