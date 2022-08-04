package main

import (
	"fmt"
	"bufio"
	"os"
	"strings"
)

func main() {
	// 1. Faça um programa que imprima na tela o seu nome, data de nascimento e sexo.
  r := bufio.NewReader(os.Stdin)
	
	fmt.Print("Informe seu nome: ")
  name, err := r.ReadString('\n')
  if err != nil {}

	fmt.Print("Informe sua data de nascimento: ")
  birthDate, err := r.ReadString('\n')
  if err != nil {}

	fmt.Print("Informe seu sexo: ")
  genre, err := r.ReadString('\n')
  if err != nil {}

	fmt.Printf("\n\n")
  fmt.Printf("Dados informados: \n\nNome: %s\nData de nascimento: %s\nSexo: %s\n", strings.TrimSpace(name),strings.TrimSpace(birthDate),strings.TrimSpace(genre))

}