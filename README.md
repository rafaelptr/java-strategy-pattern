
# Java Strategy Pattern

Estudo fazendo um projeto de exemplo de um Strategy Design Pattern em Java   
🐈 - Aplica recompensas de snacks para os gatos de acordo com a pontuação

## Estrutura

Baseando em arquitetura hexagonal.
Nome de classes e metódos em Inglês, com documentação em PT-BR

```
.
├── domain
│   ├── model
│   │   └── Cat.java 🐈
│   ├── service
│   │   └── RewardsContext.java 🏆
│   └── strategy
│       ├── RewardsStrategy.java 🏅
│       ├── LowScoreRewardsStrategy.java 🥉
│       ├── MediumScoreRewardsStrategy.java 🥈
│       ├── HighScoreRewardsStrategy.java 🥇
│       └── RewardsFactory.java 🏅
├── adapters
│   └── in
│       └── Main.java 🚀
└── README.md 📝
```

- **domain.model**: o gato 🐈
- **domain.strategy**: definir recompensas 🏅
- **domain.service**:  aplicar recompensas 🏆
- **adapters.in**: executar a aplicação 🚀


## Como funciona

1. `RewardsStrategy` interface para definir as estratégias de recompensas
2. (`LowScoreRewardsStrategy`, `MediumScoreRewardsStrategy`, `HighScoreRewardsStrategy`) implementação das estratégias de recompensas pela pontuação
3. `RewardsFactory` define a estratégia com base na pontuação do gato
4. `RewardsContext` aplica a recompensa
5. `Main` inicia a aplicação e imprime os textos :)


## Ambiente
- Java 17 ou mais novo
- VS Code / Intellij ou qualquer IDE ou até mesmo linha de comando


## Resultado
- Vai sair o seguinte :)

    ```
    Bico has a medium score of 50 and got 3 catsnacks.
    Beerus has a high score of 120 and got 5 catsnacks.
    Polly has a high score of 100 and got 5 catsnacks.
    Budo has a low score of 49 and got 1 catsnacks.
    ```