

def fat(x) -> int:
   if x == 1:
      return 1
   else:
      return x * fat(x - 1)


number =  3
print(f'{number}! = {fat(number)}')