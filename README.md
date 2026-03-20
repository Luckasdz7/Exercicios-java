# Exercicios-java
Exercicios de programação feitas em java para melhorar manuseio da linguagem e aprimorar logica de programação

# ☕ Exercícios de Java: Lógica e POO


Este repositório contém uma coleção de exercícios práticos desenvolvidos em **Java** com o objetivo de aprimorar o manuseio da linguagem e fortalecer a lógica de programação. O foco principal deste projeto é a aplicação de conceitos fundamentais da Programação Orientada a Objetos, como **Herança, Polimorfismo e Abstração**.

## 🚀 Tecnologias Utilizadas

* **Linguagem:** Java
* **Paradigma:** Orientado a Objetos (POO)
* **Ferramentas:** Git para versionamento de código e VS Code/Eclipse como IDE.

---

## 📂 Estrutura do Projeto

O projeto está organizado em pacotes que representam diferentes desafios técnicos:

### 🏦 Sistema de Cálculo de Impostos (`abstracaoexercicios`)
Neste módulo, foi implementado um sistema para cálculo de impostos de contribuintes, utilizando **classes abstratas** e **métodos abstratos**.
* **Pessoa (Abstract):** Classe base que define os atributos comuns (nome e renda anual) e o método abstrato `imposto()`.
* **PessoaFizica:** Implementa o cálculo com deduções de gastos com saúde e faixas de renda.
* **PessoaJuridica:** Implementa taxas baseadas no número de funcionários da empresa.
* **Formatação de Dados:** Utiliza `String.format("%.2f", ...)` para garantir que os valores monetários sejam exibidos corretamente no console.

### 📦 Gestão de Produtos (`Exxherança`)
Demonstração de **Herança** e **Polimorfismo** através de um sistema de etiquetas de preço.
* **Product:** Classe pai que gerencia produtos comuns.
* **ImportedProduct:** Calcula o preço total incluindo taxas alfandegárias (Customs fee).
* **UsedProduct:** Exibe a data de fabricação do produto, demonstrando o uso de datas em Java.
* **Sobrescrita (@Override):** Cada classe customiza o método `priceTag()` para exibir informações específicas.

---

## 🛠️ Como Executar

1. Certifique-se de ter o **JDK 11+** instalado em sua máquina.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/Luckasdz7/Exercicios-java.git](https://github.com/Luckasdz7/Exercicios-java.git)
