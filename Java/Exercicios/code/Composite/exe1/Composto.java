package Composite.exe1;

import java.util.ArrayList;
import java.util.List;

public class Composto implements Componente {
    List<Componente>item=new ArrayList<Componente>();
    private String todosComponentes = "";

    public Composto(Componente componente){
        item.add(componente);

    }

    @Override
    public String operacao() {

        for (Componente item : item) {
                todosComponentes += item.operacao();
        }
        return "caixa"+todosComponentes;
    }
}
