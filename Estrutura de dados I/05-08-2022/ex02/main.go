package main

import (
	"fmt"
	"bufio"
	"os"
	"strings"
)

func main() {
	/*
		2. Faça um programa que receba três palavras lidas do teclado e armazene essas palavras
		em três variáveis diferentes. Depois, imprima na tela o valor dessas três variáveis.
	*/
	
  r := bufio.NewReader(os.Stdin)
	
	fmt.Print("Informe o código do produto: ")
  product_code, err := r.ReadString('\n')
  if err != nil {}

	fmt.Print("Informe o nome do produto: ")
  product_name, err := r.ReadString('\n')
  if err != nil {}

	fmt.Print("Informe a marca do produto: ")
  product_brand, err := r.ReadString('\n')
  if err != nil {}

	fmt.Printf("\n\n")
  fmt.Printf("Dados informados: \n\nCódigo do produto: %s\nNome do produto: %s\nMarca do produto: %s\n", strings.TrimSpace(product_code),strings.TrimSpace(product_name),strings.TrimSpace(product_brand))

}