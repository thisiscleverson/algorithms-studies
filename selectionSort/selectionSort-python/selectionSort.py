listOfNumbers = [9,4,8,2,5,7,3,6,1]


def findSmallerElement(array):
   smaller = array[0]
   smaller_index = 0
   for i in range(1,len(array)):
      if array[i] < smaller:
         smaller = array[i]
         smaller_index = i
   return smaller_index

def selection_sort(array):
   newArray = []
   while(len(array)):
      smaller_index = findSmallerElement(array)
      newArray.append(array.pop(smaller_index))
      #print(array)
      #print(newArray)
   return newArray

print(f'Your original array is: {listOfNumbers}')
print(f'Your new array is: {selection_sort(listOfNumbers)}')

"""
algoritmo O(n²)
"""