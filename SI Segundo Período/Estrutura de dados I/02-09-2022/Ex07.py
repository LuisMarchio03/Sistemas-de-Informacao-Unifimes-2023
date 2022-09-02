numeros = int()
lista = []
n_l = int(input("Insira o número de nós: \n"))

for l in range(n_l):
        numeros = int(input("Digite os números a serem adicionados a lista: "))

        lista.append(numeros)
print("\nDados inseridos na lista: {}".format(lista))

del lista[0]

print("Dados inseridos na lista: {}".format(lista))