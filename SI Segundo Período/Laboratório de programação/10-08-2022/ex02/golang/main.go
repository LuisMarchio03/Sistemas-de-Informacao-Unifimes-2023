package main

import (
	"bufio"
	"fmt"
	"os"
)

func printInfos(name string, balance int, credit int) {
	fmt.Printf("\n\n")
	fmt.Printf("Informações: \n")
	fmt.Printf("======================================\n")
	fmt.Printf("Nome: %s\n", name)
	fmt.Printf("Saldo médio: %d\n", balance)
	fmt.Printf("Valor do crédito: %d%s\n", credit, "%")
	fmt.Printf("======================================\n")
	fmt.Printf("\n\n")
}

func main() {
  r := bufio.NewReader(os.Stdin)
	
	fmt.Print("Informe o seu nome: ")
  name, err := r.ReadString('\n')
  if err != nil {}

	var balance int
	fmt.Print("Informe o saldo médio: ")
		_, err = fmt.Scan(&balance)
		if err != nil {}

	switch {
		case balance > 0 && balance <= 2000:
			printInfos(name, balance, 0)
		case balance > 2000 && balance <= 6000:
			printInfos(name, balance, 20)
		case balance > 6000 && balance <= 12000:
			printInfos(name, balance, 30)
		case balance > 12000:
			printInfos(name, balance, 40)		
	}
}