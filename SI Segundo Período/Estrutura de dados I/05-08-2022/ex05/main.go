package main

import "fmt"

func checkIfTheNumberIsPrime(n int) (bool) {
	if n <= 1 {
		return false;
	}

	for i := 2; i < n; i++ {
		if n%i == 0 {
			return false;
		}
	}

	return true;
}

func main() {
	/*
		5. Crie uma classe que leia um número e descubra se ele é primo ou não.
	*/

	var n int
	fmt.Print("Informe o número: ")
  _, err := fmt.Scan(&n)
  if err != nil {}

	if checkIfTheNumberIsPrime(n) {
		fmt.Println(n, "é primo.")
		return
	}
	
	fmt.Println(n, "não é primo.")
	return
	
}