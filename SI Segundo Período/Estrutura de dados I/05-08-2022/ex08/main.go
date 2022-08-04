package main

import "fmt"

func main() {
	/*
		8. Crie uma classe que leia um número e calcule o seu fatorial.
	*/

	var n int
	var fat int = 1
	var count int = 1

	fmt.Print("Digite o número a ser calculado o seu fatorial: ")
		_, err := fmt.Scan(&n)
		if err != nil {}

	// do-while
	for ok := true; ok; ok = count < 2 {
		for i := 1; i <= n; i++ {
			fat = fat * i
		}

		fmt.Printf("!%d = %d\n", n, fat)
		count++
	}  

	return
}