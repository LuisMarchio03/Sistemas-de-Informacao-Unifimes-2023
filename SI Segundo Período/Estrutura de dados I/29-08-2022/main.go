package main

import (
	"app-command-line-linked-list/app"
	"log"
	"os"
)

// Execução do app
func main() {
	application := app.App()
	err := application.Run(os.Args)
	if err != nil {
		log.Fatalf("%v", err)
	}
}
