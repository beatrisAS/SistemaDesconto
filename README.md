# Sistema de Desconto Progressivo para Loja Online

Este projeto é um programa em Java que implementa um sistema de desconto progressivo para uma loja online. O sistema aplica descontos no valor total da compra de acordo com a faixa de preço, ajudando os clientes a economizarem mais conforme o valor da compra aumenta.

## Regras de Desconto

O sistema aplica as seguintes regras de desconto:
- **Compras abaixo de R$ 200,00**: 5% de desconto.
- **Compras entre R$ 200,00 e R$ 299,99**: 10% de desconto.
- **Compras acima de R$ 300,00**: 15% de desconto.

## Funcionalidades

- Solicita ao cliente o valor total da compra.
- Calcula automaticamente o desconto aplicável com base nas regras acima.
- Exibe o valor do desconto e o valor final a ser pago após a aplicação do desconto.

## Exemplo de Execução

```shell
Digite o valor total da compra: R$ 250.00
Valor do desconto: R$ 25.00
Valor final a ser pago: R$ 225.00
```

## Estrutura do Projeto

O projeto é composto por um único arquivo Java:

- **SistemaDesconto.java**: Implementa toda a lógica de cálculo do desconto e interação com o usuário.

## Como Executar

1. Certifique-se de que o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) está instalado em seu ambiente.
2. Clone este repositório:

   ```shell
   git clone https://github.com/seu_usuario/SistemaDesconto.git
   ```

3. Navegue até o diretório do projeto:

   ```shell
   cd SistemaDesconto
   ```

4. Compile o arquivo Java:

   ```shell
   javac SistemaDesconto.java
   ```

5. Execute o programa:

   ```shell
   java SistemaDesconto
   ```

## Estrutura do Código

O código possui uma estrutura simples e está organizado em blocos, com comentários explicativos para facilitar a compreensão. Cada etapa – desde a entrada do valor da compra até o cálculo do desconto e a exibição dos resultados – está devidamente comentada.

## Critérios de Avaliação

Este projeto atende aos seguintes critérios de qualidade:
- **Organização do código**: código bem estruturado e comentado.
- **Aplicação dos conceitos**: uso de estruturas de controle de fluxo, como condicionais, para cálculo progressivo de desconto.
- **Simplicidade e clareza**: otimização dos comandos para eficiência e legibilidade.

## Autor

Desenvolvido por [@beatrisAS](https://github.com/beatrisAS).
