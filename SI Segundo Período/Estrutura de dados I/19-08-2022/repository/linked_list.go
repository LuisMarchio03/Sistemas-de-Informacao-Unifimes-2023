package repository

import (
	_struct "app-command-line-linked-list/struct"
	"fmt"
)

// Lista encadeada - Add / Search / Delete / Get All

type List struct {
	Head *Node
	Tail *Node
}

func (l *List) Append(arr _struct.Array) {
	// 1. Criar um novo Nó
	node := Node{Value: arr}

	// 2. Verificar se a lista está vazia, caso sim, apento
	// o Head (inicio) da lista, para a posição na memoria do Nó que foi criado a cima
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
	// Ao final (Tail) da lista o valor é nulo (nil)
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

func (l *List) Delete(number int64) {
	// Verificar, se o primeiro elemento já é o elemento que estamos buscando
	if l.Head.Value.Number == number {
		l.Head = l.Head.Next // O Primeiro elemento, recebe o proximo elemento, dessa forma removendo ele da Lista
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
	}
}

type Node struct {
	Value _struct.Array
	Next  *Node
}
