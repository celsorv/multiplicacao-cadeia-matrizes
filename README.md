## Classe MatrixOrderOptimization

A classe MatrixOrderOptimization implementa um algoritmo para otimizar a ordem de multiplicação de matrizes. O objetivo do algoritmo é encontrar a ordem de multiplicação que requer o menor número de operações de multiplicação escalares. O algoritmo utilizado é conhecido como algoritmo de multiplicação encadeada de matrizes.

### O algoritmo funciona da seguinte forma:

Dadas as dimensões das matrizes a serem multiplicadas, o algoritmo cria uma tabela de custos (m) e uma tabela de índices (s).
A tabela de custos (m) é preenchida com os custos mínimos de multiplicação de todas as combinações de matrizes.
A tabela de índices (s) é preenchida com os índices das matrizes que produzem o custo mínimo para cada combinação.
A partir das tabelas de custos e índices, o algoritmo é capaz de determinar a ordem ótima de multiplicação das matrizes.
A classe MatrixOrderOptimization possui dois métodos principais:

matrixChainOrder(int[] dims): Esse método recebe um array com as dimensões das matrizes a serem multiplicadas e preenche as tabelas de custos e índices.
printOptimalParenthesizations(): Esse método imprime a ordem ótima de multiplicação das matrizes.
Exemplo de uso:

```
int[] dims = { 50, 20, 1, 10, 100 };
MatrixOrderOptimization mo = new MatrixOrderOptimization();
mo.matrixChainOrder(dims);
mo.printOptimalParenthesizations();
```

No exemplo acima, o array dims contém as dimensões das matrizes a serem multiplicadas. A classe MatrixOrderOptimization é instanciada e o método matrixChainOrder é chamado com o array dims como parâmetro. Esse método calcula a ordem ótima de multiplicação das matrizes e preenche as tabelas de custos e índices. Em seguida, o método printOptimalParenthesizations é chamado para imprimir a ordem ótima de multiplicação das matrizes.

Fonte: [Wikipedia - Multiplicação de cadeia de matrizes](https://pt.wikipedia.org/wiki/Multiplica%C3%A7%C3%A3o_de_cadeia_de_matrizes/?target=_blank)
