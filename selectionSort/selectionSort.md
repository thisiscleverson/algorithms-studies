# Ordenação por seleção - Selection Sort

O algoritmo de ordenação por seleção, é um algoritmo que organiza os elementos do array/lista em ordem crescente.

**Vaja o código:**
```Python
listOfNumbers = [9,4,8,2,5,7,3,6,1]

def findSmallerElement(array):
   smaller = array[0]
   smaller_index = 0
   for i in range(1,len(array)):
      if array[i] < smaller:
         smaller = array[i]
         smaller_index = i
   return smaller_index

def sortBySelection(array):
   newArray = []
   for i in range(len(array)):
      smaller_index = findSmallerElement(array)
      newArray.append(array.pop(smaller_index))
   return newArray

print(f'Your original array is: {listOfNumbers}')
print(f'Your new array is: {sortBySelection(listOfNumbers)}')
```
#

Observe que no código exite uma lista com 9 elementos, tudo organizado aleatoriamente.  
```Python 
listOfNumbers = [9,4,8,2,5,7,3,6,1]
```

Para, ordenar a lista em ordem crescente, primeiro devemos saber qual é o menor número que está na lista. Para isso, vamos criar uma função que vai buscar o menor número que está no array.
```Python
def findSmallerElement(array):
   smaller = array[0]
   smaller_index = 0
   for i in range(1,len(array)):
      if array[i] < smaller:
         smaller = array[i]
         smaller_index = i
   return smaller_index
```
A função tera como referencia o primeiro elemento da lista. Com isso usando um `for` podemos verificar cada elemento da lista e procurar o menor elemento. Se o elemento **n** (array[i]) for menor que o número de referencia, atualizamos as variaveis como um novo menor número e seu index (smaller, smaller_index). Isso loop vai continuar até chegar no ultimo elemento da lista, retornando no final o index do menor número.

Agora, com o menor número encontrado, podemos construir um novo array e remover o menor número do array/lista.
```Python
def sortBySelection(array):
   newArray = []
   for i in range(len(array)):
      smaller_index = findSmallerElement(array)
      newArray.append(array.pop(smaller_index))
   return newArray
```

> a função `pop` var remover o elemento da lista de acordo com o index, e irá retorna um novo array sem o elemento que foi removido.