numbers = int()
list = []
proximo = 0
anterior = 0
n_l = int(input("Insira o número de nós: \n"))

while proximo < n_l:
    list += [0]
    proximo += 1
    anterior = proximo - 2
proximo = 0
while proximo < len(list):
    numbers = int(input("Digite o número do nó {}: ".format(proximo + 1)))
    list[proximo] = numbers
    proximo += 1
    anterior = proximo - 2
proximo = 0
while proximo < len(list):
    list.sort(reverse=True)
    print("Nó {}: {}".format(proximo + 1, list[proximo]))
    proximo += 1
    anterior = proximo - 2