package main

import "fmt"

func verifyYear(y int) (bool) {
	if y%400==0 || y%4==0 && y%100!=0 {
		return true;
	}
	return false;
}

func main() {
	/*
		7. Crie uma classe que leia um ano e imprima se o ano é bissexto ou não.
	*/
	
	var y int = 0
	fmt.Print("Digite o ano: ")
		_, err := fmt.Scan(&y)
		if err != nil {}
	
	if verifyYear(y) == true {
		fmt.Printf("%d, ano bissexto!\n",y)
		return
	}

	fmt.Printf("%d, não é ano bissexto!\n",y)
	return;
}