
arrayOfNumbers = list(range(1, 101)) # numero entre 1-100 -> [1,2,3,...,99,100]


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


def linearSearch(array, item):
   for index in range(0, len(array)):
      if array[index] == item:
         return index
   return None 


# algoritmo de busca binária
print('algoritmo de busca binária')
print(binarySearch(arrayOfNumbers, 40))   # retorno = 40
print(binarySearch(arrayOfNumbers, -40))  # retorno = None

# algoritmo de busca linear
print('\nalgoritmo de busca linear')
print(linearSearch(arrayOfNumbers, 40))
print(linearSearch(arrayOfNumbers, -40)) 




