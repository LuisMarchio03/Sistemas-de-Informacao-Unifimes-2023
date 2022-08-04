package main

import "fmt"

func fibonacci(n int) (int) {
	if n == 0 {
		return 0;
	}

	if n <= 2 {
		return 1;
	}
	
	return fibonacci(n-1) + fibonacci(n-2);
}

func main() {
	/*
		6. Crie uma classe que leia um número e imprima sua seqüência Fibonacci.
	*/

	var n int = 0
	var total_terms int

	fmt.Print("Digite a quantidade de termos: ")
		_, err := fmt.Scan(&total_terms)
		if err != nil {}
	
	for i := 0; n < total_terms; i++ {
		n = fibonacci(i);
		fmt.Println(n)
	}  
}