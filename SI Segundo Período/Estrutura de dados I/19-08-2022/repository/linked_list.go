package repository

import (
	_struct "app-command-line-linked-list/struct"
	"fmt"
)

type List struct {
	Head *Node
	Tail *Node
}

func (l *List) IsEmpty() {
	if l.Head == nil {
		fmt.Println("list vazia")
		return
	}
	fmt.Println("list não está vazia")
}

func (l *List) Append(arr _struct.Array, append_head bool) {
	// 1. Criar um novo Nó
	node := Node{Value: arr}

	if append_head == true {
		if l.Head == nil {
			l.Head = &node
		} else {
			node.Next = l.Head
			l.Head = &node
		}
		return
	}

	// 2. Verificar se a list está vazia, caso sim, apento
	// o Head (inicio) da list, para a posição na memoria do Nó que foi criado a cima
	if l.Head == nil {
		l.Head = &node
	}

	// Verifica se existe algum elemento colocado no Tail (final) do Nó
	// Caso sim, pegar o next (proximo) dele é apontar para o Nó
	if l.Tail != nil {
		l.Tail.Next = &node
	}

	// Por fim o Tail (final) passa a ser o novo Nó
	l.Tail = &node
}

func (l *List) Search(number int64) _struct.Array {
	node := l.Head

	// Verificar, caso o node seja o number que estamos buscando, vamos retornar ele

	// Verificar, caso o node seja igual a nil (nulo) já pode sair do for

	// Verificar, caso nenhuma das condições anteriores sejam atendidas, o node devera continuar buscando os dados
	// ate localizar o firstName que estamos buscando
	for node != nil {
		if node.Value.Number == number {
			// Localizou o firstname
			break
		}
		// Continuar procurando
		node = node.Next
	}

	if node != nil {
		return node.Value
	}

	return _struct.Array{}
}

func (l *List) Display() {
	node := l.Head
	// Printa todos os elementos presentes dentro do Nó.
	// Ao final (Tail) da list o valor é nulo (nil)
	for node != nil {
		fmt.Println(node.Value.Number)
		node = node.Next
	}
}

func (l *List) OrderLinkedList() {
	node := l.Head

	if node == nil {
		return
	} else {
		for node != nil {
			index := node.Next
			for index != nil {
				if node.Value.Number > index.Value.Number {
					temp := node.Value
					node.Value = index.Value
					index.Value = temp
				}
				index = index.Next
			}
			node = node.Next
		}
	}
}

func (l *List) Delete(number int64, delHead bool, delTail bool) {
	// Delete Head
	if delHead == true {
		l.Head = l.Head.Next // O Primeiro elemento, recebe o proximo elemento, dessa forma removendo ele da list
		return
	}

	// Delete Tail
	if delTail == true {
		node := l.Head
		for node.Next != nil {
			if node.Next == l.Tail {
				node.Next = nil
				l.Tail = node
				return
			}
			node = node.Next
		}
		node.Next = nil
		return
	}

	// Verificar, se o primeiro elemento já é o elemento que estamos buscando
	if l.Head.Value.Number == number {
		l.Head = l.Head.Next // O Primeiro elemento, recebe o proximo elemento, dessa forma removendo ele da list
		return
	}

	prev := l.Head
	node := l.Head.Next
	for node != nil {
		if node.Value.Number == number {
			// O Elemento entre Prev e o Next seria o elemento que estamos buscando
			// Esse elemento será removido
			prev.Next = node.Next
			break
		}
		prev = node
		node = node.Next
	}

	// No ultimo caso, se o ultimo elemento é o node
	// Então devemos apontar o ultimo elemento para o anterior
	// Dessa forma removendo o elemente que desejamos
	if l.Tail == node {
		l.Tail = prev
		return
	}

}

type Node struct {
	Value _struct.Array
	Next  *Node
}
