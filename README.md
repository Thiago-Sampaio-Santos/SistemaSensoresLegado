# Sistema de Sensores Refatorado com Padrões de Projeto (GOF)

## 📋 Descrição

Este projeto refatora um sistema legado de sensores de temperatura, umidade e luminosidade utilizando padrões de projeto GOF, com foco nos padrões **Adapter**, **Decorator**, **Factory Method** e **Singleton**. A refatoração tem como objetivo tornar o sistema mais modular, reutilizável e de fácil manutenção, especialmente em ambientes embarcados e IoT.

---

## 📁 Estrutura do Projeto

src/
├── adapters/    # Implementações dos Adapters (adaptam sensores legados)
├── core/        # Interfaces e classes base do sistema
├── factories/   # Criadores de sensores (Factory Method)
├── decorators/  # Decoradores para log, formatação e alerta
├── legado/      # Sensores legados (não modificados)
└── Main.java    # Ponto de entrada da aplicação (contém Main.java)

---

## 🚀 Como Executar

1.  **Pré-requisitos:** Certifique-se de ter o Java Development Kit (JDK) instalado (versão 8 ou superior).
2.  **Compilação:** Navegue até a pasta `src` no seu terminal e compile os arquivos `.java` utilizando o comando:
    ```bash
    javac -d ../bin */*.java
    ```
    (Este comando assume que você está na pasta `src` e compilará todos os arquivos `.java` em subdiretórios para a pasta `bin`.)
    Se houver erros de compilação, verifique as importações e as declarações de `package` em cada arquivo.
3.  **Execução:** Após a compilação bem-sucedida, navegue até a pasta `bin` no seu terminal e execute a aplicação:
    ```bash
    java app.Main
    ```
    (Se você moveu `Main.java` para a raiz de `src` sem o pacote `app`, execute `java Main` na pasta `bin`).

---

## 🧱 Padrões de Projeto Utilizados


- **Factory Method**: Utilizado para encapsular a criação dos sensores. Cada tipo de sensor possui sua própria fábrica (como `LuminosidadeFactory`, `TemperaturaFactory`, `UmidadeFactory`), que instancia sensores concretos com base na interface comum `Sensor`. Isso promove baixo acoplamento e permite incluir novos sensores sem alterar a lógica do sistema.


- **Singleton**: Aplicado na classe `SensorManager` para garantir que apenas uma instância do gerenciador de sensores exista em toda a aplicação. Isso é essencial para manter o controle centralizado e evitar conflitos de instância em sistemas embarcados ou distribuídos.


- **Adapter**: O padrão Adapter foi implementado para permitir que sensores legados pudessem ser utilizados no novo sistema, sem a necessidade de modificar suas implementações originais. Isso foi essencial para garantir a compatibilidade com componentes antigos, aproveitando o que já existia sem comprometer a nova arquitetura baseada em interfaces.

Os adaptadores encapsulam os sensores antigos e os tornam compatíveis com a nova interface `Sensor`. Foram implementados os seguintes adaptadores:
-   `SensorTemperaturaAdapter`: adapta o sensor legado `SensorTemperaturaLegado`.
-   `SensorUmidadeAdapter`: adapta o sensor legado `SensorUmidadeLegado`.
-   `SensorLuminosidadeAdapter`: adapta o sensor legado `SensorLuminosidadeLegado`.

Essa abordagem permite a reutilização de sensores existentes, facilitando a integração com o novo sistema e promovendo maior flexibilidade e manutenção do código.


- **Decorator**: Permite adicionar funcionalidades extras aos sensores de forma dinâmica e transparente, sem modificar sua estrutura original.

Decoradores implementados:
-   **LogDecorator**: registra logs a cada leitura do sensor.
-   **AlertaDecorator**: dispara alertas quando valores críticos são detectados (ex: temperatura $> 50^{\circ}C$).
-   **FormatadorDecorator**: altera o formato de saída dos dados para exibição mais amigável.
-   **SensorDecorator**: é a base abstrata para os decoradores. Ela implementa a interface `Sensor` e encapsula outro sensor, delegando as chamadas de método. As classes decoradoras concretas (`LogDecorator`, `FormatadorDecorator`, `AlertaDecorator`) estendem essa classe para adicionar funcionalidades específicas ao comportamento de leitura de dados dos sensores.

---


## ⚙️ Benefícios da Refatoração

- **Redução de Acoplamento**: O `SensorManager` interage apenas com a abstração `Sensor`, sem conhecer as implementações específicas. Isso facilita modificações e ampliações no sistema sem impacto em outras partes do código.

- **Aumento da Coesão**: Cada classe passou a ter uma única responsabilidade, seguindo o princípio SRP (Single Responsibility Principle), o que torna o sistema mais organizado e fácil de entender.

- **Facilidade para Extensão**: Com os padrões aplicados, é possível adicionar novos tipos de sensores ou novos comportamentos (como formatação ou logging) sem modificar código existente, alinhando-se ao OCP (Open/Closed Principle).

- **Reutilização do Legado**: Com o padrão Adapter, sensores antigos continuam funcionando na nova estrutura sem reescrita, preservando o investimento em código já validado.

- **Facilidade de Testes e Manutenção**: A separação entre criação, lógica de negócio e funcionalidades extras torna o sistema altamente testável e fácil de manter.

- **Pronto para Sistemas Embarcados/Modulares**: O controle centralizado com Singleton, o baixo acoplamento e a possibilidade de composição dinâmica com Decorators tornam o sistema ideal para ambientes restritos como sistemas embarcados ou aplicações modulares.

---

## 👤 Autores

- Hildemar Lemos de Santana Júnior 
- Kleberson de Jesus Sousa 
- Thiago Sampaio Santos 