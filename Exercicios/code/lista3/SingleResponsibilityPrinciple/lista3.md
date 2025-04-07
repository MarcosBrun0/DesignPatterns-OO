### 1. Princípio da Responsabilidade Única (SRP)

``` exercicio 1
package lista3.SingleResponsibilityPrinciple;

class Relatorio {
public void gerarRelatorio() { // Gera um relatório
}

    public void salvarEmArquivo(String nomeArquivo) {
// Salva o relatório em um arquivo }
}
}
// A ideia é que esse codigo fere o principio da responsabilidade unica

````
Esse código fere o princípio da responsabilidade única(SRP)
pois a class  ``Relatorio`` tem duas funções, nesse caso ela pode tanto gerar o relatorio quanto salva-lo, 
de acordo com o principio isso é um problema

para resolver isso basta dividir as funções

```
// Responsável apenas por gerar o conteúdo do relatório
class GeradorRelatorio {
    public String gerarRelatorio() {
        // Gera o conteúdo do relatório
        return "Conteúdo do Relatório";
    }
}

// Responsável apenas por salvar relatórios em arquivos
class RelatorioArquivo {
    public void salvarEmArquivo(String nomeArquivo, String conteudo) {
        // Lógica para salvar o conteúdo em um arquivo
        System.out.println("Salvando '" + nomeArquivo + "' com conteúdo: " + conteudo);
    }
}
```

### 2. Princípio Aberto-Fechado (OCP)
O código abaixo viola o OCP. Reescreva-o para permitir novos descontos sem modificar a classe
existente:
```
class CalculadoraDesconto {
public double calcular(String tipoCliente, double valor) {
if (tipoCliente.equals("comum")) {
return valor * 0.95;
} else if (tipoCliente.equals("vip")) {
return valor * 0.90;
} else {
return valor;
}
}
```
#### O que é esse principio?

``Ele estabelece que as entidades de software devem ser abertas para extensão, mas fechadas para modificação. ``

``` ```


