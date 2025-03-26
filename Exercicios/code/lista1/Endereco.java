package lista1;

public class Endereco {
    private String rua;
    private String cidade;
    private int cep;


    void CadastrarEndereco(String rua, String cidade, int cep){
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;

    }

    @Override
    public String toString() {
        return rua + ", " + cidade + " - CEP: " + cep;
    }
    void mostrarEndereco(){
        System.out.println("Rua: " + this.rua);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Cep: " + this.cep);
    }

    }
