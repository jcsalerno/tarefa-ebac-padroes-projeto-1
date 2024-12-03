# Fábrica de Carros - Projeto de Padrões de Projeto - EBAC

Este projeto implementa o padrão de projeto **Abstract Factory** para criar uma aplicação que simula a fabricação de diferentes tipos de carros (Sedan e SUV) de diferentes fabricantes (Toyota e Honda). Ele demonstra como usar o padrão para criar famílias de objetos relacionados sem especificar suas classes concretas.

---

## 📋 Estrutura do Projeto

O projeto é organizado conforme o padrão **Abstract Factory**, que permite a criação de objetos relacionados por meio de uma interface comum para fábricas.

### Principais Componentes

1. **Produtos Abstratos**:
    - `CarroSedan`: Interface para carros do tipo Sedan.
    - `CarroSUV`: Interface para carros do tipo SUV.

2. **Produtos Concretos**:
    - Implementações de `CarroSedan`:
        - `Corolla` (Toyota)
        - `Civic` (Honda)
    - Implementações de `CarroSUV`:
        - `RAV4` (Toyota)
        - `CRV` (Honda)

3. **Fábrica Abstrata**:
    - `FabricaDeCarros`: Interface que define métodos para criar os diferentes tipos de carros.

4. **Fábricas Concretas**:
    - `FabricaToyota`: Cria carros da Toyota (Sedan e SUV).
    - `FabricaHonda`: Cria carros da Honda (Sedan e SUV).

5. **Cliente**:
    - `Concessionaria`: Usa uma fábrica para criar e exibir os carros sem conhecer suas implementações concretas.

6. **Classe Principal**:
    - `Main`: Demonstra a criação de diferentes carros usando as fábricas de Toyota e Honda.

---

## 📦 Estrutura de Diretórios

```plaintext
src/
├── CarroSedan.java       // Interface para carros Sedan
├── CarroSUV.java         // Interface para carros SUV
├── Corolla.java          // Implementação do Corolla (Toyota Sedan)
├── Civic.java            // Implementação do Civic (Honda Sedan)
├── RAV4.java             // Implementação do RAV4 (Toyota SUV)
├── CRV.java              // Implementação do CR-V (Honda SUV)
├── FabricaDeCarros.java  // Interface da fábrica abstrata
├── FabricaToyota.java    // Fábrica concreta para carros Toyota
├── FabricaHonda.java     // Fábrica concreta para carros Honda
├── Concessionaria.java   // Classe cliente
└── Main.java             // Classe principal 
```

### Saída esperada

Concessionária Toyota:
Modelo: Corolla | Tipo: Sedan | Fabricante: Toyota
Modelo: RAV4 | Tipo: SUV | Fabricante: Toyota

Concessionária Honda:
Modelo: Civic | Tipo: Sedan | Fabricante: Honda
Modelo: CR-V | Tipo: SUV | Fabricante: Honda



### Explicação do Padrão

O padrão **Abstract Factory** é ideal para cenários em que:

- É necessário criar objetos relacionados (neste caso, carros de diferentes tipos e fabricantes).
- Queremos evitar acoplamento direto entre o cliente e as classes concretas.
- Precisamos adicionar novas famílias de produtos (por exemplo, outro fabricante) sem modificar o código existente.



