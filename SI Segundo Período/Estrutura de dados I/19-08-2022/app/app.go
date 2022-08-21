package app

import (
	"app-command-line-linked-list/repository"
	_struct "app-command-line-linked-list/struct"
	"fmt"
	"github.com/urfave/cli"
)

// Simple app command line for test

// 1. Adicionar um numero no array - go run main.go append --number 20(Numero que vc deseja adicionar)
// 2. Buscar um numero do array - go run main.go search --number 20(Numero que vc deseja buscar)
// 3. Ordenar a lista - go run main.go order
// 4. Deletar um numero do array - go run main.go delete --number 20(Numero que vc deseja deletar)

func App() *cli.App {
	list := repository.List{}

	g1 := _struct.Array{20}
	g2 := _struct.Array{10}
	g3 := _struct.Array{70}
	g4 := _struct.Array{90}

	list.Append(g1)
	list.Append(g2)
	list.Append(g3)
	list.Append(g4)

	app := cli.NewApp()
	app.Name = "app-command-line-linked-list"
	app.Usage = "Linked List App"
	app.Version = "0.0.1"

	flags := []cli.Flag{
		cli.Int64Flag{
			Name:  "number",
			Value: 0,
		},
	}

	app.Commands = []cli.Command{
		{
			Name:   "display",
			Usage:  "List all number for struct Array",
			Action: func(c *cli.Context) error { list.Display(); return nil },
		},
		{
			Name:  "append",
			Usage: "Add number for struct Array",
			Flags: flags,
			Action: func(c *cli.Context) error {
				list.Append(_struct.Array{c.Int64("number")})
				list.Display()
				return nil
			},
		},
		{
			Name:  "search",
			Usage: "Search number for struct Array",
			Flags: flags,
			Action: func(c *cli.Context) error {
				number_search := list.Search(c.Int64("number"))
				fmt.Println(number_search)
				return nil
			},
		},
		{
			Name:  "order",
			Usage: "Order Linked List",
			Action: func(c *cli.Context) error {
				list.OrderLinkedList()
				list.Display()
				return nil
			},
		},
		{
			Name:  "delete",
			Usage: "Delete number for struct Array",
			Flags: flags,
			Action: func(c *cli.Context) error {
				list.Delete(c.Int64("number"))
				list.Display()
				return nil
			},
		},
	}

	return app
}
