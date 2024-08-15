package main

import (
	"fmt"
	"math/rand"
	"sync"
	"time"
)

const (
	threshold     = 10000
	maxGoroutines = 8
)

var wg sync.WaitGroup

func quickSort(arr []int) {
	if len(arr) < 2 {
		return
	}

	pivot := arr[len(arr)/2]
	left := 0
	right := len(arr) - 1

	for left <= right {
		for arr[left] < pivot {
			left++
		}
		for arr[right] > pivot {
			right--
		}
		if left <= right {
			arr[left], arr[right] = arr[right], arr[left]
			left++
			right--
		}
	}

	if right > 0 {
		quickSort(arr[:right+1])
	}
	if left < len(arr) {
		quickSort(arr[left:])
	}
}

func parallelQuickSort(arr []int, depth int) {
	if len(arr) < threshold || depth > maxGoroutines {
		quickSort(arr)
		wg.Done()
		return
	}

	pivot := arr[len(arr)/2]
	left := 0
	right := len(arr) - 1

	for left <= right {
		for arr[left] < pivot {
			left++
		}
		for arr[right] > pivot {
			right--
		}
		if left <= right {
			arr[left], arr[right] = arr[right], arr[left]
			left++
			right--
		}
	}

	if right > 0 {
		wg.Add(1)
		go parallelQuickSort(arr[:right+1], depth+1)
	}
	if left < len(arr) {
		wg.Add(1)
		go parallelQuickSort(arr[left:], depth+1)
	}

	wg.Done()
}

func main() {
	rand.Seed(time.Now().UnixNano())

	var size int
	fmt.Print("Digite o tamanho do array (ou 0 para sair): ")
	fmt.Scan(&size)

	if size == 0 {
		return
	}

	arr := make([]int, size)
	for i := range arr {
		arr[i] = rand.Intn(size)
	}

	fmt.Println("Ordenando o array...")
	start := time.Now()

	wg.Add(1)
	parallelQuickSort(arr, 0)
	wg.Wait()

	// fmt.Printf("Array ordenado %v\n", arr)
	fmt.Printf("Array ordenado em %v\n", time.Since(start))

	fmt.Println("Pressione 'Enter' para encerrar o programa...")
	fmt.Scanln()
}
