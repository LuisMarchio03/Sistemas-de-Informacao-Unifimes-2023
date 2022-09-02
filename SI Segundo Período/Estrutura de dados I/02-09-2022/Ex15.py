numeros = int()
lista = []
proximo = 0
anterior = 0
n_l = int(input("Insira o número de nós: \n"))

while proximo < n_l:
    lista += [0]
    proximo += 1
    anterior = proximo - 2
proximo = 0
while proximo < len(lista):
    numeros = int(input("Digite o número do nó {}: ".format(proximo + 1)))
    lista[proximo] = numeros
    proximo += 1
    anterior = proximo - 2
l_m = int(input("Digite em qual vetor quer adicionar: "))
numeros = int(input("Digite o número a ser adicionado ao meio da lista: "))
lista.insert(l_m, numeros)
        
proximo = 0
while proximo < len(lista):
    
    print("Nó {}: {}".format(proximo + 1, lista[proximo]))
    proximo += 1
    anterior = proximo - 2