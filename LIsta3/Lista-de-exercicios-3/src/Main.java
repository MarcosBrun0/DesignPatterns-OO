/*

Fabrica de componentes produz botao e janel
- Fabrica Moderna
- Fabrica Classica
 */



interface Botao{
    void clicar();
        }
interface Janela{
    void arrastar();
}
 interface FabricaDeComponentes{
    public  Botao criarBotao();
    public  Janela criarJanela();

}

class FabricaModerna implements FabricaDeComponentes{
    public Botao criarBotao(){
        return new BotaoModerno();
    }
}
class FabricaClassica implements FabricaDeComponentes{
    public Botao criarBotao(){
        return new BotaoClassico();
    }
}