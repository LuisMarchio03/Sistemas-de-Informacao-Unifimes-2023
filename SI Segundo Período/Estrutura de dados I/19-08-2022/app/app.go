package app

import (
	"app-command-line-linked-list/repository"
	_struct "app-command-line-linked-list/struct"
	"fmt"
	"github.com/urfave/cli"
)

// Simple app command line for test

// 1. Adicionar um numero no array - go run main.go append --number 20(Numero que vc deseja adicionar)
// 2. Adicionar um numero na primeira posição do array - go run main.go append --number 20 --append_head
// 3. Buscar um numero do array - go run main.go search --number 20(Numero que vc deseja buscar)
// 4. Deletar um numero do array - go run main.go delete --number 20(Numero que vc deseja deletar)
// 5. Deletar o primeiro numero do array - go run main.go delete --delete_head
// 6. Deletar o ultimo numero do array - go run main.go delete --delete_tail
// 7. Exibir a list - go run main.go display
// 8. Exibir a list ordenada - go run main.go order
// 9. Verificar se a list está vazia - go run main.go empty

func App() *cli.App {
	list := repository.List{}

	g1 := _struct.Array{20}
	g2 := _struct.Array{10}
	g3 := _struct.Array{70}
	g4 := _struct.Array{90}

	list.Append(g1, false)
	list.Append(g2, false)
	list.Append(g3, false)
	list.Append(g4, false)

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

	flagsAppend := []cli.Flag{
		cli.Int64Flag{
			Name:  "number",
			Value: 0,
		},
		cli.BoolFlag{
			Name: "append_head",
		},
	}

	flagsDelete := []cli.Flag{
		cli.Int64Flag{
			Name:  "number",
			Value: 0,
		},
		cli.BoolFlag{
			Name: "delete_head",
		},
		cli.BoolFlag{
			Name: "delete_tail",
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
			Flags: flagsAppend,
			Action: func(c *cli.Context) error {
				var append_head bool = false

				if c.Bool("append_head") == true {
					append_head = c.Bool("append_head")
				}

				list.Append(_struct.Array{c.Int64("number")}, append_head)
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
			Flags: flagsDelete,
			Action: func(c *cli.Context) error {
				var delete_head bool = false
				var delete_tail bool = false

				if c.Bool("delete_head") == true {
					delete_head = c.Bool("delete_head")
				}
				if c.Bool("delete_tail") == true {
					delete_tail = c.Bool("delete_tail")
				}

				list.Delete(c.Int64("number"), delete_head, delete_tail)
				list.Display()
				return nil
			},
		},
		{
			Name:  "empty",
			Usage: "Empty Linked List",
			Action: func(c *cli.Context) error {
				list.IsEmpty()
				return nil
			},
		},
	}

	return app
}
