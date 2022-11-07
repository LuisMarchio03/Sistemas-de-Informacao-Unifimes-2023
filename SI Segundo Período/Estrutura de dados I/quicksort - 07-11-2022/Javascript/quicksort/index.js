function quicksort(array) {
  // Se o array tiver o tamanho 0, ele é vazio
  if (array.length === 0) return [];

  // Se o array tiver o tamanho 1, ele já está ordenado. Pois só existe um elemento
  if (array.length === 1) return array;

  // Determinando o PIVOT (Por convenção, é o primeiro elemento do array)
  let pivot = array[0];

  // Criando os arrays com os elemento menores que o PIVOT
  let head = array.filter((element) => element < pivot);

  // Todos os elementos que são iguais ao PIVOT (Sim, podem aver números repetidos)
  let equal = array.filter((element) => element === pivot);

  // Criando os arrays com os elemento maiores que o PIVOT
  let tail = array.filter((element) => element > pivot);

  // Retornando o array ordenado
  // CONCAT -> Concatena os arrays.... seria a mesma coisa que usar "+" para concatenar strings
  return quicksort(head).concat(equal).concat(quicksort(tail));
}

console.log("Array vazio: ", quicksort([]));

console.log("Array com um elemento: ", quicksort([5]));

console.log(
  "Array ordenado: ",
  quicksort([6, 8, 10, 34, 2, 3, 1, 5, 5, 6, 7, 5])
);
