## Padrão Singleton
  

Garante uma ``única instância`` de uma classe e fornece acesso global a ela

### Motivação: 
1. Evitar concorrencia

### Aplicações Comuns:
1. Configurações de APlicativos
2. Gerenciamento de cache
3. Registro central e logs

Acessar recurso desputado

### Criação:

- Fazer o construtor padrão privado
- Criar um método estático de criação que age como um construtor

```
  private class Singleton{
    private static SIngleton instance;
    
    private Singleton();

    public static Singleton getInstance(){
      if(instance == null){
        instance = new Singleton();
      }
    return instance;
    }

}
```
### Desvantagens 
- Pode se tornar estado global disfarçado
- Problemas em ambiente multithread


