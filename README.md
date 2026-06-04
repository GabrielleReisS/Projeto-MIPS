 Simulador e Montador MIPS 

Este projeto consiste na implementação de um simulador e montador para a arquitetura MIPS de 32 bits, desenvolvido inteiramente em **Java**. O sistema permite a execução de operações básicas em linguagem de montagem (Assembly), simulando o funcionamento interno de um processador MIPS, incluindo a manipulação de registradores, instruções aritméticas, lógicas e controle de fluxo.

 Funcionalidades

* **Suporte a Instruções:** Processamento e decodificação de instruções MIPS dos formatos R (Register), I (Immediate) e J (Jump).
* **Conversão Binária:** Tradução de instruções em linguagem de montagem para código de máquina (binário) correspondente à arquitetura de 32 bits.
* **Leitura de Arquivo Externo:** O sistema é capaz de buscar e ler arquivos de texto contendo as instruções de forma dinâmica, diretamente de unidades de armazenamento removíveis.
* **Arquitetura Orientada a Objetos:** Código estruturado utilizando princípios de POO para facilitar a manutenção e o encapsulamento.

 Estrutura do Projeto

O código foi modularizado para separar responsabilidades de forma clara:

* `Main.java`: Ponto de entrada e execução principal do simulador.
* `Conversor.java` e `ConversorBinario.java`: Classes responsáveis pela tradução de dados, formatação e conversão para a base binária.
* `Dicionario.java`: Estrutura de dados para o mapeamento de mnemônicos, registradores e seus respectivos *opcodes*/*funct*.
* `TipoR.java`, `TipoI.java`, `TipoJ.java`: Classes dedicadas ao tratamento específico e máscara de bits de cada formato de instrução MIPS.

 Como Executar

 Pré-requisitos
* Ter o **Java Development Kit (JDK)** instalado na sua máquina (versão 8 ou superior).
* Um arquivo de texto (`.txt`) contendo as instruções MIPS escritas em formato Assembly.

 Passos para compilação e execução

1. Clone este repositório para a sua máquina local:
```bash
   git clone [https://github.com/GabrielleReisS/Projeto-MIPS.git](https://github.com/GabrielleReisS/Projeto-MIPS.git)
