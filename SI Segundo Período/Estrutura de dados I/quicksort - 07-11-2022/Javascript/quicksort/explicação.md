**1. A função quicksort deve receber um array com todos os numeros que serão ordenados**

quicksort([
12,66,3,22,4,5,7,7,1
])

**2. Devemos definir quem sera o elemento PIVOT**

Nesse caso, por convenção o elemento pivot é o primeiro elemento do array, ou seja, o elemento 12.

**3. Devemos definir quem serão os elementos MENORES e MAIORES que o PIVOT**

Teremos que divider o array em 2 partes, uma com os elementos menores que o pivot e outra com os elementos maiores que o pivot.

Nesse caso, teremos:

**MENORES:** 3, 4, 5, 7, 7, 1

**MAIORES:** 66, 22

**4. Devemos criar um terceiro array com todos os elemento iguais ao PIVOT **

Nesse caso, teremos:

**PIVOT:** 12

**5. No final teremos**

quicksort([
3, 4, 5, 7, 7, 1
])
**MENORES:** 1

**PIVOT: 3**

**MAIORES:** 4, 5, 7, 7

quicksort([
66, 22
])
**MENORES:** 22

**PIVOT: 66**

**MAIORES:** vazio

**Apos todas as operações teremos esse resultado**
[1, 3, 4, 5, 7, 7, 12, 22, 66]
