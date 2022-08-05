package main

import (
	"fmt"
	"bufio"
	"os"
	"strings"
)

func main() {
  r := bufio.NewReader(os.Stdin)
	
	fmt.Print("Informe o seu nome: ")
  name, err := r.ReadString('\n')
  if err != nil {}

	fmt.Print("Informe o saldo médio: ")
  balance, err := r.ReadInt('\n')
  if err != nil {}

	switch balance {
		case balance < 0 || balance <= 2000:
				fmt.Println("one")
		case 2:
				fmt.Println("two")
		case 3:
				fmt.Println("three")
	}

	fmt.Printf("\n\n")
  fmt.Printf("Dados informados: \n\nCódigo do produto: %s\nNome do produto: %s\nMarca do produto: %s\n", strings.TrimSpace(product_code),strings.TrimSpace(product_name),strings.TrimSpace(product_brand))
}