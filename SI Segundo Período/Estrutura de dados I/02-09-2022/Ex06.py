numeros = int()
lista = []
n_l = int(input("Insira o número de nós: \n"))

for l in range(n_l):
        numeros = int(input("Digite os números a serem adicionados a lista: "))
        lista.append(numeros)

print("\nDados inseridos na lista: {}".format(lista))

l_m = int(input("Digite em qual vetor quer adicionar: "))
numeros = int(input("Digite o número a ser adicionado ao meio da lista: "))
lista.insert(l_m, numeros)
        
print("\nDados inseridos na lista: {}".format(lista))