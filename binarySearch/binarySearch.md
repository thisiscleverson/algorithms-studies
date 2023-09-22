# Busca Binária - Binary Search

Resumidamente, o algoritmo de pesquisa binária é um algoritmo eficiente que divide a lista repetidamente pela metade até encontrar o item desejado. Seu funcionamento é determinado pela busca da metade, analisando se o valor da metade está muito longe ou perto do elemento que queremos encontrar.

Diferentemente da **pesquisa simples** ou **pesquisa linear** onde analisamos elementos por elementos em uma lista de array, o algoritmo de pesquisa binária é um algoritmo mais performático, levando menos tempo que o algoritmo de busca linear

## Como o algoritmo funciona na lógica?

Imagine o seguinte cenário. Voce deseja procurar no dicionario a palavra **"programação"**, como a palavra começa com a letra **"p"** você claramente iria iniciar a busca pela metade do dicionario, analisaria se a busca está muito proximo ou longe da letra que você está buscando e descartaria o restante, até chegar na letra **"P"**.

### Vejamos outro exemplo

Imagine que você tem uma lista de números de 1 a 100 e deseja encontrar o número 40 nessa lista. Você poderia percorrer essa lista analisando todos os elementos e verificar se o valor corresponde a 40. Mas esse tipo de algoritmo leva muito tempo para processar. Para resolver isso, vamos usar o algoritmo de pesquisa binária. Ele começará a pesquisa pela metade da lista, verificando se o valor desejado está muito próximo ou longe, eliminando assim os valores mais baixos e mais altos. Por exemplo, para encontrar o número 40, ele pode começar pela metade do array, que seria o número 50. Cinquenta está muito acima de 40. Portanto, ele pode eliminar os valores acima de cinquenta e analisar os valores abaixo de 50. Agora, imaginamos que o algoritmo chuta um número, digamos 30. Trinta é um valor abaixo de 40, então os valores abaixo de 30 não serão analisados. Logo, 40 está entre 30 e 50. Com isso, o algoritmo terá que buscar o número 40 entre 30 e 50, sempre dividindo a busca pela metade.

## Funcionamento do Algoritmo

A função ```binarySearch``` vai procurar o ```item``` em um array ordena. Se o valor que queiramos encontrar está no array sera retornado a sua posição, se o valor não estiver no array será retornado ```None```.

* criando uma lista de 100 elementos de 1-100
```python
   listOfNumbers = list(range(1,101)) # [1,2,4,...,99,100]
```

* pegar o valor mais baixo e o valor mais alto
```python
   low  = 0 # 0 
   high = len(listOfNumbers) - 1 # 99
```

* pegar o valor do meio e salvar na variavel **kick (chute)**
```python
   middle = (low + high) / 2
   kick   = array[middle] 
```

* analisar se o valor do chute corresponde ao item que queiramos encontrar.
```python
   if kick == item:
      return middle
```
> nessa parte, se o valor do chute for igual o valor do item que queremos encontra, o algoritmo ira retornar a sua posição.

* o chute for **menor** que o valor que queiramos encontrar, vamos atualizar o valor de ```low``` para uma nova posição.
```python
   if kick < item:
      low = middle + 1 
```

* o chute for **maior** que o valor que queiramos encontrar, vamos atualizar o valor de ```high``` para uma nova posição.
```python
   if kick > item:
      high = middle - 1 
```
* se a função não encontrar o item na lista, a função ira retornar ```None```.

### Código completo

```python
listOfNumbers = list(range(1,101)) # [1,2,4,...,99,100]

# algoritmo de busca binária
def binarySearch(array, item):
   low  = 0
   high = len(array) - 1
   while low <= high:
      middle = int((high + low) / 2)
      kick   = array[middle]

      if kick == item:
         return middle
      elif kick > item:
         high = middle - 1
      else:
         low  = middle + 1
   return None
```

```python
print(binarySearch(listOfNumbers, 1)) # retorno = 0

print(binarySearch(listOfNumbers, -1)) # retorno = None
```

Observe que, na busca do número 40, a função retorna sua posição 39. Se você analisar a lista, verá que o elemento da 39ª posição será exatamente o número 40.

Agora, observe que, na busca do elemento -40, a função retorna None, pois o elemento não existe na lista

> lembrando que o elementos devem está ordenado para que o algoritmo funcione.

usando a notação big O (se você não sabe sobre notação Big O, indico você ver esse artigo sobre: [link](https://www.freecodecamp.org/portuguese/news/o-que-e-a-notacao-big-o-complexidade-de-tempo-e-de-espaco/)) para ver o quão eficiente, vamos ver que o algoritmo vai precisar de 7 tentativas para checar a lista de 100 elementos. Isso é representado por O(log2 n) onde n é o número de de elementos que tem na lista.

> Indico voce ler o post que eu fiz no TabNews explicando melhor sobre o funcionamento do algoritmo. [link do post](https://www.tabnews.com.br/Cleverson/algoritmo-de-pesquisa-binaria-binary-search)

