package main

import "fmt"

func main() {
	/*
		4. Crie uma classe que leia um número e imprima alternadamente os números pares
		menos ou iguais aquele número lido.
	*/

	var n int
	
	fmt.Print("Informe o número: ")
  _, err := fmt.Scan(&n)
  if err != nil {}

	for i := 1; i <= n; i++ {
    if i%2 == 0 {
			fmt.Println(i)
    }
	}
}