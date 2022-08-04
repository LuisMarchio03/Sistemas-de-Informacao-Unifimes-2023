package main

import "fmt"

func main() {
	/*
		9. O objetivo deste exercício é ler dois números que irão formar a base e a altura de um
		retângulo. Depois de lido os dois números, a programa deverá criar um retângulo de *
		(asteriscos) com a base e a altura informada.
	*/

	var b, h int

	fmt.Print("Digite a Base do retângulo: ")
		_, err := fmt.Scan(&b)
		if err != nil {}

	fmt.Print("Digite a Altura do retângulo: ")
		_, err = fmt.Scan(&h)
		if err != nil {}	

	
	fmt.Printf("\n") // apenas por questões visuais

	var aux string = "";
	for i := 1; i <= h; i++ {
		for j := 1; j <= b; j++ {
			aux = aux + "*";
		}
		
		fmt.Printf("%s\n",aux)

		aux = "";
	}

	fmt.Printf("\n") // apenas por questões visuais

	return
}