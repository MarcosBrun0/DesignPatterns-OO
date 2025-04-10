## Prototype
Padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.

    
    //não é um prototype

    class copiar {
        int num 
    }

    main
    ----
    c1 = new copiar(3);
    Ic1.num = 3
    c2 = new copiar()
    c2.num = c1.num;

    // não se trata de copiar o objeto em si, mas o que tem dentro dele

- O prototype clona o objeto através de uma interface 
- utiliza um metodo `clone`
``` 


```
